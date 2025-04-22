public class Questao6 {
    public static void main(String[] args) {
        String[][] nomes = {
            {"Ana", "Bruno", "Carlos"},
            {"Daniela", "Eduardo", "Fernanda"}
        };

        for (String[] linha : nomes) {
            for (String nome : linha) {
                System.out.print(nome + " ");
            }
            System.out.println();
        }
    }
}
