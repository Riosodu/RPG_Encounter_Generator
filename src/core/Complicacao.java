package core;

public enum Complicacao implements Checavel{
	ANALFABETO("Analfabeto","Seu her�i n�o consegue ler. Ele provavelmente " +
			"pode assinar seu nome e sabe o significado de um " +
			"sinal de PARE, mas n�o pode fazer muito mais que " +
			"isso. Tamb�m n�o sabe muito sobre matem�tica. " +
			"Consegue provavelmente efetuar 2+2=4, mas " +
			"multiplica��es e similares est�o fora do seu alcance. " +
			"A prop�sito, analfabetos n�o podem ler ou" +
			"escrever em nenhum idioma, n�o importa quantos " +
			"eles realmente falem.", Jogo.INTERFACE_ZERO, TipoComplicacao.MAIOR),

	CEGO("Cego", "O indiv�duo � completamente cego. Ele sofre " +
			"-6 em todas as tarefas f�sicas dependentes da vis�o " +
			"(ou seja, praticamente tudo) e -2 na maior parte das " +
			"tarefas sociais, pois n�o pode �ler� quem interage " +
			"com ele t�o bem como os outros. " +
			"Por outro lado, personagens Cegos ganham uma " +
			"Vantagem gratuita a sua escolha para compensar " +
			"esta Complica��o particularmente dif�cil.\n\n" +
			"No mundo de Interface Zero 2.0, a medicina avan�ou ao " +
			"ponto em que a Complica��o listada " +
			"acima pode ser removida com um simples procedimento " +
			"m�dico. Por causa disso, qualquer personagem que assuma " +
			"essas Complica��es na cria��o de personagem, e ent�o " +
			"usa Aprimoramentos em jogo para remov�-las, tamb�m " +
			"deve gastar um Progresso. Aqueles que assumem essas " +
			"Complica��es na cria��o de personagem n�o podem anular " +
			"os seus efeitos com Aprimoramentos durante a cria��o de " +
			"personagem.", Jogo.INTERFACE_ZERO, TipoComplicacao.MAIOR),

	CODIGO_HONRA("C�digo de Honra", "H� muitos c�digos de honra diferentes dentro do g�nero " +
			"cyberpunk, com o mais conhecido sendo talvez o c�digo " +
			"do Samurai das Ruas, que � baseado no c�digo Japon�s do " +
			"Bushido. Jogadores e Mestres devem se sentir livres para " +
			"modificar essa Complica��o para melhor se encaixar nos " +
			"diferentes c�digos de honra que algu�m pode encontrar " +
			"dentro do mundo de Interface Zero 2.0.", Jogo.INTERFACE_ZERO, TipoComplicacao.MAIOR),

	CREDITO_RUIM("Cr�dito Ruim", "Seu personagem arruinou seriamente uma miss�o, "
			+ "o que subtrai permanentemente 1 do seu Cr�dito nas Ruas.", Jogo.INTERFACE_ZERO, TipoComplicacao.MENOR),

	DESPLUGADO("Desplugado", "Voc� n�o tem um TAP e � incapaz de ver "
			+ "ou interagir com Hiper-Realidade ou realidade virtual "
			+ "de qualquer modo; incluindo, mas n�o limitado a, "
			+ "telas digitais, banco instant�neo e TAPPlicativos. Voc� "
			+ "tamb�m n�o pode ter a per�cia Hacking, uma vez que n�o "
			+ "pode acessar os dados de maneira apropriada. Voc� pode "
			+ "remover esta Compli-ca��o gastando um Progresso e "
			+ "comprando um TAP por 5,000 cr�ditos. Uma vez que tenha "
			+ "instalado um TAP, voc� poder� ter a per�cia Hacking.", Jogo.INTERFACE_ZERO,
			TipoComplicacao.MAIOR),

