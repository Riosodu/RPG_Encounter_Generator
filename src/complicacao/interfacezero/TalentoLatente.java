package complicacao.interfacezero;

import core.Complicacao;

public class TalentoLatente extends Complicacao {
	public static final String nome = "Talento Latente";
	public static final String desc = "Alguns zeeks desafortunados sequer se d�o conta de que "
			+ "eles s�o zeeks at� que coisas estranhas come�am a acontecer a sua volta. "
			+ "Nesse ponto, ou eles aprendem a controlar, ou aprendem a conviver. "
			+ "Esta Complica��o funciona como a vers�o Maior da Complica��o "
			+ "Gatilho por Estresse (veja abaixo) com algumas grandes diferen�as. "
			+ "A m� noticia � que o seu personagem n�o tem ideia de quais s�o os "
			+ "seus poderes latentes, ent�o o Mestre escolhe qual (ou quais) se "
			+ "manifestam quando o Gatilho por Estresse " + 
			"se aciona � at� tr�s deles, como qualquer outro zeek. Ele " + 
			"pode escolher qualquer poder, entretanto o personagem " + 
			"deve ter o Est�gio suficiente para us�-lo. Quando voc� testa " + 
			"para verificar se o poder se ativa, � feito um teste de Esp�rito " + 
			"(ao inv�s de um teste da per�cia Psi�nicos). Se voc� quiser " + 
			"gastar um Bene para impedir o poder de se manifestar, " + 
			"deve declarar antes que o Mestre diga qual � o seu poder. " + 
			"A boa not�cia �, voc� pode pagar por esta Complica��o " + 
			"gastando dois Progressos. Ap�s o primeiro Progresso, esta " + 
			"Complica��o � tratada como a vers�o Menor de Gatilho" + 
			"por Estresse, e os poderes s� s�o ativados por uma falha " + 
			"cr�tica � embora as regras acima ainda se apliquem. Ap�s o " + 
			"segundo Progresso, seu personagem pode adquirir o Antecedente " + 
			"Arcano (Psi�nicos) e n�o sofre mais de Gatilho por " + 
			"Estresse. Os poderes iniciais do seu personagem devem ser " + 
			"qualquer poder manifestado por causa do Talento latente. " + 
			"Se todos os tr�s ainda n�o tiverem sido designados, voc� " + 
			"pode escolher qualquer poder remanescente.";
	
	public TalentoLatente(String tipo) {
		super(tipo, "Maior");
	}

}

