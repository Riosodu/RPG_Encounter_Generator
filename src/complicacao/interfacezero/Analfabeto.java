package complicacao.interfacezero;

import core.Complicacao;

public class Analfabeto extends Complicacao {
	public Analfabeto(String tipo) {
		super("Analfabeto", "Seu her�i n�o consegue ler. Ele provavelmente " + 
				"pode assinar seu nome e sabe o significado de um " + 
				"sinal de PARE, mas n�o pode fazer muito mais que " + 
				"isso. Tamb�m n�o sabe muito sobre matem�tica. " + 
				"Consegue provavelmente efetuar 2+2=4, mas " + 
				"multiplica��es e similares est�o fora do seu alcance. " + 
				"A prop�sito, analfabetos n�o podem ler ou" + 
				"escrever em nenhum idioma, n�o importa quantos " + 
				"eles realmente falem.", tipo, "Maior");
	}
}