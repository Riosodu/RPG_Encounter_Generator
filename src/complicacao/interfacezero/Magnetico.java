package complicacao.interfacezero;

import core.Complicacao;

public class Magnetico extends Complicacao {
	public static final String nome = "Magn�tico";
	public static final String desc = "Quer seja sua apar�ncia, fama, ou outra coisa que voc� " + 
			"n�o pode explicar, certas pessoas acham o seu her�i " + 
			"muito atraente. Infelizmente, elas nunca s�o aquelas que " + 
			"ele deseja que estivessem atra�das por ele. Como uma " + 
			"Complica��o Menor, um ou dois f�s aparecem como um " + 
			"inconveniente ou uma distra��o ocasional. A vers�o Maior " + 
			"tem turbas de f�s que o deixam em s�rios apuros. Imagine " + 
			"tentar fazer um trabalho enquanto � perseguido por meia " + 
			"d�zia de rep�rteres! Exemplos de f�s incluem pretensos " + 
			"criminosos esperando ficarem bem quistos, jornalistas ou " + 
			"produtores de reality shows.";
	public static final String tipoPossivel[] = {"Menor", "Maior"};
	
	public Magnetico() {
		super(nome, desc, tipoPossivel);
	}

	public Magnetico(String tipo) {
		super(nome, desc, tipoPossivel, tipo); 
	}
}
