package vantagem.savageworlds;

import core.Progresso;
import requisito.RequisitoProgresso;

public class Nobre extends VantagemAntecedente {
	public static final String nome = "Nome";
	public static final String desc = "Aqueles nascidos de sangue nobre t�m " + 
			"muitos privil�gios na vida, mas frequentemente " + 
			"possuem tamb�m muitas responsabilidades. " + 
			"Nobres possuem posi��o elevada em suas " + 
			"sociedades, t�m direto a tratamento especial " + 
			"de seus inimigos, recebem +2 de Carisma e " + 
			"tamb�m possuem a Vantagem Rico. Isso d� ao " + 
			"her�i diversas Vantagens pelo pre�o de uma, mas " + 
			"as responsabilidades mais do que compensam " + 
			"os privil�gios adicionais. Nobres normalmente " + 
			"possuem tropas sob o seu comando, bem como " + 
			"uma terra, uma casa de sua fam�lia e outras " + 
			"posses. Tudo isso deve ser determinado pelo " + 
			"Mestre e equilibrado pelos s�rios encargos " + 
			"enfrentados pelo personagem. " + 
			"Como exemplo, um personagem em " + 
			"uma campanha de fantasia poderia ter uma " + 
			"companhia de espadachins, um pequeno forte e " + 
			"mesmo uma espada m�gica herdada de seu pai. " + 
			"Entretanto, tamb�m teria uma regi�o inteira " + 
			"para administrar, criminosos para julgar, justi�a " + 
			"para aplicar e um vizinho invejoso cobi�ando a " + 
			"sua terra e constantemente conspirando contra " + 
			"ele na corte.";
	
	public Nobre() {
		super(nome, desc, new RequisitoProgresso(new Progresso(0)));
	}
}
