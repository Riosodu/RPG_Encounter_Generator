package pericia.savageworlds;

import core.Pericia;

public class Pilotar extends Pericia {
	private static String desc = "Pilotar permite a um personagem voar com " + 
			"avi�es, helic�pteros, mochilas a jato e qualquer " + 
			"outro dispositivo a�reo comum em seu cen�rio e " + 
			"hist�rico";
	
	public Pilotar() {
		super("Pilotar", desc, new atributo.Agilidade());
	}
	
	public Pilotar(int nivelDado) {
		super("Pilotar", desc, new atributo.Agilidade(), nivelDado);
	}
}
