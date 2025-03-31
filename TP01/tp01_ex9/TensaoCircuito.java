import java.util.Scanner;

public class TensaoCircuito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos valores de resistência e corrente
        System.out.print("Digite o valor da resistência (em ohms): ");
        double resistencia = scanner.nextDouble();

        System.out.print("Digite o valor da corrente (em amperes): ");
        double corrente = scanner.nextDouble();

        // Cálculo da tensão usando a Lei de Ohm: V = I * R
        double tensao = corrente * resistencia;

        // Exibição do resultado
        System.out.println("A tensão do circuito é: " + tensao + " volts.");

        scanner.close();
    }
}
