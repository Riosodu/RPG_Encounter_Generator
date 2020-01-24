package complicacao.interfacezero;

import core.Complicacao;

public class UmBracoSo extends Complicacao {
	public UmBracoSo(String tipo) {
		super("Um Bra�o S�", "Seja de nascimento ou devido a uma batalha, " + 
				"seu her�i perdeu um bra�o. Por sorte, o seu " + 
				"outro � (agora) o bra�o �bom�. Tarefas que " + 
				"requerem duas m�os, como Escalar, sofrem -4 de " + 
				"penalidade.\n\n" + "No mundo de Interface Zero 2.0, a medicina avan�ou ao " + 
				"ponto em que a Complica��o listada " + 
				"acima pode ser removida com um simples procedimento " + 
				"m�dico. Por causa disso, qualquer personagem que assuma " + 
				"essas Complica��es na cria��o de personagem, e ent�o " + 
				"usa Aprimoramentos em jogo para remov�-las, tamb�m " + 
				"deve gastar um Progresso. Aqueles que assumem essas " + 
				"Complica��es na cria��o de personagem n�o podem anular " + 
				"os seus efeitos com Aprimoramentos durante a cria��o de " + 
				"personagem.", tipo, "Maior");
	}
}
