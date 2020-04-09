package complicacao.savageworlds;

import core.Complicacao;

public class Sanguinario extends Complicacao {
	public static final String nome = "Sanguin�rio";
	public static final String desc = "Seu her�i nunca faz prisioneiros, exceto sob " + 
			"a supervis�o direta de um superior. Isso pode " + 
			"causar grandes problemas em uma campanha " + 
			"militar, a menos que seus superiores tolerem esse " + 
			"tipo de coisa. Seu her�i sofre -4 no seu Carisma " + 
			"somente se seus h�bitos cru�is forem conhecidos";
	
	public Sanguinario(String tipo) {
		super(tipo, "Maior");
	}
}
