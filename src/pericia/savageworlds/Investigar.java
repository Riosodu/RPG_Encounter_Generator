package pericia.savageworlds;

import atributo.Astucia;
import core.Pericia;

public class Investigar extends Pericia {
	public static final String nome = "Investigar";
	public static final String desc = "Um personagem treinado em Investigar sabe " + 
			"como fazer bom uso de bibliotecas, manchetes de " + 
			"jornais, internet ou outros recursos escritos de " + 
			"informa��o. Para obter informa��es de pessoas " + 
			"ao inv�s de livros e computadores, use a per�cia " + 
			"Manha.";
	
	public Investigar() {
		super(new Astucia());
	}
	
	public Investigar(int nivelDado) {
		super(new Astucia(), nivelDado);
	}
}
