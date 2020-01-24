package raca.interfacezero;

import core.Raca;

public class Humano extends Raca {
	private static final String nome = "Humano";
	private static final String desc = "A despeito de todas as escolhas e novas ra�as andando " + 
			"por a�, os homo-sapiens normais ainda dominam o planeta. " + 
			"Humanos s�o criaturas duras e adapt�veis, que encaram" + 
			"a adversidade de frente. Enquanto eles podem n�o ter " + 
			"algumas das vantagens dos seus pares aprimorados, " + 
			"humanos sobrevivem sendo mais adapt�veis. " + 
			"\n� Adaptabilidade: Humanos come�am com uma Vantagem " + 
			"extra.";
	
	public Humano() {
		super(nome, desc);
	}

	@Override
	protected void setModificadores() {
		// TODO Auto-generated method stub
		
	}
}
