package complicacao.interfacezero;

import core.Complicacao;

public class Racista extends Complicacao {
	public Racista(String tipo) {
		super("Racista", "O personagem n�o gosta de pessoas de outras ra�as e " + 
				"credos, acredita que a sua ra�a � superior. Ele n�o pode" + 
				"se controlar em menosprezar outras ra�as em cada oportunidade. " + 
				"Um personagem assumindo a vers�o Menor tem" + 
				"Carisma -2 entre outras ra�as. A penalidade aumenta para " + 
				"-4 na Complica��o Maior.", tipo, "Menor", "Maior");
	}
}
