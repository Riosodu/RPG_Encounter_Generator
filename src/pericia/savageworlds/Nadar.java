package pericia.savageworlds;

import atributo.Agilidade;
import core.Pericia;

public class Nadar extends Pericia {
	public static final String nome = "Nadar";
	public static final String desc = "Nadar determina se um personagem flutua ou " + 
			"afunda na �gua, bem como qu�o r�pido ele se move " + 
			"dentro dela. A Movimenta��o de um personagem " + 
			"� igual � metade da sua per�cia Nata��o em quadros " + 
			"por turno em �guas normais (arredondado para " + 
			"cima). �guas agitadas contam como terreno " + 
			"acidentado reduzindo essa taxa � metade. " + 
			"Personagens n�o podem �correr� enquanto nadam " + 
			"para ter movimento extra.";
	
	public Nadar() {
		super(nome, desc, new Agilidade());
	}
	
	public Nadar(int nivelDado) {
		super(nome, desc, new Agilidade(), nivelDado);
	}
}
