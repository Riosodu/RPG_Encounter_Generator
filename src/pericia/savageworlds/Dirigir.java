package pericia.savageworlds;

import atributo.Agilidade;
import core.Pericia;

public class Dirigir extends Pericia {
	public static final String nome = "Dirigir";
	public static final String desc = "Dirigir permite que seu her�i conduza ve�culos " + 
			"e flutuadores terrestres comuns em seu cen�rio. " +
			"Dirigir tamb�m " + 
			"� frequentemente usado com as Regras de " + 
			"Persegui��o";
	
	public Dirigir() {
		super(nome, desc, new Agilidade());
	}
	
	public Dirigir(int nivelDado) {
		super(nome, desc, new Agilidade(), nivelDado);
	}
}
