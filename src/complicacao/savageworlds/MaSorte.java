package complicacao.savageworlds;

import core.Complicacao;

public class MaSorte extends Complicacao {
	public MaSorte(String tipo) {
		super("M� Sorte", "Seu her�i � um pouco menos sortudo que " + 
				"a maioria. Ele recebe um Bene a menos que o " + 
				"normal por sess�o de jogo. Um personagem n�o " + 
				"pode ter M� Sorte e Sorte simultaneamente.", tipo, "Maior");
	}
}
