package raca.interfacezero;

import core.Raca;

public class Bioroide extends Raca {
	private static final String nome = "Bior�ide";
	private static final String desc = "Bior�ides sangram, tem que comer e beber, ficam cansados quando n�o dormem, "
			+ "e funcionam de maneira muito semelhante aos humanos. E isso deixa muita gente nervosa." + 
			"Bior�ides s�o humanos criados em tanques e que tem um " + 
			"sistema de computador instalado em seus cr�nios. Geralmente " + 
			"usados como dubs, eles ganharam alguma fama n" + 
			"negativa nos �ltimos anos. Ap�s uma s�rie de assassinatos " + 
			"ligados a bior�ides em dubbings defeituosos, bior�ides " + 
			"com apar�ncia humana tornaram-se ilegais na maioria dos " + 
			"pa�ses. Contudo, bior�ides marcados com um c�digo de " + 
			"barras matriz enxertado em algum lugar da sua pele (o " + 
			"ombro ou a nuca s�o posi��es padr�o) ainda s�o permitidos " + 
			"em muitos pa�ses (mais notavelmente o Jap�o, que prefere " + 
			"bior�ides a simulacros por causa da sua longevidade). " + 
			"\n� Vulnerabilidade a PEM: Bior�ides sofrem dano completo " + 
			"de Armas PEM." + 
			"\n� Processador Duplo: Bior�ides come�am com um d6 " + 
			"em Ast�cia." + 
			"\n� Marcado ou Segredo: Na cria��o de personagem, " + 
			"o jogador precisa decidir se seu bior�ide � ou n�o " + 
			"marcado. Se ele for marcado, ele ganha a Complica��o " + 
			"Forasteiro, sofrendo uma penalidade de -2 no Carisma " + 
			"com pessoas que veem bior�ides com suspeita ou como " + 
			"�apenas uma m�quina�. Bior�ides n�o marcados tem " + 
			"a Complica��o Segredo (Maior). Bior�ides n�o marcados " + 
			"s�o ilegais e podem ser presos ou executados, se " + 
			"descobertos." + 
			"\n� Protocolo Prim�rio: Bior�ides come�am com um d6 de " + 
			"gra�a em uma per�cia, representando o seu sistema " + 
			"operacional central." + 
			"\n� Antinatural: Psi�nicos, tanto ben�ficos quanto mal�ficos, " + 
			"sofre uma penalidade de -2 para afetar bior�ides. " + 
			"Isso n�o tem efeito em poderes que causam dano, que " + 
			"os afetam normalmente.";
	
	public Bioroide() {
		super(nome, desc);
	}
	

}
