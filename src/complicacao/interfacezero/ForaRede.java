package complicacao.interfacezero;

import core.Complicacao;

public class ForaRede extends Complicacao {
	public static final String nome = "Fora da Rede";
	public static final String desc = "De um jeito ou de outro, este personagem conseguiu " + 
			"permanecer ou se tornou n�o registrado. Talvez o seu nascimento " + 
			"por alguma raz�o nunca tenha sido registrado; talvez " + 
			"ele (ou outra pessoa) apagou todos os seus registros oficiais. " + 
			"Qualquer que seja o caso, at� onde o resto do mundo sabe, " + 
			"ele n�o existe. O lado bom �, isso torna o personagem realmente" + 
			"dif�cil de ser rastreado; o lado ruim � que tamb�m " + 
			"� imposs�vel fazer qualquer coisa legalmente � como " + 
			"comprar um carro, abrir uma conta banc�ria, ou arrumar " + 
			"um emprego normal. Ele tamb�m � um alvo prim�rio para " + 
			"corpora��es procurando uma cobaia que ningu�m dar� por " + 
			"falta, caso desapare�a. O Mestre tem a palavra final, mas a " + 
			"regra geralmente aceita � que qualquer coisa requerendo " + 
			"uma identidade ou que n�o pode ser realizada com uma " + 
			"transa��o em dinheiro, basicamente n�o pode ser feita. " + 
			"Se um personagem tem a Vantagem Identidade Alternativa, " + 
			"ele pode usar sua outra identidade para realizar essas " + 
			"coisas. Mas, se a identidade do personagem for revelada " + 
			"como falsa, seus recursos ser�o congelados no banco, ele " + 
			"pode ser demitido do seu trabalho e at� preso, dependendo " + 
			"das circunst�ncias. Em outras palavras, ele volta a estaca " + 
			"zero, se n�o pior.";
	
	public ForaRede(String tipo) {
		super(tipo, "Maior");
	}
}
