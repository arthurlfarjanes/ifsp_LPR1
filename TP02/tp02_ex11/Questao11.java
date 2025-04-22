import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M;
        do {
            System.out.print("Digite a ordem da matriz quadrada (até 10): ");
            M = sc.nextInt();
        } while (M <= 0 || M > 10);

        double[][] matriz = new double[M][M];

        System.out.println("Digite os elementos da matriz " + M + "x" + M + ":");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextDouble();
            }
        }

        double determinante = calcularDeterminante(matriz, M);

        System.out.printf("\nDeterminante da matriz: %.2f\n", determinante);
        sc.close();
    }

    public static double calcularDeterminante(double[][] matriz, int ordem) {
        if (ordem == 1) {
            return matriz[0][0];
        }
        if (ordem == 2) {
            return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
        }

        double det = 0;
        for (int k = 0; k < ordem; k++) {
            double[][] submatriz = new double[ordem - 1][ordem - 1];
            for (int i = 1; i < ordem; i++) {
                int colSub = 0;
                for (int j = 0; j < ordem; j++) {
                    if (j == k) continue;
                    submatriz[i - 1][colSub] = matriz[i][j];
                    colSub++;
                }
            }
            det += Math.pow(-1, k) * matriz[0][k] * calcularDeterminante(submatriz, ordem - 1);
        }
        return det;
    }
}
