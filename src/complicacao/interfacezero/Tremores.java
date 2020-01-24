package complicacao.interfacezero;

import core.Complicacao;

public class Tremores extends Complicacao {
	public Tremores(String tipo) {
		super("Tremores", "Por alguma raz�o, este personagem tem alguns fios soltos " + 
				"no c�rebro. Seja por uma defeito de nascen�a ou porque " + 
				"doutores prestativos de algum projeto de pesquisa fizeram " + 
				"um caminho neural em zig onde deveriam ter feito um zag, " + 
				"o resultado � o mesmo: ele sofre tremores se est� sobrecarregado " + 
				"por estresse. Sempre que esse personagem � " + 
				"for�ado a fazer um teste de Esp�rito e falha, ele deve fazer " + 
				"imediatamente um teste de Vigor no qual se tamb�m falhar, " + 
				"ele come�a a ter uma convuls�o. " + 
				"A convuls�o faz com que o personagem caia e sofra uma " + 
				"penalidade de -2 em todos os testes at� que ela passe. " + 
				"Al�m disso, o personagem s� pode realizar Movimenta��o " + 
				"3 nesse per�odo. A convuls�o dura 15 turnos menos um " + 
				"n�mero de turnos igual ao Esp�rito do personagem. " + 
				"A boa noticia � que sempre h� alguma forma de tratamento " + 
				"qu�mico para compensar poss�veis convuls�es. Contanto que " + 
				"Cria��o de Personagens " + 
				"o personagem tenha acesso a sua medica��o, ele n�o tem que "
				+ "fazer um teste de Vigor quando falha em um teste de Esp�rito, "
				+ "mas isso requer gasto de dinheiro � 500 cr�ditos adicionais por "
				+ "sess�o de jogo. O personagem pode gastar menos (metade) em "
				+ "fontes naturais alternativas, mais baratas, por�m invariavelmente "
				+ "menos eficientes. O personagem ainda deve fazer seu teste de Vigor "
				+ "em falhas em teste de Esp�rito, mas ele ganha um b�nus de +1.",
				tipo, "Menor");
	}
}
