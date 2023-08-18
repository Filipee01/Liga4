package poli.jogos.modos;

import poli.jogos.Jogador;

public class JogoTurbo extends Jogo implements Modo {
    public JogoTurbo(Jogador jogador1, Jogador jogador2, int tamanho) {
        super(jogador1, jogador2, tamanho);
    }

    public void jogar() {
        super.jogar();
    }

    public boolean verificarDisponibilidade(int coluna, char cor) {
        if (coluna < 0 || coluna >= tamanho) {
            return false;
        } else {
            for (int i = tamanho - 1; i >= 0; i--) {
                if (tabuleiro.getCelula()[i][coluna] == 0) {
                    tabuleiro.getCelula()[i][coluna] = cor;
                    if (coluna + 1 < tamanho && tabuleiro.getCelula()[i][coluna + 1] != 0) {
                        tabuleiro.getCelula()[i][coluna + 1] = cor;
                    }if (coluna - 1 >= 0 && tabuleiro.getCelula()[i][coluna - 1] != 0) {
                            tabuleiro.getCelula()[i][coluna - 1] = cor;
                    }return true;
                }
            }
        }return true;
    }
}

