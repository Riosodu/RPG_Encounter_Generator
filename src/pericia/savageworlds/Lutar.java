package pericia.savageworlds;

import core.Atributo;
import core.Pericia;

public class Lutar extends Pericia {
	public static final String nome = "Lutar";
	public static final String desc = "Lutar cobre todos os ataques corpo a corpo, " + 
			"sejam eles com os punhos, machados, espadas laser " + 
			"ou artes marciais. A Dificuldade para atingir um " + 
			"oponente � o seu Aparar (2 mais a metade do seu " + 
			"Lutar).";
	
	public Lutar() {
		super(nome, desc, Atributo.AGILIDADE);
	}
	
	public Lutar(int nivelDado) {
		super(nome, desc, Atributo.AGILIDADE, nivelDado);
	}
}
