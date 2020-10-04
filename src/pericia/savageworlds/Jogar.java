package pericia.savageworlds;

import core.Atributo;
import core.Pericia;

public class Jogar extends Pericia {
	public static final String nome = "Jogar";
	public static final String desc = "Jogar � �til dos sal�es do Velho Oeste aos " + 
			"alojamentos da maioria dos ex�rcitos. Aqui est� " + 
			"uma maneira r�pida de simular cerca de meia hora " + 
			"de jogatina sem ter de rolar para cada lance dos " + 
			"dados ou m�o de cartas. " + 
			"Primeiro todos devem concordar com as apostas, " + 
			"como $10, 10 pe�as de ouro, etc. Agora todos no " + 
			"jogo t�m de fazer uma rolagem de Jogar. O menor " + 
			"resultado paga ao maior resultado a diferen�a " + 
			"vezes a aposta. O segundo menor resultado paga ao " + 
			"segundo maior resultado a diferen�a vezes a aposta " + 
			"e assim por diante. Se sobrar algu�m sozinho no " + 
			"meio, ele fica na m�dia. " + 
			"Exemplo: Kali rola mais alto com um 10 e Yuri " + 
			"rola mais baixo com um 4. A diferen�a � 6, assim " + 
			"Yuri paga a Kali 6x a aposta de $10 ou $60. " + 
			"� Trapaceando: Um personagem " + 
			"trapaceando adiciona +2 a sua rolagem. " + 
			"O Mestre pode aumentar ou diminuir " + 
			"este modificador dependendo do jogo ou " + 
			"dos m�todos espec�ficos de trapa�a. Se o " + 
			"personagem alguma vez rolar um 1 em seu " + 
			"dado de per�cia (independente do seu Dado " + 
			"Selvagem), � apanhado. As consequ�ncias " + 
			"variam dependendo do cen�rio, mas " + 
			"normalmente s�o bastante severas.";
	
	public Jogar() {
		super(nome, desc, Atributo.ASTUCIA);
	}
	
	public Jogar(int nivelDado) {
		super(nome, desc, Atributo.ASTUCIA, nivelDado);
	}
}
