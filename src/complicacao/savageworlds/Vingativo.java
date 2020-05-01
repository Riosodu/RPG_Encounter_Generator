package complicacao.savageworlds;

import core.Complicacao;

public class Vingativo extends Complicacao {
	public static final String nome = "Vingativo";
	public static final String desc = "Seu personagem sempre tenta reparar um erro " + 
			"que sinta ter sido cometido contra ele. Se essa " + 
			"for uma Complica��o Menor, ele normalmente " + 
			"procura por vingan�a legalmente. O tipo e a " + 
			"urg�ncia de sua vingan�a variam de personagem " + 
			"para personagem, � claro. Alguns conspiram " + 
			"e planejam por meses para conseguir o que " + 
			"enxergam como justi�a. " + 
			"Se essa for uma Complica��o Maior, seu " + 
			"personagem matar� para retificar a sua injusti�a.";
	public static final String tipoPossivel[] = {"Menor", "Maior"};
	
	public Vingativo() {
		super(nome, desc, tipoPossivel);
	}
	
	public Vingativo(String tipo) {
		super(nome, desc, tipoPossivel, tipo);
	}
}
