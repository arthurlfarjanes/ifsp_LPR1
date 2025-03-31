import java.util.Scanner;

public class VolumeLivre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos valores de raio e aresta
        System.out.print("Digite o valor do raio da esfera: ");
        double raio = scanner.nextDouble();

        System.out.print("Digite o valor da aresta do cubo: ");
        double aresta = scanner.nextDouble();

        // Cálculo do volume do cubo: V_cubo = a³
        double volumeCubo = Math.pow(aresta, 3);

        // Cálculo do volume da esfera: V_esfera = (4/3) * π * r³
        double volumeEsfera = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);

        // Volume livre = volume do cubo - volume da esfera
        double volumeLivre = volumeCubo - volumeEsfera;

        // Exibição do resultado
        System.out.println("O volume livre no ambiente é: " + volumeLivre);

        scanner.close();
    }
}
