package complicacao.savageworlds;

import core.Complicacao;

public class Delirante extends Complicacao {
	public static final String nome = "Delirante";
	public static final String desc = "Seu her�i acredita em algo considerado muito " + 
			"estranho por todos os outros. Del�rios Menores " + 
			"s�o inofensivos ou o personagem normalmente os " + 
			"guarda para si mesmo (o governo colocou sedativos " + 
			"em refrigerantes, c�es podem falar, somos todos " + 
			"apenas personagens de algum jogo bizarro etc.). " + 
			"Com Del�rios Maiores, ele frequentemente " + 
			"expressa seu ponto de vista sobre a situa��o e isso " + 
			"pode eventualmente lev�-lo ao perigo (o governo " + 
			"� comandado por alien�genas, os hospitais s�o " + 
			"mortais, eu sou al�rgico a armaduras, zumbis s�o " + 
			"meus amigos).";
	
	public Delirante(String tipo) {
		super(tipo, "Menor", "Maior");
	}
}
