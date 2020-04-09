package complicacao.savageworlds;

import core.Complicacao;

public class Teimoso extends Complicacao {
	public static final String nome = "Teimoso";
	public static final String desc = "Este indiv�duo sempre quer as coisas do " + 
			"seu jeito e nunca admite estar errado. Mesmo " + 
			"quando � dolorosamente �bvio que cometeu " + 
			"um erro, tenta justific�-lo com meias-verdades e " + 
			"racionaliza��es.";
	
	public Teimoso(String tipo) {
		super(tipo, "Maior");
	}
}
