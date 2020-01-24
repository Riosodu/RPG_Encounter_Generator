package complicacao.interfacezero;

import core.Complicacao;

public class NanoInfeccao extends Complicacao {
	public NanoInfeccao(String tipo) {
		super("Nano-Infec��o", "Seu personagem foi infectado com um nano-v�rus e acabou " + 
				"se ferrando no quesito muta��o. Como uma Complica��o " + 
				"Menor, escolha uma Per�cia, o Dado Selvagem associado " + 
				"aquela per�cia � um passo menor (normalmente um d4). " + 
				"Como uma Complica��o Maior selecione um Atributo. O " + 
				"Dado Selvagem para aquele Atributo � um passo menor " + 
				"(normalmente um d4). " + 
				"Nano-Infec��o pode ser adquirida m�ltipl�s vezes (se um " + 
				"personagem ficar totalmente ferrado por algum nano-v�rus), " + 
				"embora os benef�cios ganhos por assumir a Complica��o " + 
				"ainda sejam limitados a um Maior e dois Menores", tipo, "Menor", "Maior");
	}
}
