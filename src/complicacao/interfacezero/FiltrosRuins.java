package complicacao.interfacezero;

import core.Complicacao;

public class FiltrosRuins extends Complicacao {
	public FiltrosRuins(String tipo) {
		super("Filtros Ruins", "Seus filtros de spam t�m glitches. Voc� "
				+ "est� sendo con-stantemente bombardeado por spam, "
				+ "v�rus e outros malwares. Este bombardeio constante "
				+ "torna mais prov�vel que eventualmente algo ruim penetre "
				+ "no seu firewall. Con-sequentemente, seu firewall � "
				+ "reduzido em 1 com a vers�o Menor desta complica��o, ou "
				+ "em 2 para a vers�o Maior.", tipo, "Menor", "Maior");
	}
}
