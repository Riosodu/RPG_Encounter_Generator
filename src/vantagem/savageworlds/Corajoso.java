package vantagem.savageworlds;

import atributo.Espirito;
import core.Progresso;
import core.Requisito;

public class Corajoso extends VantagemAntecedente {
	private static final String nome = "Corajoso";
	private static final String desc = "Aqueles com esta Vantagem aprenderam " + 
			"a dominar o seu medo. Ou talvez estejam t�o " + 
			"calejados ou emocionalmente distantes que " + 
			"perderam sua rea��o normal de �lutar ou correr�. " + 
			"De qualquer maneira, seu her�i adiciona +2 a " + 
			"testes de Medo. Caso o personagem esteja em " + 
			"um cen�rio que usa Coragem como uma Regra " + 
			"de Ambienta��o, o b�nus � adicionado � per�cia " + 
			"tamb�m.";
	
	public Corajoso() {
		super(nome, desc, new Requisito(new Progresso(0)), new Requisito(new Espirito(6)));
	}
}
