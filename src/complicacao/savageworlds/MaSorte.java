package complicacao.savageworlds;

import core.Complicacao;

public class MaSorte extends Complicacao {
	public static final String nome = "M� Sorte";
	public static final String desc = "Seu her�i � um pouco menos sortudo que " + 
			"a maioria. Ele recebe um Bene a menos que o " + 
			"normal por sess�o de jogo. Um personagem n�o " + 
			"pode ter M� Sorte e Sorte simultaneamente.";
	
	public MaSorte(String tipo) {
		super(tipo, "Maior");
	}
}
