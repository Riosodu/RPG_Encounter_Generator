package pericia.savageworlds;


import core.Atributo;
import core.Pericia;

public class Atletismo extends Pericia {
	public static final String nome = "Atletismo";
	public static final String desc = "Atletismo � um apanhado para uma quantidade de fa�anhas "
			+ "f�sicas abrangendo desde escalar, nadar at� se mover "
			+ "efetivamente em um ambiente sem � ou com baixa gravidade. "
			+ "Atletismo deve ser usado no lugar de Agilidade em "
			+ "persegui��es a p� e efetivamente substitui as per�cias"
			+ " Escalar e Nadar.";
	
	public Atletismo() {
		super(nome, desc, Atributo.VIGOR);
	}
	
	public Atletismo(int nivelDado) {
		super(nome, desc, Atributo.VIGOR, nivelDado);
	}
}
