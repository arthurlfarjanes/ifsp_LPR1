import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int a = sc.nextInt();
        int b;
        do {
            System.out.print("Digite o segundo valor (maior que o primeiro): ");
            b = sc.nextInt();
        } while (b <= a);
        System.out.println("Valores válidos: " + a + " e " + b);
        sc.close();
    }
}
