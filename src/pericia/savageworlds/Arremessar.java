package pericia.savageworlds;

import core.Pericia;

public class Arremessar extends Pericia {
	private static String desc = "Arremessar governa todos os tipos de armas de " + 
			"arremesso, de granadas de m�o a facas, machados e " + 
			"lan�as. Arremessar funciona de maneira similar � " + 
			"per�cia Atirar e utiliza os mesmos modificadores, " + 
			"incluindo aqueles a dist�ncia. A Cad�ncia de Tiro " + 
			"de um ataque de arremesso � de 1 por m�o. Deste " + 
			"modo, um personagem humano pode arremessar dois itens de uma s� vez, um com cada m�o, "
			+ "sofrendo as penalidades habituais de a��o m�ltipla " + 
			"e m�o in�bil.";
	
	public Arremessar() {
		super("Arremessar", desc , new atributo.Agilidade());
	}
	
	public Arremessar(int nivelDado) {
		super("Arremessar", desc, new atributo.Agilidade(), nivelDado);
	}
}
