package complicacao.savageworlds;

import core.Complicacao;

public class Voto extends Complicacao {
	public static final String nome = "Voto";
	public static final String desc = "O personagem possui um voto de algum tipo. " + 
			"Se � uma Complica��o Maior ou Menor depende " + 
			"do Voto em si. Alguns podem ter votos para " + 
			"com ordens ou causas espec�ficas, para com " + 
			"o juramento Hipocr�tico, livrar o mundo do " + 
			"mal e assim por diante. O risco em cumprir o " + 
			"Voto e qu�o ocasionalmente isso pode ocorrer " + 
			"determinam o n�vel da Complica��o. Qualquer " + 
			"que seja o Voto, ele s� ser� uma Complica��o se " + 
			"realmente aparecer em jogo de tempos em tempos " + 
			"e causar ao personagem algum desconforto.";
	public static final String tipoPossivel[] = {"Menor", "Maior"};
	
	public Voto() {
	}
	
	public Voto(String tipo) {
		super(tipo);
	}
}
