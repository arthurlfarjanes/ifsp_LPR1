import java.util.Scanner;

public class ConversaoDolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do valor da cotação e quantidade de dólares
        System.out.print("Digite a cotação do dólar: ");
        double cotacaoDolar = scanner.nextDouble();

        System.out.print("Digite a quantidade de dólares: ");
        double dolares = scanner.nextDouble();

        // Cálculo do valor em Reais
        double reais = cotacaoDolar * dolares;

        // Exibição do resultado
        System.out.println("O valor em Reais é: " + reais);

        scanner.close();
    }
}
