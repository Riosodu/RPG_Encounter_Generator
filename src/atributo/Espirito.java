package atributo;

import core.Atributo;

public class Espirito extends Atributo {
	public static final String nome = "Esp�rito";
	public static final String desc = "ESP�RITO reflete sabedoria interior e for�a " + 
			"de vontade. Esp�rito � muito importante, pois " + 
			"ajuda seu personagem a se recuperar do estado " + 
			"Abalado";
	
	public Espirito() {
		super(nome, desc);
	}
	
	public Espirito(int nivelDado) {
		super(nome, desc);
		setNivelDado(nivelDado);
	}
}
