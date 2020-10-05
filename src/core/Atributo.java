package core;

public enum Atributo implements Checavel {
	AGILIDADE("Agilidade", "AGILIDADE � a rapidez, velocidade e " + "destreza do seu her�i."),

	ASTUCIA("Ast�cia", "AST�CIA � uma medida de qu�o bem seu "
			+ "personagem conhece seu mundo e sua cultura, " + "qu�o bem planeja os seus passos e a sua agilidade "
			+ "mental."),

	ESPIRITO("Esp�rito", "ESP�RITO reflete sabedoria interior e for�a " +
			"de vontade. Esp�rito � muito importante, pois " + "ajuda seu personagem a " +
			"se recuperar do estado " + "Abalado"),

	FORCA("For�a", "FOR�A representa for�a bruta e aptid�o f�sica " +
			"no geral. For�a tamb�m � usada para gerar o dano " +
			"do seu guerreiro em combate corpo a corpo."),

	VIGOR("Vigor", "VIGOR representa a toler�ncia, resist�ncia " +
			"a doen�as, venenos ou toxinas e quanta dor e " +
			"dano f�sico um her�i pode suportar.");


	private final Identidade id;
	private int modificadorDado;
	private int nivelDado;
	
	Atributo(String nome, String descricao) {
		id = new Identidade(nome, descricao);
		setNivelDado(4);
	}

	public void setNivelDado(int nivel) throws IllegalArgumentException {
		if ((nivel % 2) == 0 && nivel >= 4)
			if (nivel <= 12)
				nivelDado = nivel;
			else {
				nivelDado = 12;
				modificadorDado = (nivel - nivelDado) / 2;
			}
		else
			throw new IllegalArgumentException("\"nivel\" deve ser par e maior ou igual a 4");
	}

	public void setModificadorDado(int modificador) {
		modificadorDado = modificador;
	}

	public static Atributo[] getAtributosAleatorios() {
		Atributo[] atributos = Atributo.values();
		for(Atributo x: atributos) {
			x.setNivelDado(Util.arredondarParaProximoPar(Math.random() * 8) + 4);
		}

		return atributos;
	}

	public static Atributo getAleatorio(Atributo a) {
		a.setNivelDado(Util.arredondarParaProximoPar(Math.random() * 8) + 4);
		return a;
	}

	public Identidade getId() {
		return id;
	}

	public int getNivelDado() {
		return nivelDado;
	}

	public int getModificadorDado() {
		return modificadorDado;
	}

	@Override
	public boolean check(NPC npc) {
		boolean possuiAtributo = false;

		for(Atributo x: npc.getAtributos()) {
			if(x.getId() == this.getId()) {
				if(x.getNivelDado() >= this.getNivelDado())
					return true;
			}
		}
		return false;
	}

	public String toString() {
		return id.toString();
	}
}
