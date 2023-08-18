import poli.jogos.Jogador;
import poli.jogos.modos.Jogo;
import poli.jogos.modos.JogoTurbo;
import poli.jogos.modos.JogoTurboMaluco;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho do tabuleiro: ");
        int tamanhoTabuleiro = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Informe o nome do jogador 1: ");
        String nomeJogador1 = scanner.nextLine();

        System.out.print("Informe o nome do jogador 2: ");
        String nomeJogador2 = scanner.nextLine();

        Jogador jogador1 = new Jogador(nomeJogador1, 'X');
        Jogador jogador2 = new Jogador(nomeJogador2, 'Y' );
        Jogo jogo = new Jogo(jogador1, jogador2, tamanhoTabuleiro);
        JogoTurbo jogoTurbo = new JogoTurbo(jogador1, jogador2, tamanhoTabuleiro);
        JogoTurboMaluco jogoTurboMaluco = new JogoTurboMaluco(jogador1, jogador2, tamanhoTabuleiro);

        System.out.println("Informe o modo de jogo: ");
        System.out.println("1 - NORMAL ");
        System.out.println("2 - TURBO ");
        System.out.println("3 - TURBO MALUCO ");
        int modo = scanner.nextInt();
        scanner.nextLine();

        switch(modo){
            case 1:
                jogo.jogar();
                break;
            case 2:
                jogoTurbo.jogar();
                break;
            case 3:
                jogoTurboMaluco.jogar();
                break;
        }

        scanner.close();
    }

}

    
