package complicacao.interfacezero;

import core.Complicacao;

public class Propriedade extends Complicacao {
	public static final String nome = "Propriedade";
	public static final String desc = "Seja por procedimentos experimentais que o mant�m " + 
			"vivo, ou um contrato de servid�o para pagar uma grande " + 
			"d�vida, sua liberdade individual � bastante dificultada porque " + 
			"voc� �, para todos os efeitos e prop�sitos, propriedade do " + 
			"megaconglomerado que possui o seu contrato. Esta Complica��o " + 
			"� muito comum para simulacros, andr�ides e h�bridos " + 
			"trabalhando no setor corporativo. Na maior parte, esta Complica��o " + 
			"significa que voc� tem pouco a opinar sobre suas " + 
			"a��es; n�o � incomum para voc� receber ordens com a " + 
			"expectativa que voc� as cumprir�. No fim de uma longa e " + 
			"perigosa miss�o para os donos do seu contrato, voc� pode " + 
			"pagar por esta Complica��o gastando um Progresso uma " + 
			"vez que atinja o Est�gio Experiente.";
	public static final String tipoPossivel[] = {"Maior"};
	
	public Propriedade() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Propriedade(String tipo) {
		super(tipo);
	}
}
