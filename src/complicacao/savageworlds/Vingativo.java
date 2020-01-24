package complicacao.savageworlds;

import core.Complicacao;

public class Vingativo extends Complicacao {
	public Vingativo(String tipo) {
		super("Vingativo", "Seu personagem sempre tenta reparar um erro " + 
				"que sinta ter sido cometido contra ele. Se essa " + 
				"for uma Complica��o Menor, ele normalmente " + 
				"procura por vingan�a legalmente. O tipo e a " + 
				"urg�ncia de sua vingan�a variam de personagem " + 
				"para personagem, � claro. Alguns conspiram " + 
				"e planejam por meses para conseguir o que " + 
				"enxergam como justi�a. " + 
				"Se essa for uma Complica��o Maior, seu " + 
				"personagem matar� para retificar a sua injusti�a.", tipo, "Menor", "Maior");
	}
}
