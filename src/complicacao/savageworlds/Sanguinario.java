package complicacao.savageworlds;

import core.Complicacao;

public class Sanguinario extends Complicacao {
	public Sanguinario(String tipo) {
		super("Sanguin�rio", "Seu her�i nunca faz prisioneiros, exceto sob " + 
				"a supervis�o direta de um superior. Isso pode " + 
				"causar grandes problemas em uma campanha " + 
				"militar, a menos que seus superiores tolerem esse " + 
				"tipo de coisa. Seu her�i sofre -4 no seu Carisma " + 
				"somente se seus h�bitos cru�is forem conhecidos", tipo, "Maior");
	}
}
