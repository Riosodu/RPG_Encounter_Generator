package complicacao.savageworlds;

import core.Complicacao;

public class Fobia extends Complicacao {
	public static final String nome = "Fobia";
	public static final String desc = "Fobias s�o medos esmagadores e irracionais " + 
			"que permanecem com o her�i pelo resto da sua " + 
			"vida. Sempre que um personagem estiver na " + 
			"presen�a de sua fobia, subtraia 2 de todos os testes " + 
			"de Caracter�stica no caso de uma Complica��o " + 
			"Menor e 4 se o medo for uma Fobia Maior. " + 
			"Fobias n�o devem ser muito �bvias � todos " + 
			"devem temer vampiros, por exemplo. Sendo " + 
			"assim, isso n�o � uma fobia � � senso comum. " + 
			"Ao inv�s disso, a fobia geralmente se concentra " + 
			"em algum elemento aleat�rio focado pela " + 
			"mente durante qualquer que seja o encontro " + 
			"causador deste terror. Lembre, fobias s�o medos " + 
			"irracionais.";
	
	public Fobia(String tipo) {
		super(tipo, "Menor", "Maior");
	}
}
