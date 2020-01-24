package pericia.savageworlds;

import core.Pericia;

public class Conhecimento extends Pericia {
	private static String desc = "Conhecimento � uma per�cia abrangente " + 
			"que deve possuir algum tipo de foco, como " + 
			"Conhecimento (Ocultismo) ou Conhecimento " + 
			"(Ci�ncia). O jogador pode escolher o foco do " + 
			"Conhecimento do seu personagem, devendo " + 
			"refletir seu hist�rico e instru��o. Um arque�logo, " + 
			"por exemplo, deveria ter Conhecimento (Hist�ria) " + 
			"e Conhecimento (Arqueologia). " + 
			"Focos gerais como Ci�ncia s�o aceit�veis, mas o " + 
			"Mestre deve dar um b�nus a um personagem cujo " + 
			"foco escolhido seja mais relevante a uma tarefa em " + 
			"particular, como usar um Conhecimento (Biologia) " + 
			"para identificar uma planta ou animal. " + 
			"Alguns focos de Conhecimento s�o: �rea, " + 
			"Batalha (usado em Combate em Massa, veja a " + 
			"p�gina 109), Computadores, Eletr�nica, Hist�ria, " + 
			"Jornalismo, v�rios idiomas, Lei, Medicina (embora " + 
			"cuidar de algu�m exija a per�cia Curar) ou Ci�ncia.";
	
	public Conhecimento(String especializacao) {
		super("Conhecimento (" + especializacao + ")", desc, new atributo.Astucia(), especializacao);
	}
	
	public Conhecimento(String nome, String desc, String especializacao) {
		super(nome, desc, new atributo.Astucia(), especializacao);
	}
	
	public Conhecimento(String nome, String desc, String especializacao, int nivelDado) {
		super(nome, desc, new atributo.Astucia(), nivelDado, especializacao);
	}
	
	public Conhecimento(String especializacao, int nivelDado) {
		super("Conhecimento (" + especializacao + ")", desc, new atributo.Astucia(), nivelDado, especializacao);
	}
	
}
