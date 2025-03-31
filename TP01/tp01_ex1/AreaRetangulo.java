import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos valores
        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        // Cálculo da área
        double area = base * altura;

        // Exibição do resultado
        System.out.println("A área do retângulo é: " + area);

        scanner.close();
    }
}
