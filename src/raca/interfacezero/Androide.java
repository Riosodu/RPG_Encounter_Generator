package raca.interfacezero;

import core.Raca;

public class Androide extends Raca {
	private static final String nome = "Andr�ide";
	private static final String desc =  "Todos os andr�ides, independente de suas fun��es, compartilham "
			+ "algumas caracter�sticas de design fundamentais. Andr�ides podem comprar cibern�ticos como "
			+ "todo mundo e sofrem de Tens�o."
			+ "\nConstruto: Andr�ides acrescentam +2 para se recuperar de "
			+ "Abalado, n�o sofrem modificadores de ferimentos e s�o imunes a venenos e doen�as. Andr�ides "
			+ "n�o podem se curar naturalmente. Curar um andr�ide requer a per�cia Consertar � que � usada "
			+ "como a per�cia Curar, sem a �Hora de Ouro�."
			+ "\n� Processador Duplo: Andr�ides come�am com um d6 em Ast�cia."
			+ "\n� Vulnerabilidade a PEM: Andr�ides sofrem dando completo de Armas PEM."
			+ "\n� C�rebro Met�lico : Andr�ides n�o podem escolher Antecedente Arcano (Psi�nicos)."
			+ "\n� Liga Met�lica: A pele completamente met�lica de um andr�ide oferece resist�ncia a armas de fogo leves. "
			+ "Eles t�m +2 de Armadura."
			+ "\n� Forasteiro: Ra�as org�nicas geralmente desconfiam ou n�o entendem bem andr�ides. Eles subtraem 2 de "
			+ "seu Carisma quando lidam com outras ra�as que n�o a sua pr�pria."
			+ "\n� Protocolo Prim�rio: Andr�ides come�am com um d6 gratuito em uma per�cia, representando"
			+ " o seu sistema operacional central."
			+ "\n� Recarga: Andr�ides necessitam de eletricidade para funcionar. Se o andr�ide n�o puder acessar uma "
			+ "sa�da el�trica de algum tipo ao menos uma vez por dia, ele sofre um n�vel de Fadiga a cada dia at� que "
			+ "fique incapacitado. No dia ap�s desse, ele fica �desligado� e tem que ser reativado com um teste de "
			+ "Consertar e uma carga de quatro horas. Isso substitui a necessidade do andr�ide por �gua e comida."
			+ "\n� Antinatural: Psi�nicos, tanto ben�ficos quanto mal�ficos, sofre uma penalidade de -2 para afetar andr�ides. "
			+ "Isso n�o tem efeito em poderes que causam dano, que os afetam normalmente.";
	
	public Androide() {
		super(nome, desc);
	}
	
	protected void setModificadores() {
		
	}
}
