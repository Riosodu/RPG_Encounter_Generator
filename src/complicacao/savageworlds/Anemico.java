package complicacao.savageworlds;

import core.Core;

public class Anemico extends Core {
	public static final String nome = "An�mico";
	public static final String desc = "Um personagem an�mico � particularmente " + 
			"suscet�vel a infec��es, doen�as, efeitos ambientais " + 
			"e fadiga. Ele subtrai 2 de todos os testes de Fadiga " + 
			"como os feitos para resistir a veneno e doen�a";
	
	public Anemico(String tipo) {
		super(tipo, "Menor");
	}
}
