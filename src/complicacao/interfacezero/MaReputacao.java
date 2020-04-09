package complicacao.interfacezero;

import core.Complicacao;

public class MaReputacao extends Complicacao {
	public static final String nome = "M� Reputa��o";
	public static final String desc = "As pessoas pensam o pior do seu personagem. "
			+ "Se algo ruim acontece, ele � a primeira pessoa a levar "
			+ "a culpa. Talvez ele mere�a, talvez n�o, mas ningu�m parece "
			+ "se importar com o que ele tem a dizer sobre o assunto.Como "
			+ "uma Complica��o Menor, os rumores que as pessoas levantam "
			+ "sobre seu personagem s�o realmente verdades exageradas ou "
			+ "completas mentiras. Talvez voc� tenha alguns contatos na "
			+ "Yakuza, mas isso n�o significa que voc� � �um matador dur�o "
			+ "que a Yakuza contrata para miss�es especiais�. Como uma "
			+ "Complica��o Maior, voc� na verdade tem algum tipo de ficha criminal. "
			+ "A pol�cia provavelmente ir� aparecer na sua porta se algo "
			+ "acontece na sua �rea, mesmo que voc� n�o tenha nada a ver com isso, "
			+ "e voc� j� viu o interior de v�rias salas de interrogat�rio";
	public static final String tipoPossivel[] = {"Menor", "Maior"};
	
	public MaReputacao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MaReputacao(String tipo) {
		super(tipo);
	}
}
