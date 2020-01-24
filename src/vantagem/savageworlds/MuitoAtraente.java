package vantagem.savageworlds;

import core.Progresso;
import core.Requisito;

public class MuitoAtraente extends VantagemAntecedente {
	private static final String nome = "Muito Atraente";
	private static final String desc = "Seu her�i � lindo de morrer. O seu Carisma � " + 
			"aumentado em +4.";
	
	public MuitoAtraente() {
		super(nome, desc, new Requisito(new Progresso(0)), new Requisito(new Atraente()));
	}
	
}
