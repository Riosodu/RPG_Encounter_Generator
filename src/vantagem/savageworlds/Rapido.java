package vantagem.savageworlds;

import atributo.Agilidade;
import core.Progresso;
import requisito.RequisitoAtributo;
import requisito.RequisitoProgresso;

public class Rapido extends VantagemAntecedente {
	public static final String nome = "R�pido";
	public static final String desc = "Personagens r�pidos possuem reflexos velozes " + 
			"como um raio e uma cabe�a fria. Sempre que " + 
			"voc� sacar um 5 ou menos em combate, voc� " + 
			"pode descartar e sacar de novo at� pegar uma " + 
			"carta superior a 5. " + 
			"Personagens com ambas as Vantagens " + 
			"Equilibrado e R�pido sacam suas cartas adicionais " + 
			"e pegam a melhor. Se esta carta for um Cinco ou " + 
			"menor, a Vantagem R�pido pode ser usada para " + 
			"sacar uma substituta at� sair um Seis ou maior.";
	
	public Rapido() {
		super(nome, desc, new RequisitoProgresso(new Progresso(0)), new RequisitoAtributo(new Agilidade(8)));
	}
}
