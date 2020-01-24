package complicacao.savageworlds;

import core.Complicacao;
import core.Membro;
import core.Pericia;
import exception.MemberDoesntHaveSuchSkillException;

public class Desastrado extends Complicacao {
	public Desastrado(String tipo, Membro m) {
		super("Desastrado", "Algumas pessoas simplesmente n�o s�o boas " + 
				"com dispositivos modernos. Personagens com " + 
				"este defeito sempre sofrem uma penalidade de -2 " +  
				"na per�cia Consertar. Al�m disso, ao usar um " + 
				"dispositivo mec�nico ou eletr�nico, uma rolagem " + 
				"de 1 no seu dado de per�cia (independente do " + 
				"seu Dado Selvagem) significa que o dispositivo " + 
				"foi quebrado. Reparar esse item normalmente " + 
				"requer uma rolagem de Consertar com -2 e 1d6 " + 
				"horas para o reparo.", tipo, "Menor");
		
		try {
			aplicarModificadores(m);
		} catch(MemberDoesntHaveSuchSkillException ob) {
			
		}
			
		
	}
	
	public void aplicarModificadores(Membro m) throws MemberDoesntHaveSuchSkillException {
		Pericia consertar = null;
		Pericia[] mPericias = m.getPericias();
		
check:	for(int i = 0; i < mPericias.length; i++) {
			if(mPericias[i].getNome() == "Consertar") {
				consertar = mPericias[i];
				break check;
			}
		}
		
		if(consertar == null) {
			throw new exception.MemberDoesntHaveSuchSkillException();
		} else {
			consertar.addModificador(-2);
		}
		
	}
}
