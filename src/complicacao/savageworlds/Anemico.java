package complicacao.savageworlds;

import core.Complicacao;

public class Anemico extends Complicacao {
	public static final String nome = "An�mico";
	public static final String desc = "Um personagem an�mico � particularmente " + 
			"suscet�vel a infec��es, doen�as, efeitos ambientais " + 
			"e fadiga. Ele subtrai 2 de todos os testes de Fadiga " + 
			"como os feitos para resistir a veneno e doen�a";
	public static final String tipoPossivel[] = {"Menor"};
	
	public Anemico() {
	}
	public Anemico(String tipo) {
		super(tipo);
	}
}
