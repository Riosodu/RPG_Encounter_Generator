package pericia.savageworlds;

import atributo.Astucia;
import core.Pericia;

public class Curar extends Pericia {
	public static final String nome = "Curar";
	public static final String desc = "Curar � a arte de estancar ferimentos e tratar " + 
			"les�es existentes. Em geral, cada sucesso e " + 
			"amplia��o em uma rolagem de Curar eliminam " + 
			"um ferimento. O curandeiro precisa subtrair n�o " + 
			"apenas seus pr�prios ferimentos da rolagem, mas " + 
			"tamb�m os do seu paciente.";
	
	public Curar() {
		super(new Astucia());
	}
	
	public Curar(int nivelDado) {
		super(new Astucia(), nivelDado);
	}
}
