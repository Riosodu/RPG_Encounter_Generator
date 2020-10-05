package core;


public enum Pericia {
	CONHECIMENTO_DEMOLICAO("Conhecimento (Demoli��o)", "Uso bem sucedido de " +
			"demoli��es pode significar a diferen�a entre destrui��o " +
			"do alvo como planejado e perda indesejada de vidas e " +
			"propriedade. A per�cia tamb�m permite que o personagem " +
			"tenha um entendimento de qual � o melhor tipo " +
			"de explosivo e quanto ser� preciso para remover o obst�culo. " +
			"Al�m disso, uma amplia��o no resultado permitir� " +
			"saber a dist�ncia exata que � preciso estar da explos�o, " +
			"baseada no tamanho da carga, a conten��o e o dano criado. " +
			"Esta per�cia � usada toda vez que um personagem quiser " +
			"colocar junto uma bolsa de cargas ou acionar explosivos " +
			"Uma falha cr�tica resultar� em detona��o imediata. Uma " +
			"falha simples resultar� em detona��o prematura ou em " +
			"nenhuma detona��o.", Atributo.ASTUCIA, Jogo.INTERFACE_ZERO,"Demoli��o"),

	CONHECIMENTO_PROGAMACAO("Conhecimento (Programa��o)", "Personagens usam esta " +
			"per�cia quando tentam fazer qualquer tipo de altera��o em " +
			"uma rede que eles invadiram. Essa per�cia permite a um " +
			"personagem desfazer um dano resultante de um hack. Com " +
			"ela, um personagem pode fazer coisas como desfazer e " +
			"editar um arquivo de dados ou v�deo, restaurar um arquivo " +
			"deletado, reparar um SAM, " +
			"recuperar um Engrama de per�cia deletado ou reconectar " +
			"um TAP que ficou offline.", Atributo.ASTUCIA, Jogo.INTERFACE_ZERO, "Programa��o"),

	HACKING("Hacking", "A per�cia Hacking e usada sempre que " +
			"um personagem quer invadir uma rede de computadores. " +
			"Personagens em Interface Zero 2.0 n�o mais come�am " +
			"com um d4 autom�tico em Hacking. Al�m disso, personagens " +
			"que desejem usar a DataNet Global para prop�sitos " +
			"cotidianos como pesquisa ou encontrar not�cias na Deep, " +
			"o fazem com suas per�cias de Investigar e Manha", Atributo.ASTUCIA, Jogo.INTERFACE_ZERO),

	ARREMESSAR("Arremessar", "Arremessar governa todos os tipos de armas de " +
			"arremesso, de granadas de m�o a facas, machados e " +
			"lan�as. Arremessar funciona de maneira similar � " +
			"per�cia Atirar e utiliza os mesmos modificadores, " +
			"incluindo aqueles a dist�ncia. A Cad�ncia de Tiro " +
			"de um ataque de arremesso � de 1 por m�o. Deste " +
			"modo, um personagem humano pode arremessar dois itens de uma s� vez, um com cada m�o, "
			+ "sofrendo as penalidades habituais de a��o m�ltipla " +
			"e m�o in�bil.", Atributo.AGILIDADE, Jogo.SAVAGE_WORLDS),

	ARROMBAR("Arrombar", "Arrombar � a habilidade de passar por travas " +
			"mec�nicas e eletr�nicas. Arrombar tamb�m " +
			"� usado para desarmar as iscas e gatilhos de " +
			"armadilhas, a menos que uma per�cia mais " +
			"relevante pare�a mais apropriada para uma " +
			"armadilha em particular.", Atributo.AGILIDADE, Jogo.SAVAGE_WORLDS),

	ATIRAR("Atirar", "Atirar cobre todas as tentativas de atingir um " +
			"alvo com armas de combate a dist�ncia como " +
			"arcos, pistolas ou lan�a-foguetes. A Dificuldade " +
			"b�sica para acertar � 4. Contudo, existe um n�mero " +
			"importante de modificadores, como a dist�ncia em " +
			"que o alvo se encontra, aparecendo frequentemente " +
			"no jogo.", Atributo.AGILIDADE, Jogo.SAVAGE_WORLDS),

