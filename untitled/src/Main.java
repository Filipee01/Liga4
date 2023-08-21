import poli.exceções.ModoInvalidoException;
import poli.exceções.TamanhoTabuleiroException;
import poli.jogos.Jogador;
import poli.jogos.modos.Jogo;
import poli.jogos.modos.JogoTurbo;
import poli.jogos.modos.JogoTurboMaluco;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean jogoIniciado = false;

        while (!jogoIniciado) {
            try {
                System.out.print("Informe o tamanho do tabuleiro: ");
                int tamanhoTabuleiro = scanner.nextInt();
                scanner.nextLine();

                if (tamanhoTabuleiro < 4) {
                    throw new TamanhoTabuleiroException("Tamanho do tabuleiro deve ser no mínimo 4.");
                }

                System.out.print("Informe o nome do jogador 1: ");
                String nomeJogador1 = scanner.nextLine();

                System.out.print("Informe o nome do jogador 2: ");
                String nomeJogador2 = scanner.nextLine();

                Jogador jogador1 = new Jogador(nomeJogador1, 'X');
                Jogador jogador2 = new Jogador(nomeJogador2, 'Y');

                int modo;
                while (true) {
                    System.out.println("Informe o modo de jogo: ");
                    System.out.println("1 - NORMAL ");
                    System.out.println("2 - TURBO ");
                    System.out.println("3 - TURBO MALUCO ");
                    modo = scanner.nextInt();
                    scanner.nextLine();

                    if (modo >= 1 && modo <= 3) {
                        break;
                    } else {
                        throw new ModoInvalidoException("Modo de jogo inválido. Escolha uma opção válida.");
                    }
                }

                switch(modo) {
                    case 1:
                        new Jogo(jogador1, jogador2, tamanhoTabuleiro).jogar();
                        break;
                    case 2:
                        new JogoTurbo(jogador1, jogador2, tamanhoTabuleiro).jogar();
                        break;
                    case 3:
                        new JogoTurboMaluco(jogador1, jogador2, tamanhoTabuleiro).jogar();
                        break;
                }

                jogoIniciado = true;
            } catch (TamanhoTabuleiroException e) {
                System.out.println("Erro: " + e.getMessage());
                System.out.println("Reiniciando jogo...");
            } catch (ModoInvalidoException e) {
                System.out.println("Erro: " + e.getMessage());
                System.out.println("Reiniciando seleção de modo de jogo...");
            }
        }

        scanner.close();
    }
}