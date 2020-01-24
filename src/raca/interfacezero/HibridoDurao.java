package raca.interfacezero;

import core.Raca;

public class HibridoDurao extends Raca implements Hibrido{
	private static String nome = "H�brido Dur�o";
	private static String desc = "Exemplos de Animais: Rinoceronte, Touro, Urso, Javali"
			+ "\n� Grande: H�bridos dur�es s�o maiores que humanos, e tem +1 de Tamanho."
			+ "\n� Lento: Durante e a cria��o de personagem, custa 2 pontos para aumentar"
			+ " o atributo Agilidade em 1 passo para um h�brido dur�o."
			+ "\n� S�lido: H�bridos dur�es come�am com um d6 em Vigor.";
	
	public HibridoDurao() {
		super(nome, desc);
	}
	@Override
	protected void setModificadores() {
		// TODO Auto-generated method stub

	}

}