	ATLETISMO("Atletismo", "Atletismo � um apanhado para uma quantidade de fa�anhas "
			+ "f�sicas abrangendo desde escalar, nadar at� se mover "
			+ "efetivamente em um ambiente sem � ou com baixa gravidade. "
			+ "Atletismo deve ser usado no lugar de Agilidade em "
			+ "persegui��es a p� e efetivamente substitui as per�cias"
			+ " Escalar e Nadar.", Atributo.AGILIDADE, Jogo.SAVAGE_WORLDS),

	CAVALGAR("Cavalgar", "Cavalgar permite a um her�i montar, controlar e " +
			"conduzir qualquer animal comum em seu cen�rio. " +
			"Jogadores devem notar que personagens montados " +
			"usam a menor entre suas per�cias de Cavalgar ou " +
			"Lutar quando estiverem em combate montado", Atributo.AGILIDADE, Jogo.SAVAGE_WORLDS),

	CONHECIMENTO("Conhecimento", "Conhecimento � uma per�cia abrangente " +
			"que deve possuir algum tipo de foco, como " +
			"Conhecimento (Ocultismo) ou Conhecimento " +
			"(Ci�ncia). O jogador pode escolher o foco do " +
			"Conhecimento do seu personagem, devendo " +
			"refletir seu hist�rico e instru��o. Um arque�logo, " +
			"por exemplo, deveria ter Conhecimento (Hist�ria) " +
			"e Conhecimento (Arqueologia). " +
			"Focos gerais como Ci�ncia s�o aceit�veis, mas o " +
			"Mestre deve dar um b�nus a um personagem cujo " +
			"foco escolhido seja mais relevante a uma tarefa em " +
			"particular, como usar um Conhecimento (Biologia) " +
			"para identificar uma planta ou animal. " +
			"Alguns focos de Conhecimento s�o: �rea, " +
			"Batalha (usado em Combate em Massa, veja a " +
			"p�gina 109), Computadores, Eletr�nica, Hist�ria, " +
			"Jornalismo, v�rios idiomas, Lei, Medicina (embora " +
			"cuidar de algu�m exija a per�cia Curar) ou Ci�ncia.", Atributo.ASTUCIA, Jogo.SAVAGE_WORLDS),

	CONSERTAR("Consertar", "Consertar � a habilidade de reparar engenhocas, " +
			"ve�culos, armas e outras m�quinas. Personagens " +
			"sofrem uma penalidade de -2 nas suas rolagens " +
			"se n�o tiverem acesso a ferramentas b�sicas. Uma " +
			"amplia��o em uma rolagem de Consertar reduz " +
			"� metade o tempo exigido por uma tarefa em " +
			"particular.", Atributo.ASTUCIA, Jogo.SAVAGE_WORLDS),

	CURAR("Curar", "Curar � a arte de estancar ferimentos e tratar " +
			"les�es existentes. Em geral, cada sucesso e " +
			"amplia��o em uma rolagem de Curar eliminam " +
			"um ferimento. O curandeiro precisa subtrair n�o " +
			"apenas seus pr�prios ferimentos da rolagem, mas " +
			"tamb�m os do seu paciente.", Atributo.ASTUCIA, Jogo.SAVAGE_WORLDS),

	DIRIGIR("Dirigie", "Dirigir permite que seu her�i conduza ve�culos " +
			"e flutuadores terrestres comuns em seu cen�rio. " +
			"Dirigir tamb�m " +
			"� frequentemente usado com as Regras de " +
			"Persegui��o", Atributo.AGILIDADE, Jogo.SAVAGE_WORLDS),

	ESCALAR("Escalar", "Personagens �s vezes podem ter de escalar " +
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
			"caso de uma escalada livre.", Atributo.FORCA, Jogo.SAVAGE_WORLDS),

