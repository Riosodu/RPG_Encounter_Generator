package complicacao.savageworlds;

import core.Complicacao;

public class Pequeno extends Complicacao {
	public static final String nome = "Pequeno";
	public static final String desc = "Seu personagem � muito magro, muito baixo " + 
			"ou os dois em rela��o a sua ra�a em particular. " + 
			"Subtraia 1 da sua Resist�ncia pela sua estatura " + 
			"reduzida.";
	
	public Pequeno(String tipo) {
		super(tipo, "Maior");
	}
}
