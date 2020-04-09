package complicacao.interfacezero;

import core.Complicacao;
import core.Membro;

public class CreditoRuim extends Complicacao {
	public static final String nome = "Cr�dito Ruim nas Ruas";
	public static final String desc = "Seu personagem arruinou seriamente uma miss�o, "
			+ "o que subtrai permanentemente 1 do seu Cr�dito nas Ruas.";
	public static final String tipoPossivel[] = {"Menor"};
	
	public CreditoRuim() {
		
	}
	
	public CreditoRuim(String tipo, Membro m) {
		super(tipo);
	}
}
