package vantagem.interfacezero;

import complicacao.savageworlds.Voto;
import core.Progresso;
import core.Requisito;
import vantagem.savageworlds.VantagemAntecedente;

public class Rico extends VantagemAntecedente {
	private static final String nome = "Rico";
	private static final String desc = "Personagens Ricos triplicam seus fundos iniciais e ganham "
			+ "um b�nus de 12,500 cr�ditos em cada Progresso. Contudo, o dinheiro sempre v�m "
			+ "com uma obriga��o. Eles podem ganhar dinheiro de um patroc�nio corporativo, "
			+ "um fundo trust ou mesmo um neg�cio que o personagem tem e administra. "
			+ "Exemplos de personagens ricos no g�nero s�o Sylvia Stingray de Bubblegum "
			+ "Crisis e logan Cale de Dark Angel; ambos tinham obriga��es (administrando "
			+ "um neg�cio, ser legal com a fam�lia) que eles cumprem a fim de manter "
			+ "seu dinheiro. Esta � uma Complica��o Voto (Menor) que voc� deve "
			+ "discutir com o seu Mestre � falhar em cumprir o Voto "
			+ "significa que o personagem n�o recebe seus cr�ditos extras at� "
			+ "que ele cuide dessas obriga��es. Se o personagem perder completamente"
			+ " os benef�cios da Vantagem, ele pode, a crit�rio do Mestre, substituir"
			+ " a Vantagem com outra coisa.";
	
	public Rico() {
		super(nome, desc, new Requisito(new Progresso(0)), new Requisito(new Voto("")));
	}
}