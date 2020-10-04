package pericia.savageworlds;


import core.Atributo;
import core.Pericia;

public class Intimidar extends Pericia {
	public static final String nome = "Intimidar";
	public static final String desc = "Intimidar � a arte de aterrorizar um oponente " + 
			"com pura for�a de vontade, amea�as veladas " + 
			"ou evidentes ou, �s vezes, apenas com armas " + 
			"realmente grandes. Essa � uma rolagem resistida " + 
			"entre a Intimidar do her�i e o Esp�rito de seu " + 
			"oponente.";
	
	public Intimidar() {
		super(nome, desc, Atributo.ESPIRITO);
	}
	
	public Intimidar(int nivelDado) {
		super(nome, desc, Atributo.ESPIRITO, nivelDado);
	}
}
