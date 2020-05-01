package vantagem.savageworlds;

import core.Progresso;
import requisito.RequisitoProgresso;

public class Ambidestro extends VantagemAntecedente {
	public static final String nome = "Ambidestro";
	public static final String desc = "Seu her�i � h�bil tanto com a sua m�o " + 
			"esquerda quanto com a sua direita. Personagens " + 
			"normalmente sofrem uma penalidade de -2 ao " + 
			"executar tarefas f�sicas utilizando a m�o in�bil " + 
			"(presume-se que personagens sejam destros). Com " + 
			"esta Vantagem, seu her�i ignora a penalidade de -2 " + 
			"por usar sua m�o in�bil";
	
	public Ambidestro() {
		super(nome, desc, new RequisitoProgresso(new Progresso(0)));
	}
}
