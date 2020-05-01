package complicacao.interfacezero;

import core.Complicacao;

public class UmOlhoSo extends Complicacao {
	public static final String nome = "Um Olho S�";
	public static final String desc = "Seu her�i perdeu um olho por alguma raz�o " + 
			"desafortunada. Se n�o usar um tapa-olho ou " + 
			"comprar um substituto de vidro (normalmente " + 
			"$500), sofre -1 no seu Carisma pelo ferimento " + 
			"grotesco. " + 
			"Sofre -2 em qualquer rolagem de Caracter�stica " + 
			"que exija percep��o de profundidade, como " + 
			"Arremessar ou Atirar, saltar uma ravina ou " + 
			"telhado e assim por diante." + "No mundo de Interface Zero 2.0, "
			 + "a medicina avan�ou ao " + 
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
	
	public UmOlhoSo() {
		super(nome, desc, tipoPossivel);
	}

	public UmOlhoSo(String tipo) {
		super(nome, desc, tipoPossivel, tipo);
	}
}
