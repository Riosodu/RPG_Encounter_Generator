package complicacao.interfacezero;

import core.Complicacao;

public class MonitorIndicado extends Complicacao {
	public static final String nome = "Monitor Indicado";
	public static final String desc = "Seu personagem tem um c�o de guarda. "
			+ "Esta � uma Com-plica��o Menor se o monitor raramente "
			+ "interfere nas a��es do seu her�i, contudo ele "
			+ "provavelmente reportar� as ativi-dades do personagem "
			+ "aos seus superiores. Est� � uma Complica��o Maior "
			+ "se o monitor ir� interferir em qualquer a��o que v� "
			+ "contra as ordens dos seus superiores e sempre ir� "
			+ "reportar as atividade do personagem, independente do "
			+ "que elas sejam. Se um Monitor Indicado � morto, um "
			+ "novo monitor o substituir�, a menos que ele tenha "
			+ "sido morto pelo personagem, que ser� acusado de "
			+ "homic�dio (ou isto � substitu�do com a Complica��o "
			+ "Procurado). Um monitor pode ser uma pessoa, mas tamb�m "
			+ "pode ser um Aspecto carregado dentro do TAP do personagem, "
			+ "dependendo da natureza dos seus superiores.";
	public static final String tipoPossivel[] = {"Menor"};
	
	public MonitorIndicado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MonitorIndicado(String tipo) {
		super(tipo);
	}
}
