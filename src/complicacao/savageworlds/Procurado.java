package complicacao.savageworlds;

import core.Complicacao;

public class Procurado extends Complicacao {
	public Procurado(String tipo) {
		super("Procurado", "Seu her�i cometeu algum crime no passado e " + 
				"ser� preso se for descoberto pelas autoridades. " + 
				"Isso pressup�e que o cen�rio possui leis e oficiais " + 
				"de pol�cia para imp�-las. " + 
				"O n�vel da Complica��o depende da seriedade " + 
				"do crime. Um her�i com v�rias multas de estacionamento " + 
				"n�o pagas (em um jogo em que " + 
				"ele pode ter de dirigir ocasionalmente) possui " + 
				"uma Complica��o Menor, assim como algu�m " + 
				"procurado por um crime mais grave longe da " + 
				"�rea principal da campanha. Ser acusado de " + 
				"assassinato � uma Complica��o Maior em quase " + 
				"qualquer cen�rio.", tipo, "Menor", "Maior");
	}
}