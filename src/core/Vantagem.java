package core;

import requisito.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum Vantagem implements Checavel{
	RICO("Rico", "Personagens Ricos triplicam seus fundos iniciais e ganham "
			+ "um b�nus de 12,500 cr�ditos em cada Progresso. Contudo, o dinheiro sempre v�m "
			+ "com uma obriga��o. Eles podem ganhar dinheiro de um patroc�nio corporativo, "
			+ "um fundo trust ou mesmo um neg�cio que o personagem tem e administra. "
			+ "Exemplos de personagens ricos no g�nero s�o Sylvia Stingray de Bubblegum "
			+ "Crisis e logan Cale de Dark Angel; ambos tinham obriga��es (administrando "
			+ "um neg�cio, ser legal com a fam�lia) que eles cumprem a fim de manter "
			+ "seu dinheiro. Esta � uma Complica��o Voto (Menor) que voc� deve "
			+ "discutir com o seu Mestre � falhar em cumprir o Voto "
			+ "significa que o personagem n�o recebe seus cr�ditos extras at� "
			+ "que ele cuide dessas obriga��es. Se o personagem perder completamente"
			+ " os benef�cios da Vantagem, ele pode, a crit�rio do Mestre, substituir"
			+ " a Vantagem com outra coisa.",Jogo.INTERFACE_ZERO, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(0)), new RequisitoComplicacao(Complicacao.VOTO)),

	AMBIDESTRO("Ambidestro", "Seu her�i � h�bil tanto com a sua m�o " +
			"esquerda quanto com a sua direita. Personagens " +
			"normalmente sofrem uma penalidade de -2 ao " +
			"executar tarefas f�sicas utilizando a m�o in�bil " +
			"(presume-se que personagens sejam destros). Com " +
			"esta Vantagem, seu her�i ignora a penalidade de -2 " +
			"por usar sua m�o in�bil", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(0))
			),

	ANTECEDENTE_ARCANO("Antecedente Arcano", "Esta � a Vantagem que o seu personagem precisa " +
			"comprar para ter qualquer tipo de habilidade " +
			"m�gica, ps�quica ou sobrenatural.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(0))),

	ATRAENTE("Atraente", "N�o � segredo que pessoas bonitas t�m mais " +
			"facilidade em seguir o seu caminho na vida. " +
			"Esta Vantagem concede +2 no Carisma do seu " +
			"personagem belo ou atraente.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(0)),
			new RequisitoAtributo(Atributo.VIGOR, 6)),

	CORAJOSO("Corajoso", "Aqueles com esta Vantagem aprenderam " +
			"a dominar o seu medo. Ou talvez estejam t�o " +
			"calejados ou emocionalmente distantes que " +
			"perderam sua rea��o normal de �lutar ou correr�. " +
			"De qualquer maneira, seu her�i adiciona +2 a " +
			"testes de Medo. Caso o personagem esteja em " +
			"um cen�rio que usa Coragem como uma Regra " +
			"de Ambienta��o, o b�nus � adicionado � per�cia " +
			"tamb�m.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(0)),
			new RequisitoAtributo(Atributo.ESPIRITO, 6)),

	CURA_RAPIDA("Cura R�pida", "Alguns indiv�duos parecem se curar mais " +
			"rapidamente que os outros. Aqueles com esta " +
			"ben��o adicionam +2 a suas rolagens de Vigor " +
			"em seus testes para cura natural. Veja a p�gina " +
			"101 para regras completas de Cura.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(0)),
			new RequisitoAtributo(Atributo.VIGOR, 8)),

	FURIOSO("Furioso", "Logo ap�s sofrer um ferimento (incluindo um " +
			"resultado de Abalado por dano f�sico), seu her�i " +
			"precisa fazer uma rolagem de Ast�cia ou entrar� " +
			"em f�ria. " +
			"Enquanto em f�ria, seu Aparar � reduzido " +
			"em 2, mas adiciona +2 em todas as rolagens de " +
			"Lutar, For�a, dano de combate corpo a corpo " +
			"e Resist�ncia. O guerreiro ignora todos os " +
			"modificadores de ferimento enquanto em f�ria, " +
			"mas n�o pode usar quaisquer per�cias, Vantagens " +
			"ou manobras que exijam concentra��o, incluindo " +
			"Atirar e Provocar, exceto Intimidar. " +
			"Furiosos atacam de forma imprudente. " +
			"Sempre que seu dado de Lutar for um 1 " +
			"(independente do seu Dado Selvagem), ele " +
			"atinge um alvo adjacente aleat�rio (n�o o alvo " +
			"original). O ataque pode atingir tanto um amigo " +
			"quanto um inimigo. Se n�o houver outros alvos " +
			"adjacentes, o golpe simplesmente erra. " +
			"O personagem pode encerrar sua f�ria n�o " +
			"fazendo nada (nem mesmo se mover) por uma " +
			"a��o completa e efetuando uma rolagem de " +
			"Ast�cia com -2.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(0))),

	LIGEIRO("Ligeiro", "A Movimenta��o do her�i � aumentada em " +
			"+2 e ele rola um d10 ao inv�s de um d6 para " +
			"correr.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(0)),
			new RequisitoAtributo(Atributo.AGILIDADE, 6)),

	LINGUISTA("Linguista", "O personagem possui um ouvido para idiomas " +
			"e um talento raro para reconhecer similaridades " +
			"entre eles. Um personagem com esta Vantagem " +
			"come�a com um n�mero de idiomas igual a " +
			"seu dado de Ast�cia e pode fazer uma rolagem " +
			"33 " +
			"de Ast�cia com -2 para se fazer entender em " +
			"qualquer idioma ou dialeto que tenha ouvido ser " +
			"falado por pelo menos uma semana.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(0)),
			new RequisitoAtributo(Atributo.ASTUCIA, 6)),

	MUITO_ATRAENTE("Muito Atraente", "Seu her�i � lindo de morrer. O seu Carisma � " +
			"aumentado em +4.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(0)),
			new RequisitoVantagem(Vantagem.ATRAENTE)),

	MUSCULOSO("Musculoso", "O seu lutador � muito grande ou talvez apenas " +
			"esteja em boa forma. Sua massa resiste a dano " +
			"melhor que a da maioria e adiciona +1 a sua " +
			"Resist�ncia. Al�m disso, o personagem pode " +
			"carregar mais do que o proporcional a sua For�a: " +
			"quatro vezes a sua For�a em quilos sem penalidade " +
			"ao inv�s do normal de 2,5 vezes a sua For�a.", Jogo.SAVAGE_WORLDS,
			TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(0)),
			new RequisitoAtributo(Atributo.FORCA, 6),
			new RequisitoAtributo(Atributo.VIGOR, 6)),

	NOBRE("Nobre", "Aqueles nascidos de sangue nobre t�m " +
			"muitos privil�gios na vida, mas frequentemente " +
			"possuem tamb�m muitas responsabilidades. " +
			"Nobres possuem posi��o elevada em suas " +
			"sociedades, t�m direto a tratamento especial " +
			"de seus inimigos, recebem +2 de Carisma e " +
			"tamb�m possuem a Vantagem Rico. Isso d� ao " +
			"her�i diversas Vantagens pelo pre�o de uma, mas " +
			"as responsabilidades mais do que compensam " +
			"os privil�gios adicionais. Nobres normalmente " +
			"possuem tropas sob o seu comando, bem como " +
			"uma terra, uma casa de sua fam�lia e outras " +
			"posses. Tudo isso deve ser determinado pelo " +
			"Mestre e equilibrado pelos s�rios encargos " +
			"enfrentados pelo personagem. " +
			"Como exemplo, um personagem em " +
			"uma campanha de fantasia poderia ter uma " +
			"companhia de espadachins, um pequeno forte e " +
			"mesmo uma espada m�gica herdada de seu pai. " +
			"Entretanto, tamb�m teria uma regi�o inteira " +
			"para administrar, criminosos para julgar, justi�a " +
			"para aplicar e um vizinho invejoso cobi�ando a " +
			"sua terra e constantemente conspirando contra " +
			"ele na corte.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(0))),

	PRONTIDAO("Prontidao", "Pouca coisa passa pelo seu her�i. Ele � muito " +
			"observador e perceptivo, e adiciona +2 a suas " +
			"rolagens de Perceber para ouvir, ver ou sentir o " +
			"mundo a seu redor de qualquer outra maneira.", Jogo.SAVAGE_WORLDS,
			TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(0))),

	RAPIDO("R�pido", "Personagens r�pidos possuem reflexos velozes " +
			"como um raio e uma cabe�a fria. Sempre que " +
			"voc� sacar um 5 ou menos em combate, voc� " +
			"pode descartar e sacar de novo at� pegar uma " +
			"carta superior a 5. " +
			"Personagens com ambas as Vantagens " +
			"Equilibrado e R�pido sacam suas cartas adicionais " +
			"e pegam a melhor. Se esta carta for um Cinco ou " +
			"menor, a Vantagem R�pido pode ser usada para " +
			"sacar uma substituta at� sair um Seis ou maior.", Jogo.SAVAGE_WORLDS,
			TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(0))),

	RESISTENCIA_ARCANA("Resist�ncia Arcana", "Este indiv�duo � particularmente resistente " +
			"a magia (inclusive psiquismo, ci�ncia estranha, " +
			"etc.), seja por natureza ou herdado. Ele age como  " +
			"se tivesse 2 pontos de Armadura quando for " +
			"atingido por poderes arcanos causadores de dano e " +
			"adiciona +2 a suas rolagens de Caracter�sticas para " +
			"resistir a poderes opostos. Mesmo poderes arcanos " +
			"amig�veis precisam subtrair esse modificador para " +
			"afetar o her�i resistente.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(0)),
			new RequisitoAtributo(Atributo.ESPIRITO, 8)),

	RESISTENCIA_ARCANA_APRIMORADA("Resist�ncia Arcana Aprimorada", "Este indiv�duo � particularmente resistente " +
			"a magia (inclusive psiquismo, ci�ncia estranha, " +
			"etc.), seja por natureza ou herdado. Ele age como " +
			"se tivesse 4 pontos de Armadura quando for " +
			"atingido por poderes arcanos causadores de dano e " +
			"adiciona +4 a suas rolagens de Caracter�sticas para " +
			"resistir a poderes opostos. Mesmo poderes arcanos " +
			"amig�veis precisam subtrair esse modificador para " +
			"afetar o her�i resistente.", Jogo.SAVAGE_WORLDS, TipoVantagem.VANTAGEM_ANTECEDENTE,
			new RequisitoProgresso(new Progresso(0)),
			new RequisitoVantagem(RESISTENCIA_ARCANA));

	private final Identidade id;
	private final TipoVantagem tipo;
	private final List<Requisito> requisitos;
	private String especializacao;

	
	Vantagem(String nome, String descricao, Jogo jogo, TipoVantagem tipo,
			 Requisito ... requisitos) {

		id = new Identidade(nome, descricao);
		this.tipo = tipo;
		this.requisitos = new ArrayList<>();
		Collections.addAll(this.requisitos, requisitos);
	}

	public Identidade getId() {
		return id;
	}

	public TipoVantagem getTipo() {
		return tipo;
	}

	public List<Requisito> getRequisitos() {
		return requisitos;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public static Vantagem getAleatoria() {
		int random = (int) (Math.random() * Vantagem.values().length);

		return Vantagem.values()[random];
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}

	public String toString() {
		return id.toString();
	}

	@Override
	public boolean check(NPC npc) {
		return npc.getVantagens().contains(this);
	}
}
