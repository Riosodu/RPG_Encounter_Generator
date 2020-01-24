package complicacao.interfacezero;

import core.Complicacao;

public class Feio extends Complicacao {
	public Feio(String tipo) {
		super("Feio", "Infelizmente, este indiv�duo acertou mais que " + 
				"alguns galhos de feiura na sua viagem de descida " + 
				"da �rvore da vida. Seu Carisma � reduzido em 2 " + 
				"e geralmente � rejeitado por membros do sexo " + 
				"oposto.\n\n" + "No mundo de Interface Zero 2.0, a medicina avan�ou ao " + 
				"ponto em que a Complica��o listada " + 
				"acima pode ser removida com um simples procedimento " + 
				"m�dico. Por causa disso, qualquer personagem que assuma " + 
				"essas Complica��es na cria��o de personagem, e ent�o " + 
				"usa Aprimoramentos em jogo para remov�-las, tamb�m " + 
				"deve gastar um Progresso. Aqueles que assumem essas " + 
				"Complica��es na cria��o de personagem n�o podem anular " + 
				"os seus efeitos com Aprimoramentos durante a cria��o de " + 
				"personagem.", tipo, "Menor");
	}
}
