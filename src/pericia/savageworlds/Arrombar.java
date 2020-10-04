package pericia.savageworlds;

import core.Atributo;
import core.Pericia;

public class Arrombar extends Pericia {
	public static final String nome = "Arrombar";
	public static final String desc = "Arrombar � a habilidade de passar por travas " + 
			"mec�nicas e eletr�nicas. Arrombar tamb�m " + 
			"� usado para desarmar as iscas e gatilhos de " + 
			"armadilhas, a menos que uma per�cia mais " + 
			"relevante pare�a mais apropriada para uma " + 
			"armadilha em particular.";
	
	public Arrombar() {
		super(nome, desc, Atributo.AGILIDADE);
	}
	
	public Arrombar(int nivelDado) {
		super(nome, desc, Atributo.AGILIDADE, nivelDado);
	}
}
