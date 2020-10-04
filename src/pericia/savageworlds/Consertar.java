package pericia.savageworlds;

import core.Atributo;
import core.Pericia;

public class Consertar extends Pericia {
	public static final String nome = "Consertar";
	public static final String desc = "Consertar � a habilidade de reparar engenhocas, " + 
			"ve�culos, armas e outras m�quinas. Personagens " + 
			"sofrem uma penalidade de -2 nas suas rolagens " + 
			"se n�o tiverem acesso a ferramentas b�sicas. Uma " + 
			"amplia��o em uma rolagem de Consertar reduz " + 
			"� metade o tempo exigido por uma tarefa em " + 
			"particular.";
	
	public Consertar() {
		super(nome, desc, Atributo.ASTUCIA);
	}
	
	public Consertar(int nivelDado) {
		super(nome, desc, Atributo.ASTUCIA, nivelDado);
	}
}
