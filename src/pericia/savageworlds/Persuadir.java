package pericia.savageworlds;

import atributo.Espirito;
import core.Pericia;

public class Persuadir extends Pericia {
	public static final String nome = "Persuadir";
	public static final String desc = "Persuadir � a habilidade de convencer outros a " + 
			"fazerem o que voc� deseja. " +  
			"Extras iniciam em uma destas cinco atitudes " + 
			"diferentes: Hostil, N�o Cooperativo, Neutro, " + 
			"Amig�vel ou Prestativo. Uma rolagem bemsucedida " + 
			"de Persuadir melhora a atitude do Extra " + 
			"em um passo ou dois com uma amplia��o. Falhar, " + 
			"pelo contr�rio, piora a atitude do personagem em " + 
			"um passo ou dois se um 1 for rolado no dado de " + 
			"Persuadir (independente do Dado Selvagem). " + 
			"Muitos Extras n�o v�o alterar sua rea��o mais " + 
			"do que um ou dois n�veis durante uma �nica " + 
			"mudan�a, mas isto depende inteiramente do " + 
			"Mestre e da situa��o.";
	
	public Persuadir() {
		super(new Espirito());
	}
	
	public Persuadir(int nivelDado) {
		super(new Espirito(), nivelDado);
	}
}
