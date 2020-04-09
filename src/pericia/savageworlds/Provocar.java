package pericia.savageworlds;

import atributo.Astucia;
import core.Pericia;

public class Provocar extends Pericia {
	public static final String nome = "Provocar";
	public static final String desc = "Provocar � um Teste de Vontade contra o orgulho " + 
			"de uma pessoa atrav�s de zombaria, piadas cru�is " + 
			"ou humilha��o. � uma rolagem resistida contra " + 
			"a Ast�cia do inimigo.";
	
	public Provocar() {
		super(new Astucia());
	}
	
	public Provocar(int nivelDado) {
		super(new Astucia(), nivelDado);
	}
}
