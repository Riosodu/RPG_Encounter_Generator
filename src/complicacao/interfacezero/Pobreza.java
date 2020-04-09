package complicacao.interfacezero;

import core.Complicacao;

public class Pobreza extends Complicacao {
	public static final String nome = "Pobreza";
	public static final String desc = "� dito que um tolo e seu dinheiro logo se " + 
			"separam. Seu her�i � esse tolo. Ele come�a com " + 
			"metade do dinheiro normal para o seu cen�rio " + 
			"e parece n�o conseguir poupar os recursos " + 
			"adquiridos do in�cio do jogo. No geral, o jogador " + 
			"reduz a metade os seus recursos totais a cada " + 
			"semana de jogo.";
	
	public Pobreza(String tipo) {
		super(tipo, "Maior");
	}
}
