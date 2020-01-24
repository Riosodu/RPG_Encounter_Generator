package vantagem.savageworlds;

import core.Progresso;
import core.Requisito;

public class AntecedenteArcano extends VantagemAntecedente {
	private String especializacao;
	private static final String desc = "Esta � a Vantagem que o seu personagem precisa " + 
			"comprar para ter qualquer tipo de habilidade " + 
			"m�gica, ps�quica ou sobrenatural.";
	
	public AntecedenteArcano(String especializacao) {
		super("Antecedente Arcano (" + especializacao + ")", desc, new Requisito(new Progresso(0)));
		this.especializacao = especializacao;
	}
}
