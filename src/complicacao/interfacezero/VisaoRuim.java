package complicacao.interfacezero;

import core.Complicacao;

public class VisaoRuim extends Complicacao {
	public static final String nome = "Vis�o Ruim";
	public static final String desc = "Os olhos do seu her�i j� n�o s�o mais o que " + 
			"costumavam ser. Com �culos, n�o h� penalidade " + 
			"e a Complica��o � apenas Menor. Caso perca " + 
			"seus �culos (geralmente uma chance de 50% " + 
			"quando for ferido ou nenhuma chance com uma " + 
			"�al�a nerd�), sofre -2 de penalidade em qualquer " + 
			"rolagem de Caracter�stica feita para atirar ou " + 
			"Perceber alguma coisa a mais de 5 quadros (10m) " + 
			"de dist�ncia.\r\n" + 
			"Em cen�rios de baixa tecnologia, onde o her�i " + 
			"n�o possa usar �culos, ter Olhos Ruins � uma " + 
			"Complica��o Maior. Ele precisa subtrair 2 das " + 
			"rolagens de Caracter�sticas feitas para atacar ou " + 
			"perceber coisas a 5 quadros ou mais de dist�ncia." + 
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
	public static final String tipoPossivel[] = {"Menor", "Maior"};
	
	public VisaoRuim() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VisaoRuim(String tipo) {
		super(tipo);
	}
}
