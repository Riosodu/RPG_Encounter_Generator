package complicacao.savageworlds;

import core.Complicacao;

public class Ganancioso extends Complicacao {
	public Ganancioso(String tipo) {
		super("Ganancioso", "Seu her�i avarento mede seu valor em tesouro. " + 
				"Se for uma Complica��o Menor, ele argumenta " + 
				"amargamente sobre qualquer despojo adquirido " + 
				"durante o jogo. Se for uma Complica��o Maior, " + 
				"luta por qualquer coisa que considerar desleal e " + 
				"pode at� mesmo matar pela sua �parte justa�.", tipo, "Menor", "Maior");
	}
}
