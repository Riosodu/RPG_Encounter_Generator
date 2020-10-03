package vantagem.savageworlds;

import core.Atributo;
import core.Progresso;
import requisito.RequisitoAtributo;
import requisito.RequisitoProgresso;

public class CuraRapida extends VantagemAntecedente {
	public static final String nome = "Cura R�pida";
	public static final String desc = "Alguns indiv�duos parecem se curar mais " + 
			"rapidamente que os outros. Aqueles com esta " + 
			"ben��o adicionam +2 a suas rolagens de Vigor " + 
			"em seus testes para cura natural. Veja a p�gina " + 
			"101 para regras completas de Cura.";
	
	public CuraRapida() {
		super(nome, desc, new RequisitoProgresso(new Progresso(0)), new RequisitoAtributo(Atributo.VIGOR,8));
	}
}
