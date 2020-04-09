package complicacao.interfacezero;

import core.Complicacao;

public class Cego extends Complicacao {
	public static final String nome = "Cego";
	public static final String desc = "O indiv�duo � completamente cego. Ele sofre " +
			"-6 em todas as tarefas f�sicas dependentes da vis�o " + 
			"(ou seja, praticamente tudo) e -2 na maior parte das " + 
			"tarefas sociais, pois n�o pode �ler� quem interage " + 
			"com ele t�o bem como os outros. " + 
			"Por outro lado, personagens Cegos ganham uma " + 
			"Vantagem gratuita a sua escolha para compensar " + 
			"esta Complica��o particularmente dif�cil.\n\n" +
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
	public Cego(String tipo) {
		super(tipo, "Maior");
	}
}
