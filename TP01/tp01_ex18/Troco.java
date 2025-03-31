import java.util.Scanner;

public class Troco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        
        // Entrada dos valores dos produtos
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o valor do produto " + i + ": ");
            total += scanner.nextDouble();
        }

        // Entrada do valor pago
        System.out.print("Digite o valor pago: ");
        double pago = scanner.nextDouble();

        // Cálculo do troco
        double troco = pago - total;

        // Exibição do resultado
        if (troco >= 0) {
            System.out.println("O troco a ser devolvido é: R$ " + troco);
        } else {
            System.out.println("Valor insuficiente para o pagamento.");
        }

        scanner.close();
    }
}
