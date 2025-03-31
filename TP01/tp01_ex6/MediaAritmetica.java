import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos quatro valores
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double valor3 = scanner.nextDouble();

        System.out.print("Digite o quarto valor: ");
        double valor4 = scanner.nextDouble();

        // Cálculo da média aritmética
        double media = (valor1 + valor2 + valor3 + valor4) / 4;

        // Exibição do resultado
        System.out.println("A média aritmética dos valores é: " + media);

        scanner.close();
    }
}
