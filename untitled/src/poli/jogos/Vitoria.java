package poli.jogos;

import poli.jogos.Jogador;
import poli.jogos.Tabuleiro;

public abstract class Vitoria{

    public static boolean jogadorVenceu(Tabuleiro tabuleiro, Jogador jogadorAtual, int tamanho) {
        char cor = jogadorAtual.getCor();
        int highlight;
        if(cor == 'X'){
            highlight = 1;
        } else if (cor == 'Y') {
            highlight = 2;
        }else{
            return false;
        }

        // Verifica linhas
        for (int i = 0; i < tamanho; i++) {
            int count = 0;
            for (int j = 0; j < tamanho; j++) {
                if (tabuleiro.celula[i][j] == cor) {
                    count++;
                    if (count == 4) {
                        for(int k = j-3; k <= j; k++){
                            tabuleiro.celula[i][k] = highlight;
                        }
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }

        // Verifica colunas
        for (int j = 0; j < tamanho; j++) {
            int count = 0;
            for (int i = 0; i < tamanho; i++) {
                if (tabuleiro.celula[i][j] == cor) {
                    count++;
                    if (count == 4) {
                        for(int k = i-3; k <= i; k++){
                            tabuleiro.celula[k][j] = highlight;
                        }
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }

        // Verifica diagonais \
        for (int i = 0; i <= tamanho - 4; i++) {
            for (int j = 0; j <= tamanho - 4; j++) {
                boolean venceu = true;
                for (int k = 0; k < 4; k++) {
                    if (tabuleiro.celula[i + k][j + k] != cor) {
                        venceu = false;
                        break;
                    }
                }
                if (venceu) {
                    for(int k = 0; k < 4; k++){
                        tabuleiro.celula[i + k][j + k] = highlight;
                    }
                    return true;
                }
            }
        }

        // Verifica diagonais /
        for (int i = 3; i < tamanho; i++) {
            for (int j = 0; j <= tamanho - 4; j++) {
                boolean venceu = true;
                for (int k = 0; k < 4; k++) {
                    if (tabuleiro.celula[i - k][j + k] != cor) {
                        venceu = false;
                        break;
                    }
                }
                if (venceu) {
                    for(int k = 0; k < 4; k++){
                        tabuleiro.celula[i - k][j + k] = highlight;
                    }
                    return true;
                }
            }
        }

        return false;
    }
}