	FURTIVIDADE("Furtividade", "Furtividade � tanto a habilidade de permanecer " +
			"escondido e mover-se em sil�ncio como tamb�m " +
			"de furtar objetos e bater carteiras. Em muitos " +
			"jogos de Savage Worlds, saber exatamente quando " +
			"seu personagem foi visto e quando n�o foi pode " +
			"ser decisivo. " +
			"Para um personagem se aproximar sorrateiramente " +
			"de inimigos e se infiltrar nas linhas inimigas, " +
			"comece definindo se os �guardas� dos quais " +
			"seus her�is est�o se escondendo s�o �ativos� ou " +
			"�inativos�. Guardas Inativos n�o est�o particularmente " +
			"prestando aten��o ao seu redor. O grupo " +
			"s� precisa conseguir um sucesso padr�o em suas " +
			"rolagens individuais de Furtividade para evitar " +
			"ser visto. Falhar numa rolagem de Furtividade na " +
			"presen�a de guardas inativos torna-os ativos. " +
			"Guardas Ativos fazem rolagens resistidas " +
			"de Perceber contra a per�cia Furtividade dos " +
			"personagens se esgueirando. Falhar numa " +
			"rolagem contra guardas ativos faz com que os " +
			"personagens sejam vistos.", Atributo.AGILIDADE, Jogo.SAVAGE_WORLDS),

	INTIMIDAR("Intimidar", "Intimidar � a arte de aterrorizar um oponente " +
			"com pura for�a de vontade, amea�as veladas " +
			"ou evidentes ou, �s vezes, apenas com armas " +
			"realmente grandes. Essa � uma rolagem resistida " +
			"entre a Intimidar do her�i e o Esp�rito de seu " +
			"oponente.", Atributo.ESPIRITO, Jogo.SAVAGE_WORLDS),

	INVESTIGAR("Investigar", "Um personagem treinado em Investigar sabe " +
			"como fazer bom uso de bibliotecas, manchetes de " +
			"jornais, internet ou outros recursos escritos de " +
			"informa��o. Para obter informa��es de pessoas " +
			"ao inv�s de livros e computadores, use a per�cia " +
			"Manha.", Atributo.ASTUCIA, Jogo.SAVAGE_WORLDS),

	JOGAR("Jogar", "Jogar � �til dos sal�es do Velho Oeste aos " +
			"alojamentos da maioria dos ex�rcitos. Aqui est� " +
			"uma maneira r�pida de simular cerca de meia hora " +
			"de jogatina sem ter de rolar para cada lance dos " +
			"dados ou m�o de cartas. " +
			"Primeiro todos devem concordar com as apostas, " +
			"como $10, 10 pe�as de ouro, etc. Agora todos no " +
			"jogo t�m de fazer uma rolagem de Jogar. O menor " +
			"resultado paga ao maior resultado a diferen�a " +
			"vezes a aposta. O segundo menor resultado paga ao " +
			"segundo maior resultado a diferen�a vezes a aposta " +
			"e assim por diante. Se sobrar algu�m sozinho no " +
			"meio, ele fica na m�dia. " +
			"Exemplo: Kali rola mais alto com um 10 e Yuri " +
			"rola mais baixo com um 4. A diferen�a � 6, assim " +
			"Yuri paga a Kali 6x a aposta de $10 ou $60. " +
			"� Trapaceando: Um personagem " +
			"trapaceando adiciona +2 a sua rolagem. " +
			"O Mestre pode aumentar ou diminuir " +
			"este modificador dependendo do jogo ou " +
			"dos m�todos espec�ficos de trapa�a. Se o " +
			"personagem alguma vez rolar um 1 em seu " +
			"dado de per�cia (independente do seu Dado " +
			"Selvagem), � apanhado. As consequ�ncias " +
			"variam dependendo do cen�rio, mas " +
			"normalmente s�o bastante severas.", Atributo.ASTUCIA, Jogo.SAVAGE_WORLDS),

