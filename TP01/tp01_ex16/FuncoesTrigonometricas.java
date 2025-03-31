import java.util.Scanner;

public class FuncoesTrigonometricas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do ângulo em graus
        System.out.print("Digite o valor do ângulo em graus: ");
        double anguloGraus = scanner.nextDouble();

        // Conversão de graus para radianos
        double anguloRadianos = Math.toRadians(anguloGraus);

        // Cálculo das funções trigonométricas
        double seno = Math.sin(anguloRadianos);
        double cosseno = Math.cos(anguloRadianos);
        double tangente = Math.tan(anguloRadianos);
        double secante = 1 / cosseno;

        // Exibição dos resultados
        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Secante: " + secante);

        scanner.close();
    }
}
