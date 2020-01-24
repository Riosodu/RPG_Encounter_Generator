package complicacao.savageworlds;

import core.Complicacao;

public class Forasteiro extends Complicacao {
	public Forasteiro(String tipo) {
		super("Forasteiro", "Em uma sociedade formada por apenas alguns " + 
				"tipos de pessoa, o seu her�i n�o � uma delas. " + 
				"Um �ndio em uma cidade do Velho Oeste, um " + 
				"alien�gena em um jogo de fic��o cient�fica de " + 
				"fuzileiros humanos ou um meio-orc em um grupo " + 
				"de elfos, an�es e humanos s�o todos exemplos de " + 
				"Forasteiros. Habitantes locais s�o suscet�veis a " + 
				"aumentar os pre�os para o Forasteiro, ignorar " + 
				"seus pedidos de socorro e geralmente tratam-no " + 
				"como se fosse de uma classe mais baixa que a do " + 
				"resto de sua sociedade. " + 
				"Al�m dos efeitos de interpreta��o acima, o " + 
				"Carisma do seu her�i sofre um modificador de " + 
				"-2 em rela��o a todos menos o seu pr�prio povo.", tipo, "Menor");
	}
}
