package vantagem.savageworlds;

import atributo.Forca;
import atributo.Vigor;
import core.Progresso;
import core.Requisito;

public class Musculoso extends VantagemAntecedente {
	private static final String nome = "Musculoso";
	private static final String desc = "O seu lutador � muito grande ou talvez apenas " + 
			"esteja em boa forma. Sua massa resiste a dano " + 
			"melhor que a da maioria e adiciona +1 a sua " + 
			"Resist�ncia. Al�m disso, o personagem pode " + 
			"carregar mais do que o proporcional a sua For�a: " + 
			"quatro vezes a sua For�a em quilos sem penalidade " + 
			"ao inv�s do normal de 2,5 vezes a sua For�a.";
	
	public Musculoso() {
		super(nome, desc, new Requisito(new Progresso(0)), new Requisito(new Forca(6)), 
				new Requisito(new Vigor(6)));
	}
}