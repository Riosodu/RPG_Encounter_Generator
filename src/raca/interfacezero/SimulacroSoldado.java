package raca.interfacezero;

import core.Raca;

public class SimulacroSoldado extends Raca implements Simulacro {
	private static final String nome = "Simulacro Soldado";
	private static final String desc = "Constru�dos para salvar vidas humanas ao lutar as batalhas " + 
			"da humanidade por ela, simulacros de combate s�o o " + 
			"que h� de melhor em m�quinas de combate constru�das " + 
			"para qualquer teatro de opera��es que eles possam ser " + 
			"alocados. As Na��es Unidas, a UE, o Mandarinato Chin�s e " + 
			"outras in�meras pot�ncias mundiais mant�m " + 
			"um r�gido controle sobre o uso e despacho " + 
			"de simulacros militares. Dito isso, alguns " + 
			"conseguem escorregar pelas rachaduras e " + 
			"encontrar meios de desaparecer do p�blico. " + 
			"\n� Vida �til (Maior): Simulacros soldados " + 
			"s�o projetados para viver apenas por quatro anos. Role um d4 para " + 
			"determinar quantos anos o seu personagem ainda tem. " + 
			"\n� Lutador: Simulacros soldados come�am com um d6 em lutar. " + 
			"\n� Parrudo: Simulacros soldados come�am com um d6 em For�a. " + 
			"\n� S�lido: Simulacros soldados come�am com um d6 em Vigor. " + 
			"\n� Estigma: Simus sofrem da Complica��o " + 
			"Forasteiro quando agem fora de seu papel designado como soldados.";
	
	public SimulacroSoldado() {
		super(nome, desc);
	}
	@Override
	protected void setModificadores() {
		// TODO Auto-generated method stub

	}

}
