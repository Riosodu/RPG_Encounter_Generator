package complicacao.interfacezero;

import core.Complicacao;

public class TraumaGuerra extends Complicacao {
	public TraumaGuerra(String tipo) {
		super("Trauma de Guerra", "O personagem tem uma tend�ncia de congelar em combate. "
				+ "Ele come�a o primeiro turno de combate Abalado. Esta condi��o pode "
				+ "ser removida normalmente.", tipo, "Maior");
	}
}
