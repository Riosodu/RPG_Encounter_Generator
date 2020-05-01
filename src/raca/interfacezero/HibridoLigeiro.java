package raca.interfacezero;

import core.Raca;

public class HibridoLigeiro extends Raca implements Hibrido {
	private static final String nome = "H�brido Ligeiro";
	private static final String desc = "Exemplos de Animais: Raposa, Falc�o, Mangusto, Macaco, Cobra"
			+ "\n� �gil: H�bridos ligeiros come�am com um d6 em Agilidade."
			+ "\n� R�pido: H�bridos ligeiros come�am com com uma Movimenta��o b�sica de 10 quadros."
			+ "\n� Fr�gil: H�bridos ligeiros tendem a ter uma constitui��o fr�gil e tem -1 em Resist�ncia.";
	
	public HibridoLigeiro()	{
		super(nome, desc);
	}
	
}