	DIVIDA("D�vida", "Algum�s vezes, um personagem quer come�ar com "
			+ "aquele �algo� a mais al�m de cibern�ticos, mas n�o "
			+ "tem os cr�ditos para fazer acontecer. Mas ei, bro... "
			+ "isso � 2090, e se voc� est� disposto a vender a sua "
			+ "alma para uma corpora��o ou gangue, sempre pode pegar "
			+ "um empr�stimo, n�? Se voc� � um entregador de pizzas "
			+ "e quer ter aquele ve�culo para poder trabalhar, por exemplo, "
			+ "apenas se dirija ao Honest Rex e experimente o seu programa "
			+ "de primeira compra. Como uma Complica��o Menor, o personagem "
			+ "pode fazer uma �nica compra de at� 15,000 cr�ditos, mas tem "
			+ "que acrescentar 500 cr�ditos ao seu custo de vida. Caso ele "
			+ "falhe em realizar o seu pagamento, deve faz�-lo na pr�xima "
			+ "sess�o pagando o dobro. Se ele falhar em pagar por duas sess�es "
			+ "consecutivas, o personagem adquire o equivalente a Complica��o "
			+ "Procurado � medida que cobradores (ou capangas do Rex) o "
			+ "assediam continuamente por dinheiro. Caso o personagem continue "
			+ "a faltar com seus pagamentos, no m�nimo sua compra ser� "
			+ "recuperada � no pior dos casos, ele se encontrar� no lado errado "
			+ "de um tipo diferente de contrato.A vers�o Maior desta Complica��o "
			+ "funciona quase igual, exceto que o personagem pode fazer uma "
			+ "�nica compra de at� 30,000 cr�ditos e tem que acrescentar "
			+ "1,000 cr�ditos ao seu custo de vida. Tamb�m � prov�vel que o "
			+ "credor fique mais... infeliz com a falta de pagamentos.", Jogo.INTERFACE_ZERO,
			TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	FEIO("Feio", "Infelizmente, este indiv�duo acertou mais que " +
			"alguns galhos de feiura na sua viagem de descida " +
			"da �rvore da vida. Seu Carisma � reduzido em 2 " +
			"e geralmente � rejeitado por membros do sexo " +
			"oposto.\n\n" + "No mundo de Interface Zero 2.0, a medicina avan�ou ao " +
			"ponto em que a Complica��o listada " +
			"acima pode ser removida com um simples procedimento " +
			"m�dico. Por causa disso, qualquer personagem que assuma " +
			"essas Complica��es na cria��o de personagem, e ent�o " +
			"usa Aprimoramentos em jogo para remov�-las, tamb�m " +
			"deve gastar um Progresso. Aqueles que assumem essas " +
			"Complica��es na cria��o de personagem n�o podem anular " +
			"os seus efeitos com Aprimoramentos durante a cria��o de " +
			"personagem.", Jogo.INTERFACE_ZERO, TipoComplicacao.MENOR),

	FILTROS_RUINS("Filtros Ruins", "Seus filtros de spam t�m glitches. Voc� "
			+ "est� sendo con-stantemente bombardeado por spam, "
			+ "v�rus e outros malwares. Este bombardeio constante "
			+ "torna mais prov�vel que eventualmente algo ruim penetre "
			+ "no seu firewall. Con-sequentemente, seu firewall � "
			+ "reduzido em 1 com a vers�o Menor desta complica��o, ou "
			+ "em 2 para a vers�o Maior.", Jogo.INTERFACE_ZERO, TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	FORA_REDE("Fora da Rede", "De um jeito ou de outro, este personagem conseguiu " +
			"permanecer ou se tornou n�o registrado. Talvez o seu nascimento " +
			"por alguma raz�o nunca tenha sido registrado; talvez " +
			"ele (ou outra pessoa) apagou todos os seus registros oficiais. " +
			"Qualquer que seja o caso, at� onde o resto do mundo sabe, " +
			"ele n�o existe. O lado bom �, isso torna o personagem realmente" +
			"dif�cil de ser rastreado; o lado ruim � que tamb�m " +
			"� imposs�vel fazer qualquer coisa legalmente � como " +
			"comprar um carro, abrir uma conta banc�ria, ou arrumar " +
			"um emprego normal. Ele tamb�m � um alvo prim�rio para " +
			"corpora��es procurando uma cobaia que ningu�m dar� por " +
			"falta, caso desapare�a. O Mestre tem a palavra final, mas a " +
			"regra geralmente aceita � que qualquer coisa requerendo " +
			"uma identidade ou que n�o pode ser realizada com uma " +
			"transa��o em dinheiro, basicamente n�o pode ser feita. " +
			"Se um personagem tem a Vantagem Identidade Alternativa, " +
			"ele pode usar sua outra identidade para realizar essas " +
			"coisas. Mas, se a identidade do personagem for revelada " +
			"como falsa, seus recursos ser�o congelados no banco, ele " +
			"pode ser demitido do seu trabalho e at� preso, dependendo " +
			"das circunst�ncias. Em outras palavras, ele volta a estaca " +
			"zero, se n�o pior.", Jogo.INTERFACE_ZERO, TipoComplicacao.MAIOR),

	GATILHO_ESTRESSE("Gatilho por Estresse", "A maioria dos zeeks tenta manter o controle "
			+ "sobre seus poderes, mas um personagem com esta Complica��o "
			+ "parece n�o conseguir lidar com eles o tempo todo. Se ele for "
			+ "confrontado com uma situa��o estressante, existe a tend�ncia "
			+ "desagrad�vel de que suas habilidades psi�nicas se manifestem. "
			+ "Como uma Complica��o Menor, o que isso significa � que sempre "
			+ "que o personagem � for�ado a fazer um teste de atributo para "
			+ "resistir a algo � seja um teste de Esp�rito para manter "
			+ "a moral ou um teste de For�a em uma competi��o de queda de bra�o"
			+ " � se o resultado for uma falha cr�tica, o personagem deve "
			+ "tentar usar um dos seus poderes psi�nicos com sua pr�xima a��o. "
			+ "Sim, isso tamb�m se aplica a Testes de Vontade e de Absor��o. "
			+ "Como uma Complica��o Maior, qualquer falha em uma dessas rolagens "
			+ "resulta em uso obrigat�rio do poder. Em ambos os casos, o personagem "
			+ "pode gastar um Bene para evitar o uso for�ado do poder. Esta "
			+ "Complica��o pode ser assumida por um personagem com as Vantagens "
			+ "Antecedente Arcano (Psi�nicos) ou Talento Selvagem.", Jogo.INTERFACE_ZERO,
			TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	GIRI("Giri", "�s vezes, voc� apenas deve a algu�m de uma maneira que dinheiro "
			+ "n�o pode pagar. Talvez venha do senso de dever; talvez venha do "
			+ "senso de d�vida. Qualquer que seja o caso, um personagem com essa "
			+ "Complica��o � uma dessas pessoas. �Giri� � uma palavra japonesa que "
			+ "implica uma certa carga de obriga��o social � normalmente aos seus "
			+ "superiores � e vai mais fundo do que um simples senso de servid�o."
			+ "Um personagem com Giri como uma Complica��o Menor tem algu�m com "
			+ "quem ele est� um pouco endividado. Na maioria das vezes, n�o far�"
			+ " uma grande diferen�a al�m de como ele se comporta, mas "
			+ "ocasionalmente esse �algu�m� pode precisar de algo como um favor "
			+ "ou alguma ajuda. O personagem pode recusar, mas ir� lhe custar um "
			+ "Bene e um ponto de Cr�dito nas Ruas (se n�o uma certa quantidade "
			+ "de autoestima).Se � uma Complica��o Maior, o personagem deve muito "
			+ "a algu�m. Neste caso, ele pode ser chamado com mais frequ�ncia, e "
			+ "os custos de ignorar esse chamado podem ser maiores. O Mestre deve "
			+ "decidir quanto de Cr�dito nas Ruas o personagem perde baseado na "
			+ "natureza do favor. Se for um pequeno, talvez um �nico ponto "
			+ "(fazer Sem Estilo); se for um grande pode, ser at� cinco pontos "
			+ "(como Falhar em um Servi�o, ou pior). Al�m disso, o personagem deve "
			+ "pagar um n�mero de Benes igual ao cr�dito perdido � qualquer falta "
			+ "deve ser paga com Cr�dito nas Ruas adicionais. Se por alguma raz�o, "
			+ "o personagem n�o puder pagar as penalidades, ele pode acabar com as "
			+ "complica��es Inimigo ou mesmo Procurado.", Jogo.INTERFACE_ZERO,
			TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	HABITO("H�bito", "Seu guerreiro possui um h�bito irritante e " +
			"constante de algum tipo. Talvez ele cutuque seu " +
			"nariz, diga �c� sabe� em cada frase ou masque " +
			"chiclete como se isso transbordasse estilo. " +
			"Um H�bito menor irrita aqueles a seu redor, " +
			"mas n�o � perigoso. Seu her�i sofre -1 no Carisma. " +
			"Um H�bito maior � uma depend�ncia f�sica " +
			"ou mental de alguma esp�cie, debilitante ou " +
			"mesmo possivelmente mortal. Isso inclui o uso " +
			"de drogas, alcoolismo ou talvez at� mesmo um " +
			"v�cio em realidade virtual num cen�rio de alta " +
			"tecnologia. Um personagem que n�o receba " +
			"sua dose precisa fazer um teste de Fadiga a " +
			"cada 24 horas seguintes. A primeira rolagem cujo resultado seja " +
			"uma falha faz o personagem ficar Fatigado, " +
			"depois Exausto. O resultado final � um coma " +
			"por uso de drogas pesadas ou um caso grave " +
			"de choque em depend�ncias como a de �lcool " +
			"ou Realidade Virtual. Tratamento m�dico pode " +
			"amenizar os sintomas. Caso contr�rio, a v�tima " +
			"precisar� viver com as penalidades por 1d6 " +
			"dias. Posteriormente, o her�i tem de pagar pela " +
			"Complica��o sacrificando uma oportunidade de " +
			"Progresso ou eventualmente cair� de volta em " +
			"seu v�cio.", Jogo.INTERFACE_ZERO, TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	LISTA_NEGRA("Lista Negra", "Devido a um evento em seu passado, ao menos "
			+ "uma cor-pora��o se recusa a ter qualquer coisa a ver com "
			+ "voc�. As raz�es podem variar, mas o resultado final � que, "
			+ "a menos que se esforce muito para esconder o seu envolvimento, "
			+ "neg�cios com essa companhia sempre ir�o azedar.No n�vel Maior, "
			+ "seu Na lista Negra n�o se aplica apenas a uma companhia, mas "
			+ "uma ind�stria inteira. Apenas imagine o qu�o dif�cil seria "
			+ "trabalhar em bancos se o seu nome � associado com um dos piores "
			+ "esc�ndalos banc�rios na hist�ria.", Jogo.INTERFACE_ZERO,
			TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	MAGNETICO("Magn�tico", "Quer seja sua apar�ncia, fama, ou outra coisa que voc� " +
			"n�o pode explicar, certas pessoas acham o seu her�i " +
			"muito atraente. Infelizmente, elas nunca s�o aquelas que " +
			"ele deseja que estivessem atra�das por ele. Como uma " +
			"Complica��o Menor, um ou dois f�s aparecem como um " +
			"inconveniente ou uma distra��o ocasional. A vers�o Maior " +
			"tem turbas de f�s que o deixam em s�rios apuros. Imagine " +
			"tentar fazer um trabalho enquanto � perseguido por meia " +
			"d�zia de rep�rteres! Exemplos de f�s incluem pretensos " +
			"criminosos esperando ficarem bem quistos, jornalistas ou " +
			"produtores de reality shows.", Jogo.INTERFACE_ZERO,
			TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	MANCO("Manco", "Um ferimento do passado quase aleijou seu " +
			"her�i. Sua Movimenta��o b�sica � reduzida " +
			"em 2 e ele rola apenas um d4 para correr. A " +
			"Movimenta��o de um personagem nunca pode " +
			"ser reduzida abaixo de 1." + "No mundo de Interface Zero 2.0, a medicina avan�ou ao " +
			"ponto em que a Complica��o listada " +
			"acima pode ser removida com um simples procedimento " +
			"m�dico. Por causa disso, qualquer personagem que assuma " +
			"essas Complica��es na cria��o de personagem, e ent�o " +
			"usa Aprimoramentos em jogo para remov�-las, tamb�m " +
			"deve gastar um Progresso. Aqueles que assumem essas " +
			"Complica��es na cria��o de personagem n�o podem anular " +
			"os seus efeitos com Aprimoramentos durante a cria��o de " +
			"personagem.", Jogo.INTERFACE_ZERO, TipoComplicacao.MAIOR),

	MA_REPUTACAO("M� Reputa��o", "As pessoas pensam o pior do seu personagem. "
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
			+ "e voc� j� viu o interior de v�rias salas de interrogat�rio", Jogo.INTERFACE_ZERO,
			TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	MONITOR_INDICADO("Monitor Indicado", "Seu personagem tem um c�o de guarda. "
			+ "Esta � uma Com-plica��o Menor se o monitor raramente "
			+ "interfere nas a��es do seu her�i, contudo ele "
			+ "provavelmente reportar� as ativi-dades do personagem "
			+ "aos seus superiores. Est� � uma Complica��o Maior "
			+ "se o monitor ir� interferir em qualquer a��o que v� "
			+ "contra as ordens dos seus superiores e sempre ir� "
			+ "reportar as atividade do personagem, independente do "
			+ "que elas sejam. Se um Monitor Indicado � morto, um "
			+ "novo monitor o substituir�, a menos que ele tenha "
			+ "sido morto pelo personagem, que ser� acusado de "
			+ "homic�dio (ou isto � substitu�do com a Complica��o "
			+ "Procurado). Um monitor pode ser uma pessoa, mas tamb�m "
			+ "pode ser um Aspecto carregado dentro do TAP do personagem, "
			+ "dependendo da natureza dos seus superiores.", Jogo.INTERFACE_ZERO,
			TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	NANO_INFECCAO("Nano-Infec��o", "Seu personagem foi infectado com um nano-v�rus e acabou " +
			"se ferrando no quesito muta��o. Como uma Complica��o " +
			"Menor, escolha uma Per�cia, o Dado Selvagem associado " +
			"aquela per�cia � um passo menor (normalmente um d4). " +
			"Como uma Complica��o Maior selecione um Atributo. O " +
			"Dado Selvagem para aquele Atributo � um passo menor " +
			"(normalmente um d4). " +
			"Nano-Infec��o pode ser adquirida m�ltipl�s vezes (se um " +
			"personagem ficar totalmente ferrado por algum nano-v�rus), " +
			"embora os benef�cios ganhos por assumir a Complica��o " +
			"ainda sejam limitados a um Maior e dois Menores", Jogo.INTERFACE_ZERO,
			TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	POBREZA("Pobreza", "� dito que um tolo e seu dinheiro logo se " +
			"separam. Seu her�i � esse tolo. Ele come�a com " +
			"metade do dinheiro normal para o seu cen�rio " +
			"e parece n�o conseguir poupar os recursos " +
			"adquiridos do in�cio do jogo. No geral, o jogador " +
			"reduz a metade os seus recursos totais a cada " +
			"semana de jogo.", Jogo.INTERFACE_ZERO, TipoComplicacao.MAIOR),

	PROPRIEDADE("Propriedade", "Seja por procedimentos experimentais que o mant�m " +
			"vivo, ou um contrato de servid�o para pagar uma grande " +
			"d�vida, sua liberdade individual � bastante dificultada porque " +
			"voc� �, para todos os efeitos e prop�sitos, propriedade do " +
			"megaconglomerado que possui o seu contrato. Esta Complica��o " +
			"� muito comum para simulacros, andr�ides e h�bridos " +
			"trabalhando no setor corporativo. Na maior parte, esta Complica��o " +
			"significa que voc� tem pouco a opinar sobre suas " +
			"a��es; n�o � incomum para voc� receber ordens com a " +
			"expectativa que voc� as cumprir�. No fim de uma longa e " +
			"perigosa miss�o para os donos do seu contrato, voc� pode " +
			"pagar por esta Complica��o gastando um Progresso uma " +
			"vez que atinja o Est�gio Experiente.", Jogo.INTERFACE_ZERO,
			TipoComplicacao.MAIOR),

	RACISTA("Racista", "O personagem n�o gosta de pessoas de outras ra�as e " +
			"credos, acredita que a sua ra�a � superior. Ele n�o pode" +
			"se controlar em menosprezar outras ra�as em cada oportunidade. " +
			"Um personagem assumindo a vers�o Menor tem" +
			"Carisma -2 entre outras ra�as. A penalidade aumenta para " +
			"-4 na Complica��o Maior.", Jogo.INTERFACE_ZERO,
			TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	SEGREDO("Segredo", "Seu personagem tem um segredo que, se descoberto, " +
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
			"(Maior) para a vers�o Maior.", Jogo.INTERFACE_ZERO,
			TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	TALENTO_LATENTE("Talento Latente", "Alguns zeeks desafortunados sequer se d�o conta de que "
			+ "eles s�o zeeks at� que coisas estranhas come�am a acontecer a sua volta. "
			+ "Nesse ponto, ou eles aprendem a controlar, ou aprendem a conviver. "
			+ "Esta Complica��o funciona como a vers�o Maior da Complica��o "
			+ "Gatilho por Estresse (veja abaixo) com algumas grandes diferen�as. "
			+ "A m� noticia � que o seu personagem n�o tem ideia de quais s�o os "
			+ "seus poderes latentes, ent�o o Mestre escolhe qual (ou quais) se "
			+ "manifestam quando o Gatilho por Estresse " +
			"se aciona � at� tr�s deles, como qualquer outro zeek. Ele " +
			"pode escolher qualquer poder, entretanto o personagem " +
			"deve ter o Est�gio suficiente para us�-lo. Quando voc� testa " +
			"para verificar se o poder se ativa, � feito um teste de Esp�rito " +
			"(ao inv�s de um teste da per�cia Psi�nicos). Se voc� quiser " +
			"gastar um Bene para impedir o poder de se manifestar, " +
			"deve declarar antes que o Mestre diga qual � o seu poder. " +
			"A boa not�cia �, voc� pode pagar por esta Complica��o " +
			"gastando dois Progressos. Ap�s o primeiro Progresso, esta " +
			"Complica��o � tratada como a vers�o Menor de Gatilho" +
			"por Estresse, e os poderes s� s�o ativados por uma falha " +
			"cr�tica � embora as regras acima ainda se apliquem. Ap�s o " +
			"segundo Progresso, seu personagem pode adquirir o Antecedente " +
			"Arcano (Psi�nicos) e n�o sofre mais de Gatilho por " +
			"Estresse. Os poderes iniciais do seu personagem devem ser " +
			"qualquer poder manifestado por causa do Talento latente. " +
			"Se todos os tr�s ainda n�o tiverem sido designados, voc� " +
			"pode escolher qualquer poder remanescente.", Jogo.INTERFACE_ZERO, TipoComplicacao.MAIOR),

	TRAUMA_GUERRA("Trauma de Guerra", "O personagem tem uma tend�ncia de congelar em combate. "
			+ "Ele come�a o primeiro turno de combate Abalado. Esta condi��o pode "
			+ "ser removida normalmente.", Jogo.INTERFACE_ZERO, TipoComplicacao.MAIOR),

	TREMORES("Tremores", "Por alguma raz�o, este personagem tem alguns fios soltos " +
			"no c�rebro. Seja por uma defeito de nascen�a ou porque " +
			"doutores prestativos de algum projeto de pesquisa fizeram " +
			"um caminho neural em zig onde deveriam ter feito um zag, " +
			"o resultado � o mesmo: ele sofre tremores se est� sobrecarregado " +
			"por estresse. Sempre que esse personagem � " +
			"for�ado a fazer um teste de Esp�rito e falha, ele deve fazer " +
			"imediatamente um teste de Vigor no qual se tamb�m falhar, " +
			"ele come�a a ter uma convuls�o. " +
			"A convuls�o faz com que o personagem caia e sofra uma " +
			"penalidade de -2 em todos os testes at� que ela passe. " +
			"Al�m disso, o personagem s� pode realizar Movimenta��o " +
			"3 nesse per�odo. A convuls�o dura 15 turnos menos um " +
			"n�mero de turnos igual ao Esp�rito do personagem. " +
			"A boa noticia � que sempre h� alguma forma de tratamento " +
			"qu�mico para compensar poss�veis convuls�es. Contanto que " +
			"Cria��o de Personagens " +
			"o personagem tenha acesso a sua medica��o, ele n�o tem que "
			+ "fazer um teste de Vigor quando falha em um teste de Esp�rito, "
			+ "mas isso requer gasto de dinheiro � 500 cr�ditos adicionais por "
			+ "sess�o de jogo. O personagem pode gastar menos (metade) em "
			+ "fontes naturais alternativas, mais baratas, por�m invariavelmente "
			+ "menos eficientes. O personagem ainda deve fazer seu teste de Vigor "
			+ "em falhas em teste de Esp�rito, mas ele ganha um b�nus de +1.", Jogo.INTERFACE_ZERO,
			TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	UMA_PERNA_SO("Uma Perna S�", "Com uma pr�tese, Uma Perna age exatamente " +
			"como na Complica��o Manco, reduzindo a " +
			"Movimenta��o em 2 e as rolagens de corrida " +
			"s�o feitas com um d4. Sem uma pr�tese, " +
			"a Movimenta��o do Personagem � 2 e ele " +
			"nunca pode correr. Ele tamb�m sofre -2 em " +
			"Caracter�sticas que exijam mobilidade, como " +
			"Escalar e Lutar. Um personagem com uma perna " +
			"tamb�m sofre uma penalidade de -2 em sua " +
			"per�cia Nadar (e Movimenta��o)." +
			"No mundo de Interface Zero 2.0, a medicina avan�ou ao " +
			"ponto em que a Complica��o listada " +
			"acima pode ser removida com um simples procedimento " +
			"m�dico. Por causa disso, qualquer personagem que assuma " +
			"essas Complica��es na cria��o de personagem, e ent�o " +
			"usa Aprimoramentos em jogo para remov�-las, tamb�m " +
			"deve gastar um Progresso. Aqueles que assumem essas " +
			"Complica��es na cria��o de personagem n�o podem anular " +
			"os seus efeitos com Aprimoramentos durante a cria��o de " +
			"personagem.", Jogo.INTERFACE_ZERO, TipoComplicacao.MAIOR),

	UM_BRACO_SO("Um Bra�o S�", "Seja de nascimento ou devido a uma batalha, " +
			"seu her�i perdeu um bra�o. Por sorte, o seu " +
			"outro � (agora) o bra�o �bom�. Tarefas que " +
			"requerem duas m�os, como Escalar, sofrem -4 de " +
			"penalidade.\n\n" + "No mundo de Interface Zero 2.0, a medicina avan�ou ao " +
			"ponto em que a Complica��o listada " +
			"acima pode ser removida com um simples procedimento " +
			"m�dico. Por causa disso, qualquer personagem que assuma " +
			"essas Complica��es na cria��o de personagem, e ent�o " +
			"usa Aprimoramentos em jogo para remov�-las, tamb�m " +
			"deve gastar um Progresso. Aqueles que assumem essas " +
			"Complica��es na cria��o de personagem n�o podem anular " +
			"os seus efeitos com Aprimoramentos durante a cria��o de " +
			"personagem.", Jogo.INTERFACE_ZERO, TipoComplicacao.MAIOR),

	UM_OLHO_SO("Um Olho S�", "Seu her�i perdeu um olho por alguma raz�o " +
			"desafortunada. Se n�o usar um tapa-olho ou " +
			"comprar um substituto de vidro (normalmente " +
			"$500), sofre -1 no seu Carisma pelo ferimento " +
			"grotesco. " +
			"Sofre -2 em qualquer rolagem de Caracter�stica " +
			"que exija percep��o de profundidade, como " +
			"Arremessar ou Atirar, saltar uma ravina ou " +
			"telhado e assim por diante." + "No mundo de Interface Zero 2.0, "
			+ "a medicina avan�ou ao " +
			"ponto em que a Complica��o listada " +
			"acima pode ser removida com um simples procedimento " +
			"m�dico. Por causa disso, qualquer personagem que assuma " +
			"essas Complica��es na cria��o de personagem, e ent�o " +
			"usa Aprimoramentos em jogo para remov�-las, tamb�m " +
			"deve gastar um Progresso. Aqueles que assumem essas " +
			"Complica��es na cria��o de personagem n�o podem anular " +
			"os seus efeitos com Aprimoramentos durante a cria��o de " +
			"personagem.", Jogo.INTERFACE_ZERO, TipoComplicacao.MAIOR),

	VISAO_RUIM("Vis�o Ruim", "Os olhos do seu her�i j� n�o s�o mais o que " +
			"costumavam ser. Com �culos, n�o h� penalidade " +
			"e a Complica��o � apenas Menor. Caso perca " +
			"seus �culos (geralmente uma chance de 50% " +
			"quando for ferido ou nenhuma chance com uma " +
			"�al�a nerd�), sofre -2 de penalidade em qualquer " +
			"rolagem de Caracter�stica feita para atirar ou " +
			"Perceber alguma coisa a mais de 5 quadros (10m) " +
			"de dist�ncia.\r\n" +
			"Em cen�rios de baixa tecnologia, onde o her�i " +
			"n�o possa usar �culos, ter Olhos Ruins � uma " +
			"Complica��o Maior. Ele precisa subtrair 2 das " +
			"rolagens de Caracter�sticas feitas para atacar ou " +
			"perceber coisas a 5 quadros ou mais de dist�ncia." +
			"No mundo de Interface Zero 2.0, a medicina avan�ou ao " +
			"ponto em que a Complica��o listada " +
			"acima pode ser removida com um simples procedimento " +
			"m�dico. Por causa disso, qualquer personagem que assuma " +
			"essas Complica��es na cria��o de personagem, e ent�o " +
			"usa Aprimoramentos em jogo para remov�-las, tamb�m " +
			"deve gastar um Progresso. Aqueles que assumem essas " +
			"Complica��es na cria��o de personagem n�o podem anular " +
			"os seus efeitos com Aprimoramentos durante a cria��o de " +
			"personagem.", Jogo.INTERFACE_ZERO, TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	ANEMICO("An�mico", "Um personagem an�mico � particularmente " +
			"suscet�vel a infec��es, doen�as, efeitos ambientais " +
			"e fadiga. Ele subtrai 2 de todos os testes de Fadiga " +
			"como os feitos para resistir a veneno e doen�a", Jogo.SAVAGE_WORLDS, TipoComplicacao.MENOR),

	ARROGANTE("Arrogante", "Seu her�i n�o pensa ser o melhor � ele sabe " +
			"que �. Seja no que for � esgrima, kung fu, corrida " +
			"� poucos se comparam �s suas habilidades e ele " +
			"ostenta isso a cada oportunidade que tem. " +
			"S� vencer n�o � o bastante para o seu her�i. Ele " +
			"precisa dominar completamente o seu oponente. " +
			"Sempre que houver sequer uma sombra de d�vida " +
			"a respeito de quem � o melhor, deve humilhar " +
			"seu oponente e provar poder alcan�ar a vit�ria a " +
			"qualquer momento desejado. � o tipo de homem " +
			"que desarma um oponente em um duelo s� para " +
			"poder pegar a sua espada e devolv�-la com um " +
			"sorriso desdenhoso. " +
			"Her�is arrogantes sempre procuram pelo " +
			"�chefe� em batalha, atacando lacaios menores " +
			"apenas se ficarem em seu caminho.", Jogo.SAVAGE_WORLDS,
			TipoComplicacao.MAIOR),

	BOCA_GRANDE("Boca Grande", "Todos sabem que deve-se tomar cuidado com o " +
			"que se diz, n�o � mesmo? Bem, o seu personagem " +
			"n�o sabe. " +
			"Seu personagem n�o consegue guardar " +
			"muito bem um segredo. Ele revela os planos " +
			"e deixa escapar as coisas mais bem guardadas " +
			"entre amigos, geralmente nos piores momentos " +
			"poss�veis.", Jogo.SAVAGE_WORLDS, TipoComplicacao.MENOR),

	CAUTELOSO("Cauteloso", "Algumas pessoas acumulam intelig�ncia " +
			"demais. Este personagem personifica a cautela " +
			"excessiva. Ele nunca toma decis�es apressadas e " +
			"gosta de planejar coisas at� os m�nimos detalhes " +
			"antes de qualquer a��o ser tomada.", Jogo.SAVAGE_WORLDS, TipoComplicacao.MENOR),

	COVARDE("Covarde", "Nem todo mundo possui �gua gelada em suas " +
			"veias. Seu her�i � suscet�vel � vis�o de sangue e " +
			"v�sceras e tem medo de se machucar. Ele subtrai " +
			"2 de todos os seus testes de Esp�rito baseados em " +
			"medo.", Jogo.SAVAGE_WORLDS, TipoComplicacao.MAIOR),

	CURIOSO("Curioso", "A curiosidade matou o gato e tamb�m pode " +
			"matar seu her�i. Personagens curiosos s�o " +
			"facilmente arrastados para qualquer aventura. Eles " +
			"t�m de verificar tudo e sempre querem saber o que " +
			"h� por tr�s de um mist�rio em potencial.", Jogo.SAVAGE_WORLDS, TipoComplicacao.MAIOR),

	DEFICIENTE_AUDITIVO("Deficiente Auditivo", "Personagens que perderam parte ou toda a " +
			"sua audi��o t�m esta desvantagem. Como uma " +
			"Complica��o Menor, ela subtrai 2 de todas as " +
			"rolagens de Perceber feitas para ouvir, incluindo " +
			"acordar devido a ru�dos altos. Uma Complica��o " +
			"maior significa que o personagem � surdo. Ele n�o " +
			"pode ouvir e falha automaticamente em todas as " +
			"rolagens de Perceber dependentes da audi��o.\n\n" +
			"No mundo de Interface Zero 2.0, a medicina avan�ou ao " +
			"ponto em que a Complica��o listada " +
			"acima pode ser removida com um simples procedimento " +
			"m�dico. Por causa disso, qualquer personagem que assuma " +
			"essas Complica��es na cria��o de personagem, e ent�o " +
			"usa Aprimoramentos em jogo para remov�-las, tamb�m " +
			"deve gastar um Progresso. Aqueles que assumem essas " +
			"Complica��es na cria��o de personagem n�o podem anular " +
			"os seus efeitos com Aprimoramentos durante a cria��o de " +
			"personagem.", Jogo.INTERFACE_ZERO, TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	DELIRANTE("Delirante", "Seu her�i acredita em algo considerado muito " +
			"estranho por todos os outros. Del�rios Menores " +
			"s�o inofensivos ou o personagem normalmente os " +
			"guarda para si mesmo (o governo colocou sedativos " +
			"em refrigerantes, c�es podem falar, somos todos " +
			"apenas personagens de algum jogo bizarro etc.). " +
			"Com Del�rios Maiores, ele frequentemente " +
			"expressa seu ponto de vista sobre a situa��o e isso " +
			"pode eventualmente lev�-lo ao perigo (o governo " +
			"� comandado por alien�genas, os hospitais s�o " +
			"mortais, eu sou al�rgico a armaduras, zumbis s�o " +
			"meus amigos).", Jogo.SAVAGE_WORLDS, TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	DESAGRADAVEL("Desagrad�vel", "Este camarada � mal-humorado e desagrad�vel. " +
			"Ningu�m gosta dele e ele tem dificuldades em fazer " +
			"qualquer coisa gentil pra quem quer que seja. Ele " +
			"deve ser pago pelos seus aborrecimentos e nem " +
			"mesmo aceita premia��es graciosamente. Seu " +
			"her�i sofre -2 no seu Carisma.", Jogo.SAVAGE_WORLDS, TipoComplicacao.MENOR),

	DESASTRADO("Desastrado", "Algumas pessoas simplesmente n�o s�o boas " +
			"com dispositivos modernos. Personagens com " +
			"este defeito sempre sofrem uma penalidade de -2 " +
			"na per�cia Consertar. Al�m disso, ao usar um " +
			"dispositivo mec�nico ou eletr�nico, uma rolagem " +
			"de 1 no seu dado de per�cia (independente do " +
			"seu Dado Selvagem) significa que o dispositivo " +
			"foi quebrado. Reparar esse item normalmente " +
			"requer uma rolagem de Consertar com -2 e 1d6 " +
			"horas para o reparo.", Jogo.SAVAGE_WORLDS, TipoComplicacao.MENOR),

	DESEJO_MORRER("Desejo de Morrer", "Ter um desejo de morrer n�o significa que "
			+ "seu her�i seja um suicida � mas ele quer morrer " + "depois de completar algum objetivo importante. "
			+ "Talvez queira vingan�a pelo assassinato de sua " + "fam�lia ou talvez esteja morrendo de alguma "
			+ "doen�a e queira partir em um lampejo de gl�ria. " + "Ele n�o vai jogar sua vida fora por qualquer "
			+ "raz�o, mas quando houver uma chance de " + "completar o seu objetivo, far� qualquer coisa � e "
			+ "aceitar� qualquer risco � para alcan��-lo. " + "Essa normalmente � uma Complica��o menor, "
			+ "a menos que o objetivo seja relativamente f�cil " + "de ser alcan�ado (muito raro).", Jogo.SAVAGE_WORLDS,
			TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	EXCESSO_CONFIANCA("Excesso de Confian�a", "N�o existe nada que seu her�i n�o possa " +
			"derrotar. Pelo menos � isso que pensa. Ele acredita " +
			"poder fazer quase tudo e nunca quer fugir de um " +
			"desafio. O her�i n�o � um suicida, mas certamente " +
			"faz mais do que dita o bom senso.", Jogo.SAVAGE_WORLDS, TipoComplicacao.MAIOR),

	FOBIA("Fobia", "Fobias s�o medos esmagadores e irracionais "
			+ "que permanecem com o her�i pelo resto da sua " + "vida. Sempre que um personagem estiver na "
			+ "presen�a de sua fobia, subtraia 2 de todos os testes " + "de Caracter�stica no caso de uma Complica��o "
			+ "Menor e 4 se o medo for uma Fobia Maior. " + "Fobias n�o devem ser muito �bvias � todos "
			+ "devem temer vampiros, por exemplo. Sendo " + "assim, isso n�o � uma fobia � � senso comum. "
			+ "Ao inv�s disso, a fobia geralmente se concentra " + "em algum elemento aleat�rio focado pela "
			+ "mente durante qualquer que seja o encontro " + "causador deste terror. Lembre, fobias s�o medos "
			+ "irracionais.", Jogo.SAVAGE_WORLDS, TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	FORASTEIRO("Forasteiro", "Em uma sociedade formada por apenas alguns " +
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
			"-2 em rela��o a todos menos o seu pr�prio povo.", Jogo.SAVAGE_WORLDS,
			TipoComplicacao.MENOR),

	GANANCIOSO("Ganancioso", "Seu her�i avarento mede seu valor em tesouro. " +
			"Se for uma Complica��o Menor, ele argumenta " +
			"amargamente sobre qualquer despojo adquirido " +
			"durante o jogo. Se for uma Complica��o Maior, " +
			"luta por qualquer coisa que considerar desleal e " +
			"pode at� mesmo matar pela sua �parte justa�.", Jogo.SAVAGE_WORLDS,
			TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	HEROICO("Her�ico", "Esta nobre alma nunca diz n�o a uma pessoa " +
			"necessitada. Ela n�o precisa ficar feliz com isto, " +
			"mas sempre vir� em socorro daqueles que (pelo " +
			"menos de forma aparente) n�o podem ajudar a " +
			"si mesmos. � a primeira a correr para dentro de " +
			"um pr�dio em chamas, geralmente aceita ca�ar " +
			"monstros por pouco ou nenhum pagamento e " +
			"normalmente � um alvo f�cil para uma hist�ria " +
			"triste.", Jogo.SAVAGE_WORLDS, TipoComplicacao.MAIOR),

	IDOSO("Idoso", "Seu her�i est� ficando velho, mas n�o " +
			"est� totalmente pronto para o asilo. Sua " +
			"Movimenta��o � reduzida em 1 e sua For�a " +
			"e Vigor caem um tipo de dado at� um " +
			"m�nimo de d4 e n�o podem ser aumentados " +
			"posteriormente. " +
			"Por outro lado, a sabedoria dos seus anos " +
			"concede ao her�i 5 pontos de per�cia adicionais " +
			"que podem ser usados em quaisquer per�cias " +
			"associadas � Ast�cia.", Jogo.SAVAGE_WORLDS, TipoComplicacao.MAIOR),

	INIMIGO("Inimigo", "Algu�m odeia seu her�i e quer v�-lo morto. " +
			"O valor da Complica��o depende do qu�o " +
			"poderoso � o Inimigo e de quantas vezes ele " +
			"poder� aparecer. Um Inimigo Menor pode ser " +
			"um pistoleiro solit�rio buscando vingan�a. " +
			"Um Inimigo Maior pode ser um pistoleiro " +
			"sobrenatural que deseja o seu her�i morto. " +
			"Se o Inimigo um dia for vencido, o Mestre " +
			"deve trabalhar gradualmente em um substituto " +
			"ou o her�i pode pagar pela Complica��o " +
			"sacrificando um Progresso.", Jogo.SAVAGE_WORLDS, TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	JOVEM("Jovem", "Crian�as �s vezes s�o for�adas a partir em " +
			"aventuras perigosas devido a circunst�ncias " +
			"infelizes. Pense cuidadosamente antes de escolher " +
			"esta Complica��o, pois seu jovem come�ar� com " +
			"uma desvantagem significativa. " +
			"Her�is jovens geralmente t�m entre 8-12 anos " +
			"de idade (em anos humanos � fa�a os devidos " +
			"ajustes para ra�as com paradigmas diferentes de " +
			"envelhecimento). T�m apenas tr�s pontos para " +
			"ajustar os seus atributos e 10 pontos de per�cia. " +
			"Em compensa��o, jovens como estes t�m certa " +
			"por��o de sorte. Eles sacam um Bene adicional " +
			"no in�cio de cada sess�o de jogo, em adi��o a " +
			"quaisquer Benes adicionais ganhos de coisas " +
			"como as Vantagens Sorte e Sorte Grande. " +
			"Se o personagem viver tempo o suficiente " +
			"para atingir a maturidade, a Complica��o n�o " +
			"precisa ser paga, pois o pre�o j� foi pago pela " +
			"Complica��o por ter come�ado em desvantagem. " +
			"Entretanto, ele deixa de receber o Bene adicional " +
			"ao completar 18 anos de idade (ou a idade da " +
			"maioridade do cen�rio em quest�o).", Jogo.SAVAGE_WORLDS,
			TipoComplicacao.MAIOR),

	LEAL("Leal", "Seu personagem pode n�o ser um her�i, " +
			"mas daria a sua vida pelos seus amigos. Esse " +
			"personagem nunca pode deixar um homem para " +
			"tr�s se houver qualquer chance dele poder ajudar.", Jogo.SAVAGE_WORLDS,
			TipoComplicacao.MENOR),

	MA_SORTE("M� Sorte", "Seu her�i � um pouco menos sortudo que " +
			"a maioria. Ele recebe um Bene a menos que o " +
			"normal por sess�o de jogo. Um personagem n�o " +
			"pode ter M� Sorte e Sorte simultaneamente.", Jogo.SAVAGE_WORLDS,
			TipoComplicacao.MAIOR),

	OBESO("Obeso", "Pessoas particularmente grandes t�m muita " +
			"dificuldade em situa��es de perigo f�sico. " +
			"Aqueles que suportam bem o seu pr�prio peso " +
			"t�m a Vantagem Musculoso. Aqueles que n�o " +
			"lidam muito bem com ele s�o Obesos. Um " +
			"personagem n�o pode ser Musculoso e Obeso " +
			"simultaneamente. " +
			"Um her�i Obeso adiciona 1 a sua Resist�ncia, " +
			"mas sua Movimenta��o � decrescida em 1 e seu " +
			"dado de corrida � um d4. Personagens obesos " +
			"tamb�m podem ter dificuldade para achar " +
			"armaduras ou roupas adequadas ao seu tamanho, " +
			"caber em espa�os apertados ou mesmo viajar em " +
			"espa�os confinados, como poltronas de avi�es ou " +
			"carros compactos.", Jogo.SAVAGE_WORLDS, TipoComplicacao.MENOR),

	PACIFISTA("Pacifista", "Seu her�i despreza absolutamente a viol�ncia. " +
			"Pacifismo Menor significa que ele luta apenas " +
			"se n�o for dada nenhuma outra op��o e jamais " +
			"permite a matan�a de prisioneiros e outras " +
			"v�timas indefesas. " +
			"Pacifistas Maiores n�o ir�o combater criaturas " +
			"vivas sob quaisquer circunst�ncias. Eles podem " +
			"se defender, mas n�o far�o nada para ferir " +
			"permanentemente criaturas vivas sencientes. " +
			"Criaturas inegavelmente malignas, mortos vivos, " +
			"dem�nios e similares n�o contam e podem ser " +
			"atacadas ou mesmo feridos. Um Pacifista Maior " +
			"tamb�m pode lutar com m�todos n�o letais, como " +
			"os seus pr�prios punhos. Tais personagens, no " +
			"entanto, s� o far�o se obviamente amea�ados.", Jogo.SAVAGE_WORLDS,
			TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	PECULIARIDADE("Peculiaridade", "Seu her�i tem alguma fraqueza menor, " +
			"normalmente engra�ada, mas que ocasionalmente " +
			"lhe causa problemas. Um espadachim " +
			"pode sempre tentar primeiro cortar suas iniciais " +
			"em seus inimigos antes de atacar, um an�o pode " +
			"se vangloriar constantemente a respeito da sua " +
			"cultura ou uma debutante esnobe pode n�o comer, " +
			"beber ou socializar com as classes mais baixas.", Jogo.SAVAGE_WORLDS,
			TipoComplicacao.MENOR),

	PEQUENO("Pequeno", "Seu personagem � muito magro, muito baixo " +
			"ou os dois em rela��o a sua ra�a em particular. " +
			"Subtraia 1 da sua Resist�ncia pela sua estatura " +
			"reduzida.", Jogo.SAVAGE_WORLDS, TipoComplicacao.MAIOR),

	PROCURADO("Procurado", "Seu her�i cometeu algum crime no passado e " +
			"ser� preso se for descoberto pelas autoridades. " +
			"Isso pressup�e que o cen�rio possui leis e oficiais " +
			"de pol�cia para imp�-las. " +
			"O n�vel da Complica��o depende da seriedade " +
			"do crime. Um her�i com v�rias multas de estacionamento " +
			"n�o pagas (em um jogo em que " +
			"ele pode ter de dirigir ocasionalmente) possui " +
			"uma Complica��o Menor, assim como algu�m " +
			"procurado por um crime mais grave longe da " +
			"�rea principal da campanha. Ser acusado de " +
			"assassinato � uma Complica��o Maior em quase " +
			"qualquer cen�rio.", Jogo.SAVAGE_WORLDS, TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	SANGUINARIO("Sanguin�rio", "Seu her�i nunca faz prisioneiros, exceto sob " +
			"a supervis�o direta de um superior. Isso pode " +
			"causar grandes problemas em uma campanha " +
			"militar, a menos que seus superiores tolerem esse " +
			"tipo de coisa. Seu her�i sofre -4 no seu Carisma " +
			"somente se seus h�bitos cru�is forem conhecidos", Jogo.SAVAGE_WORLDS,
			TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	SEM_NOCAO("Sem No��o", "Seu her�i n�o � t�o consciente de seu mundo " +
			"quanto a maioria das pessoas. Ele sofre -2 em " +
			"rolagens de Conhecimento Geral.", Jogo.SAVAGE_WORLDS, TipoComplicacao.MAIOR),

	TEIMOSO("Teimoso", "Este indiv�duo sempre quer as coisas do " +
			"seu jeito e nunca admite estar errado. Mesmo " +
			"quando � dolorosamente �bvio que cometeu " +
			"um erro, tenta justific�-lo com meias-verdades e " +
			"racionaliza��es.", Jogo.SAVAGE_WORLDS, TipoComplicacao.MAIOR),

	VINGATIVO("Vingativo", "Seu personagem sempre tenta reparar um erro " +
			"que sinta ter sido cometido contra ele. Se essa " +
			"for uma Complica��o Menor, ele normalmente " +
			"procura por vingan�a legalmente. O tipo e a " +
			"urg�ncia de sua vingan�a variam de personagem " +
			"para personagem, � claro. Alguns conspiram " +
			"e planejam por meses para conseguir o que " +
			"enxergam como justi�a. " +
			"Se essa for uma Complica��o Maior, seu " +
			"personagem matar� para retificar a sua injusti�a.", Jogo.SAVAGE_WORLDS,
			TipoComplicacao.MAIOR, TipoComplicacao.MENOR),

	VOTO("Voto", "O personagem possui um voto de algum tipo. " +
			"Se � uma Complica��o Maior ou Menor depende " +
			"do Voto em si. Alguns podem ter votos para " +
			"com ordens ou causas espec�ficas, para com " +
			"o juramento Hipocr�tico, livrar o mundo do " +
			"mal e assim por diante. O risco em cumprir o " +
			"Voto e qu�o ocasionalmente isso pode ocorrer " +
			"determinam o n�vel da Complica��o. Qualquer " +
			"que seja o Voto, ele s� ser� uma Complica��o se " +
			"realmente aparecer em jogo de tempos em tempos " +
			"e causar ao personagem algum desconforto.", Jogo.SAVAGE_WORLDS,
			TipoComplicacao.MAIOR, TipoComplicacao.MENOR);



	private final Identidade id;
	private final Jogo jogo;
	private TipoComplicacao[] tipoPoss�vel;
	private TipoComplicacao tipo;
	
	Complicacao(String nome, String descricao, Jogo jogo,TipoComplicacao ... tipoPossivel) {
		id = new Identidade(nome, descricao);
		this.jogo = jogo;
		this.tipoPoss�vel = tipoPossivel;
	}

	public Identidade getId() {
		return id;
	}

	public TipoComplicacao[] getTipoPoss�vel() {
		return tipoPoss�vel;
	}

	public TipoComplicacao getTipo() {
		return tipo;
	}

	public void setTipo(TipoComplicacao tipo) {
		boolean tipoValido = false;

		for(TipoComplicacao x: tipoPoss�vel) {
			if(x.equals(tipo)) {
				tipoValido = true;
				break;
			}
		}

		if(tipoValido)
			this.tipo = tipo;
		else throw new IllegalArgumentException("Tipo inv�lido!");
	}

	public boolean checkSeTipoValido(TipoComplicacao tipo) {
		for(TipoComplicacao x: tipoPoss�vel)
			if(x == tipo)
				return true;

		return false;
	}
	
	public static Complicacao getAleatoria() {
		int random = (int) (Math.random() * Complicacao.values().length);
		Complicacao comp = Complicacao.values()[random];

		random = (int) (Math.random() * comp.getTipoPoss�vel().length);
		comp.setTipo(comp.getTipoPoss�vel()[random]);


		//System.out.println("Complica��o escolhida = " + comp.getNome());
		return comp;
	}

	public String toString() {
		return id.toString();
	}

	@Override
	public boolean check(NPC npc) {
		return npc.getComplicacoes().contains(this);
	}
}
