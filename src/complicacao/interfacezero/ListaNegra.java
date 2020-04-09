package complicacao.interfacezero;

import core.Complicacao;

public class ListaNegra extends Complicacao {
	public static final String nome = "Na Lista Negra";
	public static final String desc = "Devido a um evento em seu passado, ao menos "
			+ "uma cor-pora��o se recusa a ter qualquer coisa a ver com "
			+ "voc�. As raz�es podem variar, mas o resultado final � que, "
			+ "a menos que se esforce muito para esconder o seu envolvimento, "
			+ "neg�cios com essa companhia sempre ir�o azedar.No n�vel Maior, "
			+ "seu Na lista Negra n�o se aplica apenas a uma companhia, mas "
			+ "uma ind�stria inteira. Apenas imagine o qu�o dif�cil seria "
			+ "trabalhar em bancos se o seu nome � associado com um dos piores "
			+ "esc�ndalos banc�rios na hist�ria.";
	
	public ListaNegra(String tipo) {
		super(tipo, "Menor", "Maior");
	}
}
