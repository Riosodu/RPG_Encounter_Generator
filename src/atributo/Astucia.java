package atributo;

import core.Atributo;

public class Astucia extends Atributo {
	public static final String nome = "Ast�cia";
	public static final String desc = "AST�CIA � uma medida de qu�o bem seu "
			+ "personagem conhece seu mundo e sua cultura, " + "qu�o bem planeja os seus passos e a sua agilidade "
			+ "mental.";

	public Astucia() {
	}

	public Astucia(int nivelDado) {
		setNivelDado(nivelDado);
	}

}
