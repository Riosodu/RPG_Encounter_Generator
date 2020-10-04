package pericia.savageworlds;

import core.Atributo;
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
		super(nome, desc, Atributo.ASTUCIA);
	}
	
	public Curar(int nivelDado) {
		super(nome, desc, Atributo.ASTUCIA, nivelDado);
	}
}
