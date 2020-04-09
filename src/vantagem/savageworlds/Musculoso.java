package vantagem.savageworlds;

import atributo.Forca;
import atributo.Vigor;
import core.Progresso;
import requisito.RequisitoAtributo;
import requisito.RequisitoProgresso;

public class Musculoso extends VantagemAntecedente {
	public static final String nome = "Musculoso";
	public static final String desc = "O seu lutador � muito grande ou talvez apenas " + 
			"esteja em boa forma. Sua massa resiste a dano " + 
			"melhor que a da maioria e adiciona +1 a sua " + 
			"Resist�ncia. Al�m disso, o personagem pode " + 
			"carregar mais do que o proporcional a sua For�a: " + 
			"quatro vezes a sua For�a em quilos sem penalidade " + 
			"ao inv�s do normal de 2,5 vezes a sua For�a.";
	
	public Musculoso() {
		super(new RequisitoProgresso(new Progresso(0)), new RequisitoAtributo(new Forca(6)), 
				new RequisitoAtributo(new Vigor(6)));
	}
}
