package complicacao.interfacezero;

import core.Complicacao;

public class Desplugado extends Complicacao {
	public static final String name = "Desplugado";
	public static final String desc = "Voc� n�o tem um TAP e � incapaz de ver "
			+ "ou interagir com Hiper-Realidade ou realidade virtual "
			+ "de qualquer modo; incluindo, mas n�o limitado a, "
			+ "telas digitais, banco instant�neo e TAPPlicativos. Voc� "
			+ "tamb�m n�o pode ter a per�cia Hacking, uma vez que n�o "
			+ "pode acessar os dados de maneira apropriada. Voc� pode "
			+ "remover esta Compli-ca��o gastando um Progresso e "
			+ "comprando um TAP por 5,000 cr�ditos. Uma vez que tenha "
			+ "instalado um TAP, voc� poder� ter a per�cia Hacking.";
	public static final String tipoPossivel[] = {"Maior"};
	
	public Desplugado() {
		super();
	}

	public Desplugado(String tipo) {
		super(tipo);
	}
}
