package pericia.interfacezero;

import pericia.savageworlds.Conhecimento;

public class ConhecimentoDemolicao extends Conhecimento {
	public static final String especializacao = "Demoli��o";
	public static final String nome = "Conhecimento (Demoli��o)";
	public static final String desc = "Uso bem sucedido de " + 
			"demoli��es pode significar a diferen�a entre destrui��o " + 
			"do alvo como planejado e perda indesejada de vidas e " + 
			"propriedade. A per�cia tamb�m permite que o personagem " + 
			"tenha um entendimento de qual � o melhor tipo " + 
			"de explosivo e quanto ser� preciso para remover o obst�culo. " + 
			"Al�m disso, uma amplia��o no resultado permitir� " + 
			"saber a dist�ncia exata que � preciso estar da explos�o, " + 
			"baseada no tamanho da carga, a conten��o e o dano criado. " + 
			"Esta per�cia � usada toda vez que um personagem quiser " + 
			"colocar junto uma bolsa de cargas ou acionar explosivos " + 
			"Uma falha cr�tica resultar� em detona��o imediata. Uma " + 
			"falha simples resultar� em detona��o prematura ou em " + 
			"nenhuma detona��o.";
	
	public ConhecimentoDemolicao() {
		super(nome, desc, especializacao);
	}
}
