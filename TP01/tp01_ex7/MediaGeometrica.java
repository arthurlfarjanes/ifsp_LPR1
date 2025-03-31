import java.util.Scanner;

public class MediaGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos dois valores
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        // Cálculo da média geométrica
        double mediaGeometrica = Math.sqrt(valor1 * valor2);

        // Exibição do resultado
        System.out.println("A média geométrica dos valores é: " + mediaGeometrica);

        scanner.close();
    }
}
