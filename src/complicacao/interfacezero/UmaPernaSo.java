package complicacao.interfacezero;

import core.Complicacao;

public class UmaPernaSo extends Complicacao {
	public static final String nome = "Uma Perna S�";
	public static final String desc = "Com uma pr�tese, Uma Perna age exatamente " + 
			"como na Complica��o Manco, reduzindo a " + 
			"Movimenta��o em 2 e as rolagens de corrida " + 
			"s�o feitas com um d4. Sem uma pr�tese, " + 
			"a Movimenta��o do Personagem � 2 e ele " + 
			"nunca pode correr. Ele tamb�m sofre -2 em " + 
			"Caracter�sticas que exijam mobilidade, como " + 
			"Escalar e Lutar. Um personagem com uma perna " + 
			"tamb�m sofre uma penalidade de -2 em sua " + 
			"per�cia Nadar (e Movimenta��o)." + 
			"No mundo de Interface Zero 2.0, a medicina avan�ou ao " + 
			"ponto em que a Complica��o listada " + 
			"acima pode ser removida com um simples procedimento " + 
			"m�dico. Por causa disso, qualquer personagem que assuma " + 
			"essas Complica��es na cria��o de personagem, e ent�o " + 
			"usa Aprimoramentos em jogo para remov�-las, tamb�m " + 
			"deve gastar um Progresso. Aqueles que assumem essas " + 
			"Complica��es na cria��o de personagem n�o podem anular " + 
			"os seus efeitos com Aprimoramentos durante a cria��o de " + 
			"personagem.";
	
	public UmaPernaSo(String tipo) {
		super(tipo, "Maior");
	}
}
