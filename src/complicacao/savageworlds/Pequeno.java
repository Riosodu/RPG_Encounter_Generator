package complicacao.savageworlds;

import core.Complicacao;

public class Pequeno extends Complicacao {
	public Pequeno(String tipo) {
		super("Pequeno", "Seu personagem � muito magro, muito baixo " + 
				"ou os dois em rela��o a sua ra�a em particular. " + 
				"Subtraia 1 da sua Resist�ncia pela sua estatura " + 
				"reduzida.", tipo, "Maior");
	}
}
