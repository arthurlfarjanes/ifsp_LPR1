import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;

        do {
            System.out.print("Digite o número de linhas (M, até 10): ");
            m = sc.nextInt();
            System.out.print("Digite o número de colunas (N, até 10): ");
            n = sc.nextInt();
        } while (m <= 0 || m > 10 || n <= 0 || n > 10);

        int[][] matriz = new int[m][n];

        // Entrada dos valores
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }

        // Exibir a matriz transposta
        System.out.println("\nMatriz Transposta:");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
