package atributo;

import core.Atributo;

public class Vigor extends Atributo {
	public Vigor(int nivelDado) {
		super("Vigor", "VIGOR representa a toler�ncia, resist�ncia " + 
				"a doen�as, venenos ou toxinas e quanta dor e " + 
				"dano f�sico um her�i pode suportar.", nivelDado);
	}
	public Vigor() {
		super("Vigor", "VIGOR representa a toler�ncia, resist�ncia " + 
				"a doen�as, venenos ou toxinas e quanta dor e " + 
				"dano f�sico um her�i pode suportar.");
	}
}
