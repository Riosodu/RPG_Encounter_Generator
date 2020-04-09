package complicacao.savageworlds;

import core.Complicacao;

public class SemNocao extends Complicacao {
	public static final String nome = "Sem No��o";
	public static final String desc = "Seu her�i n�o � t�o consciente de seu mundo " + 
			"quanto a maioria das pessoas. Ele sofre -2 em " + 
			"rolagens de Conhecimento Geral.";
	public static final String tipoPossivel[] = {"Maior"};
	
	public SemNocao() {
		
	}
	
	public SemNocao(String tipo) {
		super(tipo);
	}
}
