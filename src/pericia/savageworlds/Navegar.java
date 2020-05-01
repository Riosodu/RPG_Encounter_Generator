package pericia.savageworlds;

import atributo.Agilidade;
import core.Pericia;

public class Navegar extends Pericia {
	public static final String nome = "Navegar";
	public static final String desc = "Personagens com esta per�cia podem conduzir " + 
			"qualquer embarca��o ou navio comum em seus " + 
			"cen�rios e hist�rico de personagem. Geralmente " + 
			"tamb�m sabem como lidar com as tarefas mais " + 
			"comuns associadas a seus barcos (dar n�s, " + 
			"encordar velas, etc.).";
	
	public Navegar() {
		super(nome, desc, new Agilidade());
	}
	
	public Navegar(int nivelDado) {
		super(nome, desc, new Agilidade(), nivelDado);
	}
}
