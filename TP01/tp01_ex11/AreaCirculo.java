import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do valor do diâmetro
        System.out.print("Digite o diâmetro do círculo: ");
        double diametro = scanner.nextDouble();

        // Cálculo do raio
        double raio = diametro / 2;

        // Cálculo da área do círculo: A = π * r²
        double area = Math.PI * Math.pow(raio, 2);

        // Exibição do resultado
        System.out.println("A área do círculo é: " + area);

        scanner.close();
    }
}
