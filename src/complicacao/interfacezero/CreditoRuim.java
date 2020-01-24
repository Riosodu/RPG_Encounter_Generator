package complicacao.interfacezero;

import core.Complicacao;
import core.Membro;

public class CreditoRuim extends Complicacao {
	public CreditoRuim(String tipo, Membro m) {
		super("Cr�dito Ruim nas Ruas", "Seu personagem arruinou seriamente uma miss�o, "
				+ "o que subtrai permanentemente 1 do seu Cr�dito nas Ruas.", 
				tipo, "Menor");
		aplicarModificadores(m);
	}
	
	public void aplicarModificadores(Membro m) {
		m.subtractCreditoDasRuas(1);
	}
}
