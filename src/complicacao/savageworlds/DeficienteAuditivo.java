package complicacao.savageworlds;

import core.Complicacao;

public class DeficienteAuditivo extends Complicacao {
	public DeficienteAuditivo(String tipo) {
		super("Deficiente Auditivo", "Personagens que perderam parte ou toda a " + 
				"sua audi��o t�m esta desvantagem. Como uma " + 
				"Complica��o Menor, ela subtrai 2 de todas as " + 
				"rolagens de Perceber feitas para ouvir, incluindo " + 
				"acordar devido a ru�dos altos. Uma Complica��o " + 
				"maior significa que o personagem � surdo. Ele n�o " + 
				"pode ouvir e falha automaticamente em todas as " + 
				"rolagens de Perceber dependentes da audi��o.\n\n" +
				"No mundo de Interface Zero 2.0, a medicina avan�ou ao " + 
				"ponto em que a Complica��o listada " + 
				"acima pode ser removida com um simples procedimento " + 
				"m�dico. Por causa disso, qualquer personagem que assuma " + 
				"essas Complica��es na cria��o de personagem, e ent�o " + 
				"usa Aprimoramentos em jogo para remov�-las, tamb�m " + 
				"deve gastar um Progresso. Aqueles que assumem essas " + 
				"Complica��es na cria��o de personagem n�o podem anular " + 
				"os seus efeitos com Aprimoramentos durante a cria��o de " + 
				"personagem.", tipo, "Menor", "Maior");
	}
}
