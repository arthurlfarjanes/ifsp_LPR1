import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do valor da aresta
        System.out.print("Digite o valor da aresta do quadrado: ");
        double aresta = scanner.nextDouble();

        // Cálculo da área
        double area = aresta * aresta;

        // Exibição do resultado
        System.out.println("A área do quadrado é: " + area);

        scanner.close();
    }
}
