package raca.interfacezero;

import core.NPC;
import core.Raca;

public class Androide extends Raca {
	public static final String NOME = "Andróide";
	public static final String DESCRICAO = """
			Todos os andróides, independente de suas funções, compartilham algumas características de design fundamentais. Andróides podem comprar cibernéticos como todo mundo e sofrem de Tensão.
			Construto: Andróides acrescentam +2 para se recuperar de Abalado, não sofrem modificadores de ferimentos e são imunes a venenos e doenças. Andróides não podem se curar naturalmente. Curar um andróide requer a perícia Consertar — que é usada como a perícia Curar, sem a “Hora de Ouro”.
			• Processador Duplo: Andróides começam com um d6 em Astúcia.
			• Vulnerabilidade a PEM: Andróides sofrem dando completo de Armas PEM.
			• Cérebro Metálico : Andróides não podem escolher Antecedente Arcano (Psiônicos).
			• Liga Metálica: A pele completamente metálica de um andróide oferece resistência a armas de fogo leves. Eles têm +2 de Armadura.
			• Forasteiro: Raças orgânicas geralmente desconfiam ou não entendem bem andróides. Eles subtraem 2 de seu Carisma quando lidam com outras raças que não a sua própria.
			• Protocolo Primário: Andróides começam com um d6 gratuito em uma perícia, representando o seu sistema operacional central.
			• Recarga: Andróides necessitam de eletricidade para funcionar. Se o andróide não puder acessar uma saída elétrica de algum tipo ao menos uma vez por dia, ele sofre um nível de Fadiga a cada dia até que fique incapacitado. No dia após desse, ele fica “desligado” e tem que ser reativado com um teste de Consertar e uma carga de quatro horas. Isso substitui a necessidade do andróide por água e comida.
			• Antinatural: Psiônicos, tanto benéficos quanto maléficos, sofre uma penalidade de -2 para afetar andróides. Isso não tem efeito em poderes que causam dano, que os afetam normalmente.""";

	public Androide() {
		super(NOME, DESCRICAO);
	}
	
	protected void setModificadores() {
		
	}

	@Override
	public void aplicarEfeitos(NPC npc) {

	}
}
