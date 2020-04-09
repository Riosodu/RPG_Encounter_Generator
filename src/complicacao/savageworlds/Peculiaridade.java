package complicacao.savageworlds;

import core.Complicacao;

public class Peculiaridade extends Complicacao {
	public static final String nome = "Peculiaridade";
	public static final String desc = "Seu her�i tem alguma fraqueza menor, " + 
			"normalmente engra�ada, mas que ocasionalmente " + 
			"lhe causa problemas. Um espadachim " + 
			"pode sempre tentar primeiro cortar suas iniciais " + 
			"em seus inimigos antes de atacar, um an�o pode " + 
			"se vangloriar constantemente a respeito da sua " + 
			"cultura ou uma debutante esnobe pode n�o comer, " + 
			"beber ou socializar com as classes mais baixas.";
	
	public Peculiaridade(String tipo) {
		super(tipo, "Menor");
	}
}
