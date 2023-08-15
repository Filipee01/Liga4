import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho do tabuleiro: ");
        int tamanhoTabuleiro = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        Tabuleiro tabuleiro = new Tabuleiro(tamanhoTabuleiro);
        tabuleiro.printTabuleiro();

        System.out.print("Informe o nome do jogador 1: ");
        String nomeJogador1 = scanner.nextLine();

        System.out.print("Informe o nome do jogador 2: ");
        String nomeJogador2 = scanner.nextLine();

        scanner.close();
    }

}

    
