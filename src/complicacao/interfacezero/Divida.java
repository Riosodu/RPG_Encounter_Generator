package complicacao.interfacezero;

import core.Complicacao;

public class Divida extends Complicacao {
	public static final String nome = "D�vida";
	public static final String desc = "Algum�s vezes, um personagem quer come�ar com "
			+ "aquele �algo� a mais al�m de cibern�ticos, mas n�o "
			+ "tem os cr�ditos para fazer acontecer. Mas ei, bro... "
			+ "isso � 2090, e se voc� est� disposto a vender a sua "
			+ "alma para uma corpora��o ou gangue, sempre pode pegar "
			+ "um empr�stimo, n�? Se voc� � um entregador de pizzas "
			+ "e quer ter aquele ve�culo para poder trabalhar, por exemplo, "
			+ "apenas se dirija ao Honest Rex e experimente o seu programa "
			+ "de primeira compra. Como uma Complica��o Menor, o personagem "
			+ "pode fazer uma �nica compra de at� 15,000 cr�ditos, mas tem "
			+ "que acrescentar 500 cr�ditos ao seu custo de vida. Caso ele "
			+ "falhe em realizar o seu pagamento, deve faz�-lo na pr�xima "
			+ "sess�o pagando o dobro. Se ele falhar em pagar por duas sess�es "
			+ "consecutivas, o personagem adquire o equivalente a Complica��o "
			+ "Procurado � medida que cobradores (ou capangas do Rex) o "
			+ "assediam continuamente por dinheiro. Caso o personagem continue "
			+ "a faltar com seus pagamentos, no m�nimo sua compra ser� "
			+ "recuperada � no pior dos casos, ele se encontrar� no lado errado "
			+ "de um tipo diferente de contrato.A vers�o Maior desta Complica��o "
			+ "funciona quase igual, exceto que o personagem pode fazer uma "
			+ "�nica compra de at� 30,000 cr�ditos e tem que acrescentar "
			+ "1,000 cr�ditos ao seu custo de vida. Tamb�m � prov�vel que o "
			+ "credor fique mais... infeliz com a falta de pagamentos.";
	
	public Divida(String tipo) {
		super(tipo, "Menor", "Maior");
	}
}
