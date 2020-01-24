package pericia.savageworlds;

import core.Pericia;

public class Navegar extends Pericia {
	private static String desc = "Personagens com esta per�cia podem conduzir " + 
			"qualquer embarca��o ou navio comum em seus " + 
			"cen�rios e hist�rico de personagem. Geralmente " + 
			"tamb�m sabem como lidar com as tarefas mais " + 
			"comuns associadas a seus barcos (dar n�s, " + 
			"encordar velas, etc.).";
	
	public Navegar() {
		super("Navegar", desc, new atributo.Agilidade());
	}
	
	public Navegar(int nivelDado) {
		super("Navegar", desc, new atributo.Agilidade(), nivelDado);
	}
}
