package complicacao.savageworlds;

import core.Complicacao;

public class Covarde extends Complicacao {
	public static final String nome = "Covarde";
	public static final String desc = "Nem todo mundo possui �gua gelada em suas " + 
			"veias. Seu her�i � suscet�vel � vis�o de sangue e " + 
			"v�sceras e tem medo de se machucar. Ele subtrai " + 
			"2 de todos os seus testes de Esp�rito baseados em " + 
			"medo.";
	public static final String tipoPossivel[] = {"Maior"};
	
	public Covarde() {
		super(nome, desc, tipoPossivel);
	}
	
	public Covarde(String tipo) {
		super(nome ,desc, tipoPossivel, tipo);
	}
}
