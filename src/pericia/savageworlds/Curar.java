package pericia.savageworlds;

import core.Pericia;

public class Curar extends Pericia {
	private static String desc = "Curar � a arte de estancar ferimentos e tratar " + 
			"les�es existentes. Em geral, cada sucesso e " + 
			"amplia��o em uma rolagem de Curar eliminam " + 
			"um ferimento. O curandeiro precisa subtrair n�o " + 
			"apenas seus pr�prios ferimentos da rolagem, mas " + 
			"tamb�m os do seu paciente.";
	
	public Curar() {
		super("Curar", desc, new atributo.Astucia());
	}
	
	public Curar(int nivelDado) {
		super("Curar", desc, new atributo.Astucia(), nivelDado);
	}
}
