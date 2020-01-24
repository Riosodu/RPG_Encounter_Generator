package pericia.interfacezero;

import core.Pericia;

public class Hacking extends Pericia {
	private static String desc = "A per�cia Hacking e usada sempre que " + 
			"um personagem quer invadir uma rede de computadores. " + 
			"Personagens em Interface Zero 2.0 n�o mais come�am " + 
			"com um d4 autom�tico em Hacking. Al�m disso, personagens " + 
			"que desejem usar a DataNet Global para prop�sitos " + 
			"cotidianos como pesquisa ou encontrar not�cias na Deep, " + 
			"o fazem com suas per�cias de Investigar e Manha";
	
	public Hacking() {
		super("Hacking", desc, new atributo.Astucia());
	}
	
	public Hacking(int nivelDado) {
		super("Hacking", desc, new atributo.Astucia(), nivelDado);
	}
}
