package pericia.savageworlds;

import core.Pericia;

public class Atirar extends Pericia {
	private static String desc = "Atirar cobre todas as tentativas de atingir um " + 
			"alvo com armas de combate a dist�ncia como " + 
			"arcos, pistolas ou lan�a-foguetes. A Dificuldade " + 
			"b�sica para acertar � 4. Contudo, existe um n�mero " + 
			"importante de modificadores, como a dist�ncia em " + 
			"que o alvo se encontra, aparecendo frequentemente " + 
			"no jogo.";
	
	 public Atirar() {
		super("Atirar", desc, new atributo.Agilidade());
	}
	 
	 public Atirar(int nivelDado) {
			super("Atirar", desc, new atributo.Agilidade(), nivelDado);
		}
}
