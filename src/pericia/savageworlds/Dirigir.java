package pericia.savageworlds;

import core.Pericia;

public class Dirigir extends Pericia {
	private static String desc = "Dirigir permite que seu her�i conduza ve�culos " + 
			"e flutuadores terrestres comuns em seu cen�rio. " +
			"Dirigir tamb�m " + 
			"� frequentemente usado com as Regras de " + 
			"Persegui��o";
	
	public Dirigir() {
		super("Dirigir", desc, new atributo.Agilidade());
	}
	
	public Dirigir(int nivelDado) {
		super("Dirigir", desc, new atributo.Agilidade(), nivelDado);
	}
}
