package vantagem.savageworlds;

import core.Vantagem;
import requisito.Requisito;

public abstract class VantagemAntecedente extends Vantagem{
	public static final String tipo = "Vantagem de Antecedente";
	public static final String desc_tipo = "Estas Vantagens s�o benef�cios heredit�rios e " + 
			"hist�ricos ou rea��es treinadas que se desenvolvem " + 
			"em um personagem depois de treinamento " + 
			"prolongado ou exposi��o a certos eventos. " + 
			"Jogadores podem escolher estas Vantagens " + 
			"depois da cria��o do personagem, mas o Mestre " + 
			"pode exigir um pouco mais de racionaliza��o. " + 
			"Algu�m pode escolher a Vantagem Atraente, " + 
			"por exemplo, se arrumando, passando por uma " + 
			"transforma��o e geralmente dando mais aten��o " + 
			"a sua apar�ncia. Personagens tamb�m podem " + 
			"ser capazes de ganhar a Vantagem Antecedente " + 
			"Arcano, caso encontrem um livro de conhecimento " + 
			"proibido ou treinando sob a tutela de outro " + 
			"indiv�duo arcano no seu grupo.";
	
	protected VantagemAntecedente(String nome, String desc) {
		super(nome, desc, tipo, desc_tipo);
	}
	
	protected VantagemAntecedente(String nome, String desc, Requisito ... requisitos) {
		super(nome, desc, tipo, desc_tipo, requisitos);
	}

}
