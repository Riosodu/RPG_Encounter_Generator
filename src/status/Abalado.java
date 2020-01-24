package status;

import core.Status;

public class Abalado extends Status {
	private static final String nome = "Abalado";
	private static final String desc = "Se o dano de um ataque for um simples sucesso " + 
			"(de 0 a 3 pontos acima da Resist�ncia), o personagem " + 
			"� Abalado. Personagens Abalados est�o " + 
			"perturbados, distra�dos ou momentaneamente em " + 
			"choque. Eles n�o est�o atordoados, mas temporariamente " + 
			"suprimidos e podem hesitar. " + 
			"Na sua a��o, um personagem Abalado precisa " + 
			"tentar sair deste estado fazendo uma rolagem de " + 
			"Esp�rito: " + 
			"\n� Falha: O personagem permanece Abalado. " + 
			"Ele pode realizar apenas a��es livres" + 
			"\n� Sucesso: O personagem n�o est� mais " + 
			"Abalado e pode agir normalmente.";
	
	public Abalado() {
		super(nome, desc);
	}
	
	public Abalado(int modificador) {
		super(nome, desc, modificador);
	}
}
