package pericia.savageworlds;

import core.Pericia;

public class Investigar extends Pericia {
	private static String desc = "Um personagem treinado em Investigar sabe " + 
			"como fazer bom uso de bibliotecas, manchetes de " + 
			"jornais, internet ou outros recursos escritos de " + 
			"informa��o. Para obter informa��es de pessoas " + 
			"ao inv�s de livros e computadores, use a per�cia " + 
			"Manha.";
	
	public Investigar() {
		super("Investigar", desc, new atributo.Astucia());
	}
	
	public Investigar(int nivelDado) {
		super("Investigar", desc, new atributo.Astucia(), nivelDado);
	}
}