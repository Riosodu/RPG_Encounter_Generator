package complicacao.interfacezero;

import core.Complicacao;

public class GatilhoEstresse extends Complicacao {
	public static final String nome = "Gatilho por Estresse";
	public static final String desc = "A maioria dos zeeks tenta manter o controle "
			+ "sobre seus poderes, mas um personagem com esta Complica��o "
			+ "parece n�o conseguir lidar com eles o tempo todo. Se ele for "
			+ "confrontado com uma situa��o estressante, existe a tend�ncia "
			+ "desagrad�vel de que suas habilidades psi�nicas se manifestem. "
			+ "Como uma Complica��o Menor, o que isso significa � que sempre "
			+ "que o personagem � for�ado a fazer um teste de atributo para "
			+ "resistir a algo � seja um teste de Esp�rito para manter "
			+ "a moral ou um teste de For�a em uma competi��o de queda de bra�o"
			+ " � se o resultado for uma falha cr�tica, o personagem deve "
			+ "tentar usar um dos seus poderes psi�nicos com sua pr�xima a��o. "
			+ "Sim, isso tamb�m se aplica a Testes de Vontade e de Absor��o. "
			+ "Como uma Complica��o Maior, qualquer falha em uma dessas rolagens "
			+ "resulta em uso obrigat�rio do poder. Em ambos os casos, o personagem "
			+ "pode gastar um Bene para evitar o uso for�ado do poder. Esta "
			+ "Complica��o pode ser assumida por um personagem com as Vantagens "
			+ "Antecedente Arcano (Psi�nicos) ou Talento Selvagem.";
	public static final String tipoPossivel[] = {"Menor", "Maior"};
	
	public GatilhoEstresse() {
		super(nome, desc, tipoPossivel);
	}

	public GatilhoEstresse(String tipo) {
		super(nome, desc, tipoPossivel, tipo);
	}
}
