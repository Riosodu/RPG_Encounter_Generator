package pericia.savageworlds;

import core.Pericia;

public class Provocar extends Pericia {
	private static String desc = "Provocar � um Teste de Vontade contra o orgulho " + 
			"de uma pessoa atrav�s de zombaria, piadas cru�is " + 
			"ou humilha��o. � uma rolagem resistida contra " + 
			"a Ast�cia do inimigo.";
	
	public Provocar() {
		super("Provocar", desc, new atributo.Astucia());
	}
	
	public Provocar(int nivelDado) {
		super("Provocar", desc, new atributo.Astucia(), nivelDado);
	}
}
