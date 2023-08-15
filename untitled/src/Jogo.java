public class Jogo {

    private Jogador jogador

    Jogador jogador1 = new Jogador(nomeJogador1, 'R');
    Jogador jogador2 = new Jogador(nomeJogador2, 'Y');

    Jogador jogadorAtual = jogador1;

    int jogadas = 0;
    boolean jogoFinalizado = false;

        while (!jogoFinalizado) {
        System.out.println("=== Vez do jogador: " + jogadorAtual.getNome() + " ===");

        System.out.print("Informe a coluna onde deseja jogar (0-" + (tamanhoTabuleiro - 1) + "): ");
        int coluna = scanner.nextInt();

        if (tabuleiro.jogar(coluna, jogadorAtual)) {
            jogadas++;
            tabuleiro.printTabuleiro();

            if (Vitoria.jogadorVenceu(tabuleiro, jogadorAtual)) {
                System.out.println("Parabéns, " + jogadorAtual.getNome() + "! Você venceu!");
                jogoFinalizado = true;
            } else if (jogadas == tamanhoTabuleiro * tamanhoTabuleiro) {
                System.out.println("O jogo terminou em empate!");
                jogoFinalizado = true;
            }

            jogadorAtual = (jogadorAtual == jogador1) ? jogador2 : jogador1;
        } else {
            System.out.println("Jogada inválida. Tente novamente.");
        }
    }
}
