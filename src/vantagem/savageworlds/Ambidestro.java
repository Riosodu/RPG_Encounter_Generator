package vantagem.savageworlds;

import core.Progresso;
import core.Requisito;
import atributo.Agilidade;

public class Ambidestro extends VantagemAntecedente {
	private static final String nome = "Ambidestro";
	private static final String desc = "Seu her�i � h�bil tanto com a sua m�o " + 
			"esquerda quanto com a sua direita. Personagens " + 
			"normalmente sofrem uma penalidade de -2 ao " + 
			"executar tarefas f�sicas utilizando a m�o in�bil " + 
			"(presume-se que personagens sejam destros). Com " + 
			"esta Vantagem, seu her�i ignora a penalidade de -2 " + 
			"por usar sua m�o in�bil";
	
	public Ambidestro() {
		super(nome, desc, new Requisito(new Progresso(0)), new Requisito(new Agilidade(8)));
	}
	
}
