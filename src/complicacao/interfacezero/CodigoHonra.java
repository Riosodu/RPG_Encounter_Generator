package complicacao.interfacezero;

import core.Complicacao;

public class CodigoHonra extends Complicacao {
	public static final String nome = "C�digo de Honra";
	public static final String desc = "H� muitos c�digos de honra diferentes dentro do g�nero " + 
			"cyberpunk, com o mais conhecido sendo talvez o c�digo " + 
			"do Samurai das Ruas, que � baseado no c�digo Japon�s do " + 
			"Bushido. Jogadores e Mestres devem se sentir livres para " + 
			"modificar essa Complica��o para melhor se encaixar nos " + 
			"diferentes c�digos de honra que algu�m pode encontrar " + 
			"dentro do mundo de Interface Zero 2.0.";
	public static final String tipoPossivel[] = {"Maior"};
	
	public CodigoHonra() {
		
	}
	
	public CodigoHonra(String tipo) {
		super(tipo);
	}
}
