import java.util.Scanner;

public class AreaQuadradoDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do valor da diagonal
        System.out.print("Digite o valor da diagonal do quadrado: ");
        double diagonal = scanner.nextDouble();

        // Cálculo da área usando a fórmula: área = (diagonal²) / 2
        double area = (diagonal * diagonal) / 2;

        // Exibição do resultado
        System.out.println("A área do quadrado é: " + area);

        scanner.close();
    }
}
