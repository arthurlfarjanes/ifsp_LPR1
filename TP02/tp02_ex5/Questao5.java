public class Questao5 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2}, {3, 4}, {5, 6}};
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
