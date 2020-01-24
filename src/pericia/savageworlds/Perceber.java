package pericia.savageworlds;

import core.Pericia;

public class Perceber extends Pericia {
	private static String desc = "Perceber � a prontid�o geral e habilidade de " + 
			"um her�i para procurar por itens ou pistas. Isso " + 
			"cobre rolagens para ouvir, detectar emboscadas, " + 
			"enxergar armas escondidas e at� mesmo examinar " + 
			"outros personagens para ver se est�o mentindo, " + 
			"assustados e assim por diante. Quanto mais " + 
			"amplia��es um personagem consegue em uma " + 
			"rolagem de Perceber, mais informa��es o Mestre " + 
			"deve revelar.";
	
	public Perceber() {
		super("Perceber", desc, new atributo.Astucia()); 
	}
	
	public Perceber(int nivelDado) {
		super("Perceber", desc, new atributo.Astucia(), nivelDado); 
	}
}
