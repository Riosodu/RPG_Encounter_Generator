package complicacao.savageworlds;

import core.Complicacao;

public class Pacifista extends Complicacao {
	public Pacifista(String tipo) {
		super("Pacifista", "Seu her�i despreza absolutamente a viol�ncia. " + 
				"Pacifismo Menor significa que ele luta apenas " + 
				"se n�o for dada nenhuma outra op��o e jamais " + 
				"permite a matan�a de prisioneiros e outras " + 
				"v�timas indefesas. " + 
				"Pacifistas Maiores n�o ir�o combater criaturas " + 
				"vivas sob quaisquer circunst�ncias. Eles podem " + 
				"se defender, mas n�o far�o nada para ferir " + 
				"permanentemente criaturas vivas sencientes. " + 
				"Criaturas inegavelmente malignas, mortos vivos, " + 
				"dem�nios e similares n�o contam e podem ser " + 
				"atacadas ou mesmo feridos. Um Pacifista Maior " + 
				"tamb�m pode lutar com m�todos n�o letais, como " + 
				"os seus pr�prios punhos. Tais personagens, no " + 
				"entanto, s� o far�o se obviamente amea�ados.", tipo, "Menor", "Maior");
	}
}
