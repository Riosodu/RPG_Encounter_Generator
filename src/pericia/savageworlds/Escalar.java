package pericia.savageworlds;

import atributo.Forca;
import core.Pericia;

public class Escalar extends Pericia {
	public static final String nome = "Escalar";
	public static final String desc = "Personagens �s vezes podem ter de escalar " + 
			"objetos altos sob press�o, talvez escalar uma ravina " + 
			"para atacar arqueiros posicionados acima ou para " + 
			"escapar de uma criatura terr�vel no terreno abaixo. " + 
			"Normalmente nenhuma rolagem � necess�ria " + 
			"para subir ladeiras, cordas ou �rvores com muitos " + 
			"galhos a menos que o Mestre veja uma boa raz�o " + 
			"para tal (sendo perseguido, ferido, etc.). Em " + 
			"situa��es mais estressantes, um personagem faz " + 
			"uma rolagem de Escalar e verifica o resultado " + 
			"a seguir. Lembre-se que estes par�metros est�o " + 
			"listados em quadros na mesa, com cada quadro " + 
			"representando dois metros no mundo real. " + 
			"� Falha: O personagem n�o faz nenhum " + 
			"progresso. Se a rolagem de Escalar tiver um " + 
			"total de 1 ou menos, ele cai para o pr�ximo " + 
			"n�vel abaixo � qualquer que seja. " + 
			"Se o her�i estava " + 
			"preso por uma corda ou outro freio, ele cai " + 
			"metade do comprimento do freio e sofre " + 
			"um n�vel de Fadiga ao inv�s disso. " + 
			"� Sucesso: O her�i sobe um n�mero de " + 
			"quadros verticais na mesa iguais � metade " + 
			"da sua For�a. Um personagem com For�a" + 
			"d6, por exemplo, consegue escalar 3 " + 
			"quadros em uma rodada se conseguir sua " + 
			"rolagem de Escalar. " + 
			"� Amplia��o: Como um Sucesso, descrito " + 
			"acima, mas o personagem se move com " + 
			"um adicional de 2 quadros. " + 
			"� Cordas: Aqueles presos por uma corda " + 
			"sofrem apenas um n�vel de Fadiga por " + 
			"Machucados e Escoria��es. � claro que o Mestre pode decidir " + 
			"que a corda tenha uma chance de se partir " + 
			"sob uma tens�o s�bita. Na realidade isso " + 
			"� raro, mas para efeito dram�tico, jogue " + 
			"um d6. Em um 1, a corda se parte e o" +
			"personagem cai toda a extens�o da �ltima " + 
			"se��o escalada. " + 
			"� Escaladas Planejadas: Divida subidas " + 
			"longas em tr�s se��es aproximadamente " + 
			"iguais. Falhar em uma rolagem de Escalar " + 
			"depois de uma divis�o normalmente " + 
			"significa que o her�i cai essa dist�ncia no " + 
			"caso de uma escalada livre.";
	
	public Escalar() {
		super(new Forca());
	}
	
	public Escalar(int nivelDado) {
		super(new Forca(), nivelDado);
	}
}
