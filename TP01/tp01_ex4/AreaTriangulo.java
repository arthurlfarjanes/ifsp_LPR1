import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos valores
        System.out.print("Digite a base do triângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        double altura = scanner.nextDouble();

        // Cálculo da área
        double area = (base * altura) / 2;

        // Exibição do resultado
        System.out.println("A área do triângulo é: " + area);

        scanner.close();
    }
}
