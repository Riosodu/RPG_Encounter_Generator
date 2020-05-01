package complicacao.interfacezero;

import core.Complicacao;

public class Racista extends Complicacao {
	public static final String nome = "Racista";
	public static final String desc = "O personagem n�o gosta de pessoas de outras ra�as e " + 
			"credos, acredita que a sua ra�a � superior. Ele n�o pode" + 
			"se controlar em menosprezar outras ra�as em cada oportunidade. " + 
			"Um personagem assumindo a vers�o Menor tem" + 
			"Carisma -2 entre outras ra�as. A penalidade aumenta para " + 
			"-4 na Complica��o Maior.";
	public static final String tipoPossivel[] = {"Menor", "Maior"};
	
	public Racista() {
		super(nome, desc, tipoPossivel);
	}

	public Racista(String tipo) {
		super(nome ,desc, tipoPossivel, tipo);
	}
}
