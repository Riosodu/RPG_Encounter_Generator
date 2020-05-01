package atributo;

import core.Atributo;

public class Vigor extends Atributo {
	public static final String nome = "Vigor";
	public static final String desc = "VIGOR representa a toler�ncia, resist�ncia " + 
			"a doen�as, venenos ou toxinas e quanta dor e " + 
			"dano f�sico um her�i pode suportar.";
	
	public Vigor() {
		super(nome, desc);
	}
	
	public Vigor(int nivelDado) {
		super(nome, desc);
		setNivelDado(nivelDado);
	}
}
