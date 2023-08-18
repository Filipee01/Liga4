public class Vitoria{

    public static boolean jogadorVenceu(Tabuleiro tabuleiro, Jogador jogadorAtual, int tamanho) {
        char cor = jogadorAtual.getCor();

        // Verifica linhas
        for (int i = 0; i < tamanho; i++) {
            int count = 0;
            for (int j = 0; j < tamanho; j++) {
                if (tabuleiro.celula[i][j] == cor) {
                    count++;
                    if (count == 4) {
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
                    return true;
                }
            }
        }

        return false;
    }
}


