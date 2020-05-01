package complicacao.savageworlds;

import core.Complicacao;

public class Leal extends Complicacao {
	public static final String nome = "Leal";
	public static final String desc = "Seu personagem pode n�o ser um her�i, " + 
			"mas daria a sua vida pelos seus amigos. Esse " + 
			"personagem nunca pode deixar um homem para " + 
			"tr�s se houver qualquer chance dele poder ajudar.";
	public static final String tipoPossivel[] = {"Menor"};
	
	public Leal() {
		super(nome, desc, tipoPossivel);
	}
	
	public Leal(String tipo) {
		super(nome, desc, tipoPossivel, tipo);
	}
}
