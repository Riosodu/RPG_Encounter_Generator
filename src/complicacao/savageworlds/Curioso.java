package complicacao.savageworlds;

import core.Complicacao;

public class Curioso extends Complicacao {
	public static final String nome = "Curioso";
	public static final String desc = "A curiosidade matou o gato e tamb�m pode " + 
			"matar seu her�i. Personagens curiosos s�o " + 
			"facilmente arrastados para qualquer aventura. Eles " + 
			"t�m de verificar tudo e sempre querem saber o que " + 
			"h� por tr�s de um mist�rio em potencial.";
	public static final String tipoPossivel[] = {"Maior"};
	
	public Curioso() {
		super(nome, desc, tipoPossivel);
	}
	
	public Curioso(String tipo) {
		super(nome, desc, tipoPossivel, tipo);
	}
}
