package complicacao.savageworlds;

import core.Complicacao;

public class Cauteloso extends Complicacao {
	public static final String nome = "Cauteloso";
	public static final String desc = "Algumas pessoas acumulam intelig�ncia " + 
			"demais. Este personagem personifica a cautela " + 
			"excessiva. Ele nunca toma decis�es apressadas e " + 
			"gosta de planejar coisas at� os m�nimos detalhes " + 
			"antes de qualquer a��o ser tomada.";
	
	Cauteloso(String tipo) {
		super(tipo, "Menor");
	}
}
