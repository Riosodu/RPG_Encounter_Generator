package pericia.savageworlds;

import core.Atributo;
import core.Pericia;

public class Provocar extends Pericia {
	public static final String nome = "Provocar";
	public static final String desc = "Provocar � um Teste de Vontade contra o orgulho " + 
			"de uma pessoa atrav�s de zombaria, piadas cru�is " + 
			"ou humilha��o. � uma rolagem resistida contra " + 
			"a Ast�cia do inimigo.";
	
	public Provocar() {
		super(nome, desc, Atributo.ASTUCIA);
	}
	
	public Provocar(int nivelDado) {
		super(nome, desc, Atributo.ASTUCIA, nivelDado);
	}
}
