package classes;

import core.Classe;
import core.Raca;
import raca.interfacezero.*;

public class FrancoAtirador extends Classe {
	private static final String nome = "Franco-Atirador";
	private static final String desc = "Atirador de longa distancia. Sabe o b�sico "
			+ "de luta corporal. Possui bastante furtividade. Fr�gil. Fraco. Baixa vontade";
	private static final String racasPermitidas[] = {
			"Andr�ide", "Bior�ide", "Ciborgue", "H�brido Aqu�tico", "H�brido Dur�o", "H�brido Feroz"
	};
	
	public FrancoAtirador() {
		super(nome, desc);
	}
}
