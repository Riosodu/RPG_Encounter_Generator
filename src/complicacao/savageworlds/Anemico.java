package complicacao.savageworlds;

import core.Complicacao;

public class Anemico extends Complicacao {
	public Anemico(String tipo) {
		super("An�mico", "Um personagem an�mico � particularmente " + 
				"suscet�vel a infec��es, doen�as, efeitos ambientais " + 
				"e fadiga. Ele subtrai 2 de todos os testes de Fadiga " + 
				"como os feitos para resistir a veneno e doen�a", tipo, "Menor");
	}
}
