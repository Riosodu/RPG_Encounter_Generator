package pericia.savageworlds;

import atributo.Astucia;
import core.Pericia;

public class Rastrear extends Pericia {
	public static final String nome = "Rastrear";
	public static final String desc = "Rastrear permite que um personagem siga os " + 
			"rastros de um ou mais indiv�duos em qualquer tipo " + 
			"de terreno. Cada rolagem geralmente cobre seguir " + 
			"os rastros por cerca de um quil�metro e meio, mas " + 
			"o Mestre pode ajustar isso dramaticamente para " + 
			"escalas de busca mais espec�ficas ou menores.";
	
	public Rastrear() {
		super(nome, desc, new Astucia());
	}
	
	public Rastrear(int nivelDado) {
		super(nome, desc, new Astucia(), nivelDado);
	}
}
