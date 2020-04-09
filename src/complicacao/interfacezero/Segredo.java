package complicacao.interfacezero;

import core.Complicacao;

public class Segredo extends Complicacao {
	public static final String nome = "Segredo";
	public static final String desc = "Seu personagem tem um segredo que, se descoberto, " + 
			"ir� complicar a sua vida severamente. Pode ser que ele " + 
			"j� tenha trabalhado para uma das grandes megacorpora��es " + 
			"e ajudado a desenvolver uma arma biol�gica que " + 
			"atualmente aflige grandes parcelas da popula��o. Talvez " + 
			"seu personagem seja um policial disfar�ado que est� atualmente " + 
			"infiltrado em uma gangue. Talvez ele usou seu " + 
			"pr�prio simulacro e fez todo tipo de coisas ruins com ele. " + 
			"Ou talvez ele seja um bior�ide tentando desesperadamente " + 
			"fingir que � humano. Em todos os casos, a revela��o do " + 
			"segredo causar� grandes problemas para o seu personagem. " + 
			"A vers�o Menor desta Complica��o simplesmente " + 
			"significa que a revela��o do segredo ser� um grande embara�o, " + 
			"e possivelmente tornar� o personagem procurado; " + 
			"ou perder� contatos, amigos e associados devido a sua " + 
			"natureza. A vers�o Maior desta Complica��o significa que " + 
			"a vida do personagem ser� posta em perigo direto a partir " + 
			"da revela��o desse segredo. Se o caldo for permanentemente " + 
			"entornado e n�o h� esperan�a de acobertar isso, o " + 
			"Mestre pode substituir esta Complica��o por uma outra de " + 
			"igual medida: ex. Forasteiro para a vers�o Menor ou Inimigo " + 
			"(Maior) para a vers�o Maior.";
	
	public Segredo(String tipo) {
		super(tipo, "Menor", "Maior");
	}
}
