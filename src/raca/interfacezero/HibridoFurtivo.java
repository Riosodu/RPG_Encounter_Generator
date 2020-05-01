package raca.interfacezero;

import core.Raca;

public class HibridoFurtivo extends Raca implements Hibrido {
	private static final String nome = "H�brido Furtivo";
	private static final String desc = "Exemplos de Animais: Morcego, Rato, Gato " + 
			"\n� Reflexos Animais: H�bridos furtivos come�am com um " + 
			"d6 em Furtividade e Escalar " + 
			"\n� Sentidos Aumentados: H�bridos Furtivos ganham +2 " + 
			"em testes de Perceber com um sentido a escolha do " + 
			"jogador. " + 
			"\n� Vis�o No Escuro: H�bridos furtivos ignoram os redutores " + 
			"para Penumbra e Baixa Visibilidade e podem ver em " + 
			"qualquer situa��o, exceto escurid�o total." + 
			"\n� Pequeno: H�bridos furtivos tendem a ter uma constitui��o " + 
			"fr�gil e tem -1 em Resist�ncia.";
	
	public HibridoFurtivo() {
		super(nome, desc);
	}


}
