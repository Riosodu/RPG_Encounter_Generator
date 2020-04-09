package atributo;

import core.Atributo;

public class Forca extends Atributo {
	public static final String nome = "For�a";
	public static final String desc = "FOR�A representa for�a bruta e aptid�o f�sica " + 
			"no geral. For�a tamb�m � usada para gerar o dano " + 
			"do seu guerreiro em combate corpo a corpo.";
	
	public Forca() {
		
	}
	
	public Forca(int nivelDado) {
		setNivelDado(nivelDado);
	}
}
