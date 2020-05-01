package complicacao.savageworlds;

import core.Complicacao;

public class ExcessoConfianca extends Complicacao {
	public static final String nome = "Excesso de Confian�a";
	public static final String desc = "N�o existe nada que seu her�i n�o possa " + 
			"derrotar. Pelo menos � isso que pensa. Ele acredita " + 
			"poder fazer quase tudo e nunca quer fugir de um " + 
			"desafio. O her�i n�o � um suicida, mas certamente " + 
			"faz mais do que dita o bom senso.";
	public static final String tipoPossivel[] = {"Maior"};
	
	public ExcessoConfianca() {
		super(nome, desc, tipoPossivel);
	}
	
	public ExcessoConfianca(String tipo) {
		super(nome, desc, tipoPossivel, tipo);
	}
}
