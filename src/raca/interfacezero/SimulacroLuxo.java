package raca.interfacezero;

import core.Raca;

public class SimulacroLuxo extends Raca implements Simulacro {
	private static final String nome = "Simulacro de Luxo";
	private static final String desc = "Simulacros de luxo s�o o segundo tipo mais comum de, " + 
			"atr�s apenas dos modelos trabalhadores, e vem em uma " + 
			"impressionante variedade de formas human�ides, tipos e " + 
			"apar�ncias �tnicas. Qualquer coisa desde animais empalhados " + 
			"do tamanho de uma crian�a, artistas, at� modelos " + 
			"de prostitui��o avan�ados. " + 
			"\n� Atraente: Simulacros de luxo s�o criados para agradar" + 
			"aos olhos. Eles come�am com +2 no Carisma. " + 
			"\n� Vida �til, Menor: Simulacros de luxo s�o projetados " + 
			"para viver apenas por dez anos. Role um d6+4 para " + 
			"determinar quantos anos o seu personagem ainda tem. " + 
			"\n� D�cil: Simulacros de luxo n�o s�o criaturas muito agressivas. " + 
			"Eles tendem a ficar um pouco enjoados com " + 
			"sangue e preferem evitar conflitos, a menos que n�o " + 
			"haja outra op��o. Eles sofrem da Complica��o Pacifista " + 
			"Menor. " + 
			"\n� Inteligente: Simulacros de luxo come�am com um d6 " + 
			"em Ast�cia. " + 
			"\n� Protocolo Prim�rio: Simulacros de luxo come�am com " + 
			"um d6 de gra�a em uma per�cia, representando o seu " + 
			"sistema operacional central. " + 
			"\n� Estigma: Simus sofrem da Complica��o Forasteiro " + 
			"quando agem fora de seu papel designado como animadores " + 
			"e servos.";
	
	public SimulacroLuxo() {
		super(nome, desc);
	}
	@Override
	protected void setModificadores() {
		// TODO Auto-generated method stub

	}

}
