package pericia.interfacezero;

import pericia.savageworlds.Conhecimento;

public class ConhecimentoProgramacao extends Conhecimento {
	private static final String especializacao = "Programa��o";
	private static final String nome = "Conhecimento (Programa��o)";
	private static final String desc = "Personagens usam esta " + 
			"per�cia quando tentam fazer qualquer tipo de altera��o em " + 
			"uma rede que eles invadiram. Essa per�cia permite a um " + 
			"personagem desfazer um dano resultante de um hack. Com " + 
			"ela, um personagem pode fazer coisas como desfazer e " + 
			"editar um arquivo de dados ou v�deo, restaurar um arquivo " + 
			"deletado, reparar um SAM, " + 
			"recuperar um Engrama de per�cia deletado ou reconectar " + 
			"um TAP que ficou offline.";
	
	public ConhecimentoProgramacao() {
		super(especializacao);
	}
}