	LUTAR("Lutar", "Lutar cobre todos os ataques corpo a corpo, " +
			"sejam eles com os punhos, machados, espadas laser " +
			"ou artes marciais. A Dificuldade para atingir um " +
			"oponente � o seu Aparar (2 mais a metade do seu " +
			"Lutar).", Atributo.AGILIDADE, Jogo.SAVAGE_WORLDS),

	MANHA("Manha", "Personagens com Manha s�o capazes de obter " +
			"informa��es das ruas, sal�es ou outros contatos " +
			"atrav�s de subornos, amea�as ou barganhas. " +
			"Encontrar informa��o escrita em bibliotecas e " +
			"similares � coberto pela per�cia Investigar. Manha " +
			"� sempre modificada pelo Carisma do personagem.", Atributo.ASTUCIA, Jogo.SAVAGE_WORLDS),

	NADAR("Nadar", "Nadar determina se um personagem flutua ou " +
			"afunda na �gua, bem como qu�o r�pido ele se move " +
			"dentro dela. A Movimenta��o de um personagem " +
			"� igual � metade da sua per�cia Nata��o em quadros " +
			"por turno em �guas normais (arredondado para " +
			"cima). �guas agitadas contam como terreno " +
			"acidentado reduzindo essa taxa � metade. " +
			"Personagens n�o podem �correr� enquanto nadam " +
			"para ter movimento extra.", Atributo.AGILIDADE, Jogo.SAVAGE_WORLDS),

	NAVEGAR("Navegar", "Personagens com esta per�cia podem conduzir " +
			"qualquer embarca��o ou navio comum em seus " +
			"cen�rios e hist�rico de personagem. Geralmente " +
			"tamb�m sabem como lidar com as tarefas mais " +
			"comuns associadas a seus barcos (dar n�s, " +
			"encordar velas, etc.).", Atributo.AGILIDADE, Jogo.SAVAGE_WORLDS),

	PERCEBER("Percerber", "Perceber � a prontid�o geral e habilidade de " +
			"um her�i para procurar por itens ou pistas. Isso " +
			"cobre rolagens para ouvir, detectar emboscadas, " +
			"enxergar armas escondidas e at� mesmo examinar " +
			"outros personagens para ver se est�o mentindo, " +
			"assustados e assim por diante. Quanto mais " +
			"amplia��es um personagem consegue em uma " +
			"rolagem de Perceber, mais informa��es o Mestre " +
			"deve revelar.", Atributo.ASTUCIA, Jogo.SAVAGE_WORLDS),

	PERSUADIR("Persuadir", "Persuadir � a habilidade de convencer outros a " +
			"fazerem o que voc� deseja. " +
			"Extras iniciam em uma destas cinco atitudes " +
			"diferentes: Hostil, N�o Cooperativo, Neutro, " +
			"Amig�vel ou Prestativo. Uma rolagem bemsucedida " +
			"de Persuadir melhora a atitude do Extra " +
			"em um passo ou dois com uma amplia��o. Falhar, " +
			"pelo contr�rio, piora a atitude do personagem em " +
			"um passo ou dois se um 1 for rolado no dado de " +
			"Persuadir (independente do Dado Selvagem). " +
			"Muitos Extras n�o v�o alterar sua rea��o mais " +
			"do que um ou dois n�veis durante uma �nica " +
			"mudan�a, mas isto depende inteiramente do " +
			"Mestre e da situa��o.", Atributo.ASTUCIA, Jogo.SAVAGE_WORLDS),

	PILOTAR("Pilotar", "Pilotar permite a um personagem voar com " +
			"avi�es, helic�pteros, mochilas a jato e qualquer " +
			"outro dispositivo a�reo comum em seu cen�rio e " +
			"hist�rico", Atributo.AGILIDADE, Jogo.SAVAGE_WORLDS),

