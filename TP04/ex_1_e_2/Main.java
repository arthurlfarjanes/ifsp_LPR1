public class Main {

	public static void main(String[] args) {
		
		Data data = new Data();

        System.out.println("-----------------------------");
        System.out.printf("Dupla: Arthur Lanzilotti e Adriano Junior\n");

        System.out.println("-----------------------------");
        System.out.printf("Dia: %02d\n", data.retDia());
        System.out.printf("Mês: %02d\n", data.retMes());
        System.out.printf("Ano: %04d\n", data.retAno());
        System.out.printf("Dias passados: %d\n", data.diasTranscorridos());
        System.out.println("-----------------------------");

        // Utilizando métodos mostrar
        data.mostra1();
        data.mostra2();

        System.out.println("-----------------------------");
        // Método bissexto
        System.out.printf("É bissexto: %s\n", data.bissexto() ? "Sim" : "Não");
        System.out.println("-----------------------------");

        // Data atual
        data.apresentaDataAtual();
        System.out.println("-----------------------------");

        // Construtor com argumentos
        Data data2 = new Data(22, 5, 2025);
        System.out.println("Método construtor com argumentos");
        System.out.println("-----------------------------");
        System.out.printf("Dia: %02d\n", data2.retDia());
        System.out.printf("Mês: %02d\n", data2.retMes());
        System.out.printf("Ano: %04d\n", data2.retAno());
        System.out.printf("Dias passados: %d\n", data2.diasTranscorridos());
        System.out.println("-----------------------------");

        // Utilizando métodos mostrar
        data2.mostra1();
        data2.mostra2();

        System.out.println("-----------------------------");
        System.out.printf("É bissexto: %s\n", data2.bissexto() ? "Sim" : "Não");
        System.out.println("-----------------------------");

        data2.apresentaDataAtual();
        System.out.println("-----------------------------");
	}

}