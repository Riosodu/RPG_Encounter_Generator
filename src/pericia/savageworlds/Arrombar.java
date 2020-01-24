package pericia.savageworlds;

import core.Pericia;

public class Arrombar extends Pericia {
	private static String desc = "Arrombar � a habilidade de passar por travas " + 
			"mec�nicas e eletr�nicas. Arrombar tamb�m " + 
			"� usado para desarmar as iscas e gatilhos de " + 
			"armadilhas, a menos que uma per�cia mais " + 
			"relevante pare�a mais apropriada para uma " + 
			"armadilha em particular.";
	
	public Arrombar() {
		super("Arrombar", desc, new atributo.Agilidade());
	}
	
	public Arrombar(int nivelDado) {
		super("Arrombar", desc, new atributo.Agilidade(), nivelDado);
	}
}
