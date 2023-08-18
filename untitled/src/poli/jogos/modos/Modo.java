package poli.jogos.modos;

public interface Modo {
    public void jogar();

    public boolean verificarDisponibilidade(int coluna, char cor);
}
