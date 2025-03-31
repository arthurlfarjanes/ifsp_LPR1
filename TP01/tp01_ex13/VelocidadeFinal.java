import java.util.Scanner;

public class VelocidadeFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos valores
        System.out.print("Digite a velocidade inicial (em m/s): ");
        double vInicial = scanner.nextDouble();

        System.out.print("Digite a aceleração (em m/s²): ");
        double aceleracao = scanner.nextDouble();

        System.out.print("Digite o tempo de percurso (em s): ");
        double tempo = scanner.nextDouble();

        // Cálculo da velocidade final: vFinal = vInicial + (aceleracao * tempo)
        double vFinal = vInicial + (aceleracao * tempo);

        // Conversão para km/h
        vFinal *= 3.6;

        // Exibição do resultado
        System.out.println("A velocidade final do automóvel é: " + vFinal + " km/h");

        scanner.close();
    }
}
