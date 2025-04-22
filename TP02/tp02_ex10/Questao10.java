import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M;
        do {
            System.out.print("Digite a ordem da matriz quadrada (até 10): ");
            M = sc.nextInt();
        } while (M <= 0 || M > 10);

        double[][] matriz = new double[M][M];
        double[][] identidade = new double[M][M];

        System.out.println("Digite os elementos da matriz " + M + "x" + M + ":");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < M; i++) {
            identidade[i][i] = 1;
        }

        for (int i = 0; i < M; i++) {
            double pivo = matriz[i][i];
            if (pivo == 0) {
                boolean trocou = false;
                for (int k = i + 1; k < M; k++) {
                    if (matriz[k][i] != 0) {
                        double[] temp1 = matriz[i];
                        matriz[i] = matriz[k];
                        matriz[k] = temp1;

                        double[] temp2 = identidade[i];
                        identidade[i] = identidade[k];
                        identidade[k] = temp2;

                        pivo = matriz[i][i];
                        trocou = true;
                        break;
                    }
                }
                if (!trocou) {
                    System.out.println("A matriz não possui inversa (determinante = 0).");
                    sc.close();
                    return;
                }
            }

            for (int j = 0; j < M; j++) {
                matriz[i][j] /= pivo;
                identidade[i][j] /= pivo;
            }

            for (int k = 0; k < M; k++) {
                if (k != i) {
                    double fator = matriz[k][i];
                    for (int j = 0; j < M; j++) {
                        matriz[k][j] -= fator * matriz[i][j];
                        identidade[k][j] -= fator * identidade[i][j];
                    }
                }
            }
        }

        System.out.println("\nMatriz Original transformada:");
        exibirMatriz(matriz);

        System.out.println("\nMatriz Inversa:");
        exibirMatriz(identidade);

        sc.close();
    }

    public static void exibirMatriz(double[][] mat) {
        for (double[] linha : mat) {
            for (double val : linha) {
                System.out.printf("%.2f\t", val);
            }
            System.out.println();
        }
    }
}
