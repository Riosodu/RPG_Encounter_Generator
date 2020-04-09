package vantagem.savageworlds;

import core.Progresso;
import requisito.RequisitoProgresso;
import requisito.RequisitoVantagem;

public class MuitoAtraente extends VantagemAntecedente {
	public static final String nome = "Muito Atraente";
	public static final String desc = "Seu her�i � lindo de morrer. O seu Carisma � " + 
			"aumentado em +4.";
	
	public MuitoAtraente() {
		super(new RequisitoProgresso(new Progresso(0)), new RequisitoVantagem(new Atraente()));
	}
	
}
