package atributo;

import core.Atributo;

public class Agilidade extends Atributo {
	public static final String nome = "Agilidade";
	public static final String desc = "AGILIDADE � a rapidez, velocidade e " + "destreza do seu her�i.";

	public Agilidade() {

	}

	public Agilidade(int nivelDado) {
		setNivelDado(nivelDado);
	}

}
