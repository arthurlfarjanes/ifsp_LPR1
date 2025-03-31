import java.util.Scanner;

public class VolumeEsfera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do valor do diâmetro
        System.out.print("Digite o diâmetro da esfera: ");
        double diametro = scanner.nextDouble();

        // Cálculo do raio (metade do diâmetro)
        double raio = diametro / 2;

        // Cálculo do volume da esfera: V = (4/3) * π * r³
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);

        // Exibição do resultado
        System.out.println("O volume da esfera é: " + volume);

        scanner.close();
    }
}