	PROVOCAR("Provocar", "Provocar � um Teste de Vontade contra o orgulho " +
			"de uma pessoa atrav�s de zombaria, piadas cru�is " +
			"ou humilha��o. � uma rolagem resistida contra " +
			"a Ast�cia do inimigo.", Atributo.ASTUCIA, Jogo.SAVAGE_WORLDS),

	RASTREAR("Rastrear", "Rastrear permite que um personagem siga os " +
			"rastros de um ou mais indiv�duos em qualquer tipo " +
			"de terreno. Cada rolagem geralmente cobre seguir " +
			"os rastros por cerca de um quil�metro e meio, mas " +
			"o Mestre pode ajustar isso dramaticamente para " +
			"escalas de busca mais espec�ficas ou menores.", Atributo.ASTUCIA, Jogo.SAVAGE_WORLDS),

	SOBREVIVENCIA("Sobreviv�ncia", "Sobreviv�ncia permite encontrar comida, �gua " +
			"ou abrigo em ambientes hostis. O personagem pode " +
			"fazer apenas uma rolagem por dia. Uma rolagem " +
			"bem sucedida encontra sustento para uma pessoa, " +
			"com uma amplia��o encontra comida e �gua para " +
			"cinco adultos. Cavalos e outros animais grandes " +
			"contam como dois adultos. Crian�as, camelos ou " +
			"outros com pouco apetite contam como �meio� " +
			"adulto. Todos os beneficiados pela rolagem n�o " +
			"precisam fazer rolagens de Fadiga para comida, " +
			"�gua ou abrigo por esse dia.", Atributo.ASTUCIA, Jogo.SAVAGE_WORLDS);

	private final Identidade id;
	private final Atributo tipoAtributo;
	private final Jogo jogo;
	private int nivelPericia;
	private int modNivelPericia;
	private String especializacao = "";

	
	Pericia(String nome, String descricao, Atributo tipoAtributo, Jogo jogo) {
		id = new Identidade(nome, descricao);
		this.tipoAtributo = tipoAtributo;
		this.jogo = jogo;
	}
	Pericia(String nome, String descricao, Atributo tipoAtributo, Jogo jogo, String especializacao) {
		id = new Identidade(nome, descricao);
		this.tipoAtributo = tipoAtributo;
		this.especializacao = especializacao;
		this.jogo = jogo;
	}

	public Identidade getId() {
		return id;
	}

	public Atributo getTipoAtributo() {
		return tipoAtributo;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public int getNivelPericia() {
		return nivelPericia;
	}

	public int getModNivelPericia() {
		return modNivelPericia;
	}

	public static Pericia[] getPericiasAleatorias(int quantidade) {
		Pericia[] pericias = new Pericia[quantidade];
		Pericia p;
		boolean jaEscolhida = false;
		int random;

		for(int i = 0; i < quantidade; i++) {
			jaEscolhida = false;
			p = Pericia.values()[(int) (Math.random() * Pericia.values().length)];

			for(Pericia x: pericias)
				if(x != null)
					if(x.getId().getNome().equals(p.getId().getNome())){
						jaEscolhida = true;
						break;
					}

			if(!jaEscolhida)
				pericias[i] = p;
			else
				i--;
		}

		for(Pericia x: pericias)
			x.setNivelPericia(Util.arredondarParaProximoPar(Math.random() * 8) + 4);

		return pericias;
	}

	public static Pericia getAleatoria(Pericia p) {
		p.setNivelPericia(Util.arredondarParaProximoPar(Math.random() * 8) + 4);
		return p;
	}

	public void setNivelPericia(int nivel) throws IllegalArgumentException {
		if ((nivel % 2) == 0 && nivel >= 4)
			if (nivel <= 12)
				nivelPericia = nivel;
			else {
				nivelPericia = 12;
				modNivelPericia = (nivel - nivelPericia) / 2;
			}
		else
			throw new IllegalArgumentException("\"nivel\" deve ser par e maior ou igual a 4");
	}

	public String toString() {
		return id.toString();
	}
	
}
