package raca.interfacezero;

import core.Raca;

public class Humano2 extends Raca {
	private static final String nome = "Humano 2.0";
	private static final String desc = "\n� Habilidade Avan�ada: Voc� come�a o jogo com um atributo em d6."
			+ "\n� Arrogante: Humanos 2.0 s�o conhecidos pelos seus grandes egos. Quer trate-se de "
			+ "natureza ou de cria��o ainda est� em debate. Eles t�m a Complica��o Arrogante. "
			+ "Se voc� escolher um Arqu�tipo que j� tenha a Complica��o Arrogante, escolha "
			+ "outra Complica��o Maior."
			+ "\n� Pessoas Belas: Humanos 2.0 come�am com a Vantagem Atraente."
			+ "\n� Anomalia Gen�tica: Escolha uma caracter�stica que n�o � a sua habilidade avan�ada."
			+ " Custa 2 pontos para aumentar esse atributo em 1 dado durante e cria��o de personagem."
			+ "\n� Letrado: Escolha uma per�cia ligada a sua habilidade avan�ada. Voc� come�a o jogo "
			+ "com um d6 naquela per�cia."
			+ "\n� Sistema Imunol�gico Superior: b�nus de +4 para resistir efeitos de doen�as.";
	
	public Humano2() {
		super(nome, desc);
	}
	@Override
	protected void setModificadores() {
		// TODO Auto-generated method stub

	}

}
