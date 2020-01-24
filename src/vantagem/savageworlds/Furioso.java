package vantagem.savageworlds;

import core.Progresso;
import core.Requisito;

public class Furioso extends VantagemAntecedente {
	private static final String nome = "Furioso";
	private static final String desc = "Logo ap�s sofrer um ferimento (incluindo um " + 
			"resultado de Abalado por dano f�sico), seu her�i " + 
			"precisa fazer uma rolagem de Ast�cia ou entrar� " + 
			"em f�ria. " + 
			"Enquanto em f�ria, seu Aparar � reduzido " + 
			"em 2, mas adiciona +2 em todas as rolagens de " + 
			"Lutar, For�a, dano de combate corpo a corpo " + 
			"e Resist�ncia. O guerreiro ignora todos os " + 
			"modificadores de ferimento enquanto em f�ria, " + 
			"mas n�o pode usar quaisquer per�cias, Vantagens " + 
			"ou manobras que exijam concentra��o, incluindo " + 
			"Atirar e Provocar, exceto Intimidar. " + 
			"Furiosos atacam de forma imprudente. " + 
			"Sempre que seu dado de Lutar for um 1 " + 
			"(independente do seu Dado Selvagem), ele " + 
			"atinge um alvo adjacente aleat�rio (n�o o alvo " + 
			"original). O ataque pode atingir tanto um amigo " + 
			"quanto um inimigo. Se n�o houver outros alvos " + 
			"adjacentes, o golpe simplesmente erra. " + 
			"O personagem pode encerrar sua f�ria n�o " + 
			"fazendo nada (nem mesmo se mover) por uma " + 
			"a��o completa e efetuando uma rolagem de " + 
			"Ast�cia com -2.";
	
	public Furioso() {
		super(nome, desc, new Requisito(new Progresso(0)));
	}
}
