import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        char [][] tabuleiro = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        char jogadorAtual ='X';
        boolean jogoEmAndamento = true;

        while (jogoEmAndamento) {
            exibirTabuleiro(tabuleiro);
            fazerJogada(tabuleiro, jogadorAtual);

            if (verificarVitoria (tabuleiro, jogadorAtual)) {
                exibirTabuleiro(tabuleiro);
                System.out.println("Jogador "+ jogadorAtual + "Venceu");
                jogoEmAndamento = false;
            } else if (verificarEmpate(tabuleiro)) {
                exibirTabuleiro(tabuleiro);
                System.out.println("O jogo terminou em empate!");
                jogoEmAndamento = false;
            }

            jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
        }        

    }
    public static void exibirTabuleiro(char [][] tabuleiro) {
        System.out.println(" 0  1  2");
        System.out.println("-------------");
        for(int i = 0; i < 3; i++)  {
            System.out.println("| ");
            for(int j = 0; j < 3; j++){
                System.out.println(tabuleiro[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public static void fazerJogada(char[][]tabuleiro, char jogador){
        Scanner scanner = new Scanner(System.in);
        int linha, coluna;

        do {
            System.out.println("Jogador "+ jogador + ", informe a linha (0, 1, 2) : ");
            linha = scanner.nextInt();
            System.out.println("Jogador " + jogador +", informe a coluna (0, 1, 2 :)" );
            coluna = scanner.nextInt();

        }while (tabuleiro[linha][coluna] != ' ');
        
        tabuleiro[linha] [coluna] = jogador;
        
    }
    public static boolean verificarVitoria(char[][] tabuleiro, char jogador) {
        for (int i = 0; i<3; i++){
            if ((tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro [i][2] == jogador) ||
                (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador)){
                    return true;
                
            }
        }
        return (tabuleiro [0][0] == jogador && tabuleiro [1][1] == jogador && tabuleiro [2][2] == jogador) ||
                (tabuleiro [0][2] == jogador && tabuleiro [1][1] == jogador && tabuleiro [2][0] == jogador);
    }
    public static boolean verificarEmpate(char[][]tabuleiro){
        for(int i = 0;  i < 3; i++){
            for( int j = 0; j <3; j++){
                if (tabuleiro[i][j] == ' ') {
                    return false;
                    
                }
            }
        }
        return true;
    }
}
