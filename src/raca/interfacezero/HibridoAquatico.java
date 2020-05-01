package raca.interfacezero;

import core.Raca;

public class HibridoAquatico extends Raca implements Hibrido {
	private static final String nome = "H�brido Aqu�tico";
	private static final String desc = "Exemplos de Animais: Golfinho, Tubar�o, Crocodilo"
			+ "\n� Aqu�tico: H�bridos aqu�ticos n�o podem se afogar, come�am com um d6 em "
			+ "Nadar e podem se deslocar a sua Movimenta��o total debaixo da �gua."
			+ "\n� Desidrata��o: Um h�brido aqu�tico tem que mergulhar em �gua uma hora "
			+ "a cada 24 horas ou fica automaticamente Fatigado a cada dia at� que ele "
			+ "fique Incapacitado; no dia ap�s isso, ele morre."
			+ "\n� Vis�o No Escuro: H�bridos Aqu�ticos ignoram os redutores para Penumbra "
			+ "e Baixa Visibilidade e podem ver em qualquer situa��o, exceto escurid�o total."
			+ "\n� Arma Natural: H�bridos Aqu�ticos nunca s�o considerados desarmados "
			+ "e causam For+d6 de dano quando fazem um ataque desarmado.";
	
	public HibridoAquatico() {
		super(nome, desc);
	}
	
}
