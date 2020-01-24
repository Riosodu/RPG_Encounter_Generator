package pericia.savageworlds;

import core.Pericia;

public class Consertar extends Pericia {
	private static String desc = "Consertar � a habilidade de reparar engenhocas, " + 
			"ve�culos, armas e outras m�quinas. Personagens " + 
			"sofrem uma penalidade de -2 nas suas rolagens " + 
			"se n�o tiverem acesso a ferramentas b�sicas. Uma " + 
			"amplia��o em uma rolagem de Consertar reduz " + 
			"� metade o tempo exigido por uma tarefa em " + 
			"particular.";
	
	public Consertar() {
		super("Consertar", desc, new atributo.Astucia());
	}
	
	public Consertar(int nivelDado) {
		super("Consertar", desc, new atributo.Astucia(), nivelDado);
	}
}
