package poli.jogos;

public class Jogador {
    private String nome;
    private char cor;
    private char bola;

    public Jogador(String nome, char cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public char getCor() {
        return cor;
    }
}
