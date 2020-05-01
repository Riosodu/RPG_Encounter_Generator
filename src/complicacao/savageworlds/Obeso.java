package complicacao.savageworlds;

import core.Complicacao;

public class Obeso extends Complicacao {
	public static final String nome = "Obeso";
	public static final String desc = "Pessoas particularmente grandes t�m muita " + 
			"dificuldade em situa��es de perigo f�sico. " + 
			"Aqueles que suportam bem o seu pr�prio peso " + 
			"t�m a Vantagem Musculoso. Aqueles que n�o " + 
			"lidam muito bem com ele s�o Obesos. Um " + 
			"personagem n�o pode ser Musculoso e Obeso " + 
			"simultaneamente. " + 
			"Um her�i Obeso adiciona 1 a sua Resist�ncia, " + 
			"mas sua Movimenta��o � decrescida em 1 e seu " + 
			"dado de corrida � um d4. Personagens obesos " + 
			"tamb�m podem ter dificuldade para achar " + 
			"armaduras ou roupas adequadas ao seu tamanho, " + 
			"caber em espa�os apertados ou mesmo viajar em " + 
			"espa�os confinados, como poltronas de avi�es ou " + 
			"carros compactos.";
	public static final String tipoPossivel[] = {"Menor"};
	
	public Obeso() {
		super(nome, desc, tipoPossivel);
	}
	
	public Obeso(String tipo) {
		super(nome, desc, tipoPossivel, tipo);
	}
}
