package complicacao.savageworlds;

import core.Complicacao;

public class BocaGrande extends Complicacao {
	public static final String nome = "Boca Grande";
	public static final String desc = "Todos sabem que deve-se tomar cuidado com o " + 
			"que se diz, n�o � mesmo? Bem, o seu personagem " + 
			"n�o sabe. " + 
			"Seu personagem n�o consegue guardar " + 
			"muito bem um segredo. Ele revela os planos " + 
			"e deixa escapar as coisas mais bem guardadas " + 
			"entre amigos, geralmente nos piores momentos " + 
			"poss�veis.";
	public static final String tipoPossivel[] = {"Menor"};
	
	public BocaGrande() {
		super();
	}
	
	public BocaGrande(String tipo) {
		super(tipo);
	}
}
