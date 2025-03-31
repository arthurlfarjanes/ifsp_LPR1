import java.util.Scanner;

public class ConversaoMilhasMaritimas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do valor em milhas marítimas
        System.out.print("Digite o valor em milhas marítimas: ");
        double milhasMaritimas = scanner.nextDouble();

        // Conversão de milhas marítimas para metros (1 milha marítima = 1852 metros)
        double metros = milhasMaritimas * 1852;

        // Conversão de metros para quilômetros (1 quilômetro = 1000 metros)
        double quilometros = metros / 1000;

        // Exibição do resultado
        System.out.println(milhasMaritimas + " milhas marítimas equivalem a " + quilometros + " quilômetros.");

        scanner.close();
    }
}
