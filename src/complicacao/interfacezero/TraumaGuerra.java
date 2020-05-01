package complicacao.interfacezero;

import core.Complicacao;

public class TraumaGuerra extends Complicacao {
	public static final String nome = "Trauma de Guerra";
	public static final String desc = "O personagem tem uma tend�ncia de congelar em combate. "
			+ "Ele come�a o primeiro turno de combate Abalado. Esta condi��o pode "
			+ "ser removida normalmente.";
	public static final String tipoPossivel[] = {"Maior"};
	
	public TraumaGuerra() {
		super(nome, desc, tipoPossivel);
	}

	public TraumaGuerra(String tipo) {
		super(nome, desc, tipoPossivel, tipo);
	}
}
