package vantagem.savageworlds;

import atributo.Espirito;
import core.Progresso;
import core.Requisito;

public class ResistenciaArcana extends VantagemAntecedente {
	private static final String nome = "Resist�ncia Arcana";
	private static final String desc = "Este indiv�duo � particularmente resistente " + 
			"a magia (inclusive psiquismo, ci�ncia estranha, " + 
			"etc.), seja por natureza ou herdado. Ele age como  " + 
			"se tivesse 2 pontos de Armadura quando for " + 
			"atingido por poderes arcanos causadores de dano e " + 
			"adiciona +2 a suas rolagens de Caracter�sticas para " + 
			"resistir a poderes opostos. Mesmo poderes arcanos " + 
			"amig�veis precisam subtrair esse modificador para " + 
			"afetar o her�i resistente.";
	
	public ResistenciaArcana() {
		super(nome, desc, new Requisito(new Progresso(0)), new Requisito(new Espirito(8)));
	}
}
