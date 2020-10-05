package core;

public enum TipoVantagem {
    VANTAGEM_ANTECEDENTE("Vantagem de Antecedente", "Estas Vantagens s�o benef�cios heredit�rios e " +
            "hist�ricos ou rea��es treinadas que se desenvolvem " +
            "em um personagem depois de treinamento " +
            "prolongado ou exposi��o a certos eventos. " +
            "Jogadores podem escolher estas Vantagens " +
            "depois da cria��o do personagem, mas o Mestre " +
            "pode exigir um pouco mais de racionaliza��o. " +
            "Algu�m pode escolher a Vantagem Atraente, " +
            "por exemplo, se arrumando, passando por uma " +
            "transforma��o e geralmente dando mais aten��o " +
            "a sua apar�ncia. Personagens tamb�m podem " +
            "ser capazes de ganhar a Vantagem Antecedente " +
            "Arcano, caso encontrem um livro de conhecimento " +
            "proibido ou treinando sob a tutela de outro " +
            "indiv�duo arcano no seu grupo.");

    private final String tipo;
    private final String descricao_tipo;

    TipoVantagem(String tipo, String descricao_tipo) {
        this.tipo = tipo;
        this.descricao_tipo = descricao_tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao_tipo() {
        return descricao_tipo;
    }
}
