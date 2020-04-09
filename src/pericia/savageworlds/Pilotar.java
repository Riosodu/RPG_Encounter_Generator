package pericia.savageworlds;

import atributo.Agilidade;
import core.Pericia;

public class Pilotar extends Pericia {
	public static final String nome = "Pilotar";
	public static final String desc = "Pilotar permite a um personagem voar com " + 
			"avi�es, helic�pteros, mochilas a jato e qualquer " + 
			"outro dispositivo a�reo comum em seu cen�rio e " + 
			"hist�rico";
	
	public Pilotar() {
		super(new Agilidade());
	}
	
	public Pilotar(int nivelDado) {
		super(new Agilidade(), nivelDado);
	}
}
