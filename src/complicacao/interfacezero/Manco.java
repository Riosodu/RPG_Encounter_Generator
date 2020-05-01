package complicacao.interfacezero;

import core.Complicacao;

public class Manco extends Complicacao {
	public static final String nome = "Manco";
	public static final String desc = "Um ferimento do passado quase aleijou seu " + 
			"her�i. Sua Movimenta��o b�sica � reduzida " + 
			"em 2 e ele rola apenas um d4 para correr. A " + 
			"Movimenta��o de um personagem nunca pode " + 
			"ser reduzida abaixo de 1." + "No mundo de Interface Zero 2.0, a medicina avan�ou ao " + 
			"ponto em que a Complica��o listada " + 
			"acima pode ser removida com um simples procedimento " + 
			"m�dico. Por causa disso, qualquer personagem que assuma " + 
			"essas Complica��es na cria��o de personagem, e ent�o " + 
			"usa Aprimoramentos em jogo para remov�-las, tamb�m " + 
			"deve gastar um Progresso. Aqueles que assumem essas " + 
			"Complica��es na cria��o de personagem n�o podem anular " + 
			"os seus efeitos com Aprimoramentos durante a cria��o de " + 
			"personagem.";
	public static final String tipoPossivel[] = {"Maior"};
	
	public Manco() {
		super(nome, desc, tipoPossivel);
	}

	public Manco(String tipo) {
		super(nome, desc, tipoPossivel, tipo);
	}
}
