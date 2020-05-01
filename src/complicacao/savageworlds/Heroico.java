package complicacao.savageworlds;

import core.Complicacao;

public class Heroico extends Complicacao {
	public static final String nome = "Her�ico";
	public static final String desc = "Esta nobre alma nunca diz n�o a uma pessoa " + 
			"necessitada. Ela n�o precisa ficar feliz com isto, " + 
			"mas sempre vir� em socorro daqueles que (pelo " + 
			"menos de forma aparente) n�o podem ajudar a " + 
			"si mesmos. � a primeira a correr para dentro de " + 
			"um pr�dio em chamas, geralmente aceita ca�ar " + 
			"monstros por pouco ou nenhum pagamento e " + 
			"normalmente � um alvo f�cil para uma hist�ria " + 
			"triste.";
	public static final String tipoPossivel[] = {"Maior"};
	
	public Heroico() {
		super(nome, desc, tipoPossivel);
	}
	
	public Heroico(String tipo) {
		super(nome, desc, tipoPossivel, tipo);
	}
}
