import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continuar;

        do {
            int n;
            do {
                System.out.print("Digite a quantidade de valores (menor que 20): ");
                n = sc.nextInt();
            } while (n <= 0 || n >= 20);

            int[] valores = new int[n];
            int soma = 0, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
            int positivos = 0, negativos = 0;

            for (int i = 0; i < n; i++) {
                System.out.print("Digite o valor " + (i + 1) + ": ");
                valores[i] = sc.nextInt();
                soma += valores[i];
                if (valores[i] > maior) maior = valores[i];
                if (valores[i] < menor) menor = valores[i];
                if (valores[i] >= 0) positivos++;
                else negativos++;
            }

            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
            System.out.println("Soma: " + soma);
            System.out.println("Média: " + (soma / (double) n));
            System.out.printf("%% Positivos: %.2f%%\n", (positivos * 100.0) / n);
            System.out.printf("%% Negativos: %.2f%%\n", (negativos * 100.0) / n);

            do {
                System.out.print("Deseja executar novamente? (S/N): ");
                continuar = sc.next().toUpperCase().charAt(0);
            } while (continuar != 'S' && continuar != 'N');
        } while (continuar == 'S');

        sc.close();
    }
}
