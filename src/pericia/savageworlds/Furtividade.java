package pericia.savageworlds;

import core.Atributo;
import core.Pericia;

public class Furtividade extends Pericia {
	public static final String nome = "Furtividade";
	public static final String desc = "Furtividade � tanto a habilidade de permanecer " + 
			"escondido e mover-se em sil�ncio como tamb�m " + 
			"de furtar objetos e bater carteiras. Em muitos " + 
			"jogos de Savage Worlds, saber exatamente quando " + 
			"seu personagem foi visto e quando n�o foi pode " + 
			"ser decisivo. " + 
			"Para um personagem se aproximar sorrateiramente " + 
			"de inimigos e se infiltrar nas linhas inimigas, " + 
			"comece definindo se os �guardas� dos quais " + 
			"seus her�is est�o se escondendo s�o �ativos� ou " + 
			"�inativos�. Guardas Inativos n�o est�o particularmente " + 
			"prestando aten��o ao seu redor. O grupo " + 
			"s� precisa conseguir um sucesso padr�o em suas " + 
			"rolagens individuais de Furtividade para evitar " + 
			"ser visto. Falhar numa rolagem de Furtividade na " + 
			"presen�a de guardas inativos torna-os ativos. " + 
			"Guardas Ativos fazem rolagens resistidas " + 
			"de Perceber contra a per�cia Furtividade dos " + 
			"personagens se esgueirando. Falhar numa " + 
			"rolagem contra guardas ativos faz com que os " + 
			"personagens sejam vistos.";
	
	public Furtividade() {
		super(nome, desc, Atributo.AGILIDADE);
	}
	
	public Furtividade(int nivelDado) {
		super(nome, desc, Atributo.AGILIDADE, nivelDado);
	}
}
