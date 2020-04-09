package vantagem.savageworlds;

import atributo.Astucia;
import core.Progresso;
import requisito.RequisitoAtributo;
import requisito.RequisitoProgresso;

public class Linguista extends VantagemAntecedente {
	public static final String nome = "Linguista";
	public static final String desc = "O personagem possui um ouvido para idiomas " + 
			"e um talento raro para reconhecer similaridades " + 
			"entre eles. Um personagem com esta Vantagem " + 
			"come�a com um n�mero de idiomas igual a " + 
			"seu dado de Ast�cia e pode fazer uma rolagem " + 
			"33 " + 
			"de Ast�cia com -2 para se fazer entender em " + 
			"qualquer idioma ou dialeto que tenha ouvido ser " + 
			"falado por pelo menos uma semana.";
	
	public Linguista() {
		super(new RequisitoProgresso(new Progresso(0)), new RequisitoAtributo(new Astucia(6)));
	}
}
