package pericia.savageworlds;

import core.Pericia;

public class Manha extends Pericia {
	private static String desc = "Personagens com Manha s�o capazes de obter " + 
			"informa��es das ruas, sal�es ou outros contatos " + 
			"atrav�s de subornos, amea�as ou barganhas. " + 
			"Encontrar informa��o escrita em bibliotecas e " + 
			"similares � coberto pela per�cia Investigar. Manha " + 
			"� sempre modificada pelo Carisma do personagem.";
	
	public Manha() {
		super("Manha", desc, new atributo.Astucia());
	}
	
	public Manha(int nivelDado) {
		super("Manha", desc, new atributo.Astucia(), nivelDado);
	}
}