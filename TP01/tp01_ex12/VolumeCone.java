import java.util.Scanner;

public class VolumeCone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do raio da base e da altura
        System.out.print("Digite o raio da base do cone: ");
        double raio = scanner.nextDouble();

        System.out.print("Digite a altura do cone: ");
        double altura = scanner.nextDouble();

        // Cálculo do volume do cone: V = (1/3) * π * r² * h
        double volume = (1.0 / 3.0) * Math.PI * Math.pow(raio, 2) * altura;

        // Exibição do resultado
        System.out.println("O volume do cone é: " + volume);

        scanner.close();
    }
}
