package complicacao.savageworlds;

import core.Complicacao;

public class Idoso extends Complicacao {
	public static final String nome = "Idoso";
	public static final String desc = "Seu her�i est� ficando velho, mas n�o " + 
			"est� totalmente pronto para o asilo. Sua " + 
			"Movimenta��o � reduzida em 1 e sua For�a " + 
			"e Vigor caem um tipo de dado at� um " + 
			"m�nimo de d4 e n�o podem ser aumentados " + 
			"posteriormente. " + 
			"Por outro lado, a sabedoria dos seus anos " + 
			"concede ao her�i 5 pontos de per�cia adicionais " + 
			"que podem ser usados em quaisquer per�cias " + 
			"associadas � Ast�cia.";
	public static final String tipoPossivel[] = {"Maior"};
	
	public Idoso() {
		
	}
	
	public Idoso(String tipo) {
		super(tipo);
	}
}
