import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos valores X e Y
        System.out.print("Digite o valor de X: ");
        double X = scanner.nextDouble();

        System.out.print("Digite o valor de Y: ");
        double Y = scanner.nextDouble();

        // Cálculo de X elevado a Y
        double resultado = Math.pow(X, Y);

        // Exibição do resultado
        System.out.println("O resultado de " + X + " elevado a " + Y + " é: " + resultado);

        scanner.close();
    }
}
