package atributo;

import core.Atributo;

public class Espirito extends Atributo {
	public Espirito(int nivelDado) {
		super("Esp�rito", "ESP�RITO reflete sabedoria interior e for�a " + 
				"de vontade. Esp�rito � muito importante, pois " + 
				"ajuda seu personagem a se recuperar do estado " + 
				"Abalado", nivelDado);
	}
	public Espirito() {
		super("Esp�rito", "ESP�RITO reflete sabedoria interior e for�a " + 
				"de vontade. Esp�rito � muito importante, pois " + 
				"ajuda seu personagem a se recuperar do estado " + 
				"Abalado");
	}
}
