package complicacao.savageworlds;

import core.Complicacao;

public class Jovem extends Complicacao {
	public static final String nome = "Jovem";
	public static final String desc = "Crian�as �s vezes s�o for�adas a partir em " + 
			"aventuras perigosas devido a circunst�ncias " + 
			"infelizes. Pense cuidadosamente antes de escolher " + 
			"esta Complica��o, pois seu jovem come�ar� com " + 
			"uma desvantagem significativa. " + 
			"Her�is jovens geralmente t�m entre 8-12 anos " + 
			"de idade (em anos humanos � fa�a os devidos " + 
			"ajustes para ra�as com paradigmas diferentes de " + 
			"envelhecimento). T�m apenas tr�s pontos para " + 
			"ajustar os seus atributos e 10 pontos de per�cia. " + 
			"Em compensa��o, jovens como estes t�m certa " + 
			"por��o de sorte. Eles sacam um Bene adicional " + 
			"no in�cio de cada sess�o de jogo, em adi��o a " + 
			"quaisquer Benes adicionais ganhos de coisas " + 
			"como as Vantagens Sorte e Sorte Grande. " + 
			"Se o personagem viver tempo o suficiente " + 
			"para atingir a maturidade, a Complica��o n�o " + 
			"precisa ser paga, pois o pre�o j� foi pago pela " + 
			"Complica��o por ter come�ado em desvantagem. " + 
			"Entretanto, ele deixa de receber o Bene adicional " + 
			"ao completar 18 anos de idade (ou a idade da " + 
			"maioridade do cen�rio em quest�o).";
	public static final String tipoPossivel[] = {"Maior"};
	
	public Jovem() {
		super(nome, desc, tipoPossivel);
	}
	
	public Jovem(String tipo) {
		super(nome, desc, tipoPossivel, tipo);
	}
}
