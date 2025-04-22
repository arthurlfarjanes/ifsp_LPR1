import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrizOriginal = new int[3][4];
        int[][] matrizMultiplicada = new int[3][4];

        System.out.println("Digite 12 valores para a matriz 3x4:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 4; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matrizOriginal[i][j] = sc.nextInt();
            }

        System.out.print("Digite a constante multiplicativa: ");
        int constante = sc.nextInt();

        // Multiplicação e armazenamento na segunda matriz
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 4; j++)
                matrizMultiplicada[i][j] = matrizOriginal[i][j] * constante;

        // Exibição das matrizes
        System.out.println("\nMatriz Original:");
        for (int[] linha : matrizOriginal) {
            for (int val : linha)
                System.out.print(val + "\t");
            System.out.println();
        }

        System.out.println("\nMatriz Multiplicada:");
        for (int[] linha : matrizMultiplicada) {
            for (int val : linha)
                System.out.print(val + "\t");
            System.out.println();
        }

        sc.close();
    }
}
