package complicacao.savageworlds;

import core.Complicacao;

public class Inimigo extends Complicacao {
	public Inimigo(String tipo) {
		super("Inimigo", "Algu�m odeia seu her�i e quer v�-lo morto. " + 
				"O valor da Complica��o depende do qu�o " + 
				"poderoso � o Inimigo e de quantas vezes ele " + 
				"poder� aparecer. Um Inimigo Menor pode ser " + 
				"um pistoleiro solit�rio buscando vingan�a. " + 
				"Um Inimigo Maior pode ser um pistoleiro " + 
				"sobrenatural que deseja o seu her�i morto. " + 
				"Se o Inimigo um dia for vencido, o Mestre " + 
				"deve trabalhar gradualmente em um substituto " + 
				"ou o her�i pode pagar pela Complica��o " + 
				"sacrificando um Progresso.", tipo, "Menor", "Maior");
	}
}