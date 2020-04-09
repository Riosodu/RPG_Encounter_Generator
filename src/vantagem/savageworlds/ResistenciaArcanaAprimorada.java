package vantagem.savageworlds;

import core.Progresso;
import requisito.RequisitoProgresso;
import requisito.RequisitoVantagem;

public class ResistenciaArcanaAprimorada extends VantagemAntecedente {
	public static final String nome = "Resist�ncia Arcana Aprimorada";
	public static final String desc = "Este indiv�duo � particularmente resistente " + 
			"a magia (inclusive psiquismo, ci�ncia estranha, " + 
			"etc.), seja por natureza ou herdado. Ele age como " + 
			"se tivesse 4 pontos de Armadura quando for " + 
			"atingido por poderes arcanos causadores de dano e " + 
			"adiciona +4 a suas rolagens de Caracter�sticas para " + 
			"resistir a poderes opostos. Mesmo poderes arcanos " + 
			"amig�veis precisam subtrair esse modificador para " + 
			"afetar o her�i resistente.";
	
	public ResistenciaArcanaAprimorada() {
		super(new RequisitoProgresso(new Progresso(0)), new RequisitoVantagem(new ResistenciaArcana()));
	}
}
