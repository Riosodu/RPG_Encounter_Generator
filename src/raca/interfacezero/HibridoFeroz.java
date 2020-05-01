package raca.interfacezero;

import core.Raca;

public class HibridoFeroz extends Raca implements Hibrido {
	private static final String nome = "H�brido Feroz";
	private static final String desc = "Exemplos de Animais: Ratel, Tigre, lobo"
			+ "\n� Irasc�vel: H�bridos Ferozes sofrem uma penalidade de -2 em "
			+ "Testes de Vontade para resistir a Provocar. Em uma falha cr�tica, "
			+ "o h�brido ataca o provocador."
			+ "\n Sentidos Agu�ados: +2 em testes de Notar com um sentido a "
			+ "escolha do jogador."
			+ "\n� Parrudo: H�bridos Ferozes come�am com um d6 em For�a."
			+ "\n� Arma Natural: H�bridos Ferozes nunca s�o considerados desarmados "
			+ "e causam For+d6 de dano quando fazem um ataque desarmado.";
	
	public HibridoFeroz() {
		super(nome, desc);
	}
	

}
