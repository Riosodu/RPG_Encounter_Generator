package complicacao.savageworlds;

import core.Complicacao;
import core.Membro;

public class Desagradavel extends Complicacao {
	public static final String nome = "Desagrad�vel";
	public static final String desc = "Este camarada � mal-humorado e desagrad�vel. " + 
			"Ningu�m gosta dele e ele tem dificuldades em fazer " + 
			"qualquer coisa gentil pra quem quer que seja. Ele " + 
			"deve ser pago pelos seus aborrecimentos e nem " + 
			"mesmo aceita premia��es graciosamente. Seu " + 
			"her�i sofre -2 no seu Carisma.";
	public static final String tipoPossivel[] = {"Menor"};
	
	public Desagradavel() {
		super();
	}
	
	public Desagradavel(String tipo, Membro m) {
		super(tipo);
	}
}
