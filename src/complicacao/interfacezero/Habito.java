package complicacao.interfacezero;

import core.Complicacao;

public class Habito extends Complicacao {
	public Habito(String tipo) {
		super("H�bito", "Seu guerreiro possui um h�bito irritante e " + 
				"constante de algum tipo. Talvez ele cutuque seu " + 
				"nariz, diga �c� sabe� em cada frase ou masque " + 
				"chiclete como se isso transbordasse estilo. " + 
				"Um H�bito menor irrita aqueles a seu redor, " + 
				"mas n�o � perigoso. Seu her�i sofre -1 no Carisma. " + 
				"Um H�bito maior � uma depend�ncia f�sica " + 
				"ou mental de alguma esp�cie, debilitante ou " + 
				"mesmo possivelmente mortal. Isso inclui o uso " + 
				"de drogas, alcoolismo ou talvez at� mesmo um " + 
				"v�cio em realidade virtual num cen�rio de alta " + 
				"tecnologia. Um personagem que n�o receba " + 
				"sua dose precisa fazer um teste de Fadiga a " + 
				"cada 24 horas seguintes. A primeira rolagem cujo resultado seja " + 
				"uma falha faz o personagem ficar Fatigado, " +
				"depois Exausto. O resultado final � um coma " + 
				"por uso de drogas pesadas ou um caso grave " + 
				"de choque em depend�ncias como a de �lcool " + 
				"ou Realidade Virtual. Tratamento m�dico pode " + 
				"amenizar os sintomas. Caso contr�rio, a v�tima " + 
				"precisar� viver com as penalidades por 1d6 " + 
				"dias. Posteriormente, o her�i tem de pagar pela " + 
				"Complica��o sacrificando uma oportunidade de " + 
				"Progresso ou eventualmente cair� de volta em " + 
				"seu v�cio.", tipo, "Menor", "Maior");
	}
}
