import java.util.InputMismatchException;
import java.util.Scanner;

public class Hora {
    private int hora;
    private int min;
    private int seg;

    private Scanner sc = new Scanner(System.in);

    // Construtor padrão com entrada do usuário
    public Hora() {
        setHor();
        setMin();
        setSeg();
    }

    // Construtor com parâmetros
    public Hora(int h, int m, int s) {
        if (validarHora(h)) this.hora = h;
        else throw new IllegalArgumentException("Hora inválida (0-23).");

        if (validarMinutoSegundo(m)) this.min = m;
        else throw new IllegalArgumentException("Minuto inválido (0-59).");

        if (validarMinutoSegundo(s)) this.seg = s;
        else throw new IllegalArgumentException("Segundo inválido (0-59).");
    }

    // Métodos de entrada com leitura do teclado
    public void setHor() {
        while (true) {
            try {
                System.out.print("Digite a hora (0-23): ");
                int h = sc.nextInt();
                if (validarHora(h)) {
                    this.hora = h;
                    break;
                } else {
                    System.out.println("Hora inválida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                sc.next();
            }
        }
    }

    public void setMin() {
        while (true) {
            try {
                System.out.print("Digite os minutos (0-59): ");
                int m = sc.nextInt();
                if (validarMinutoSegundo(m)) {
                    this.min = m;
                    break;
                } else {
                    System.out.println("Minuto inválido.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                sc.next();
            }
        }
    }

    public void setSeg() {
        while (true) {
            try {
                System.out.print("Digite os segundos (0-59): ");
                int s = sc.nextInt();
                if (validarMinutoSegundo(s)) {
                    this.seg = s;
                    break;
                } else {
                    System.out.println("Segundo inválido.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                sc.next();
            }
        }
    }

    // Métodos setters com parâmetro
    public void setHor(int h) {
        if (validarHora(h)) this.hora = h;
        else throw new IllegalArgumentException("Hora inválida (0-23).");
    }

    public void setMin(int m) {
        if (validarMinutoSegundo(m)) this.min = m;
        else throw new IllegalArgumentException("Minuto inválido (0-59).");
    }

    public void setSeg(int s) {
        if (validarMinutoSegundo(s)) this.seg = s;
        else throw new IllegalArgumentException("Segundo inválido (0-59).");
    }

    // Getters
    public int getHor() {
        return hora;
    }

    public int getMin() {
        return min;
    }

    public int getSeg() {
        return seg;
    }

    // Formato 24h
    public String getHora1() {
        return String.format("%02d:%02d:%02d", hora, min, seg);
    }

    // Formato 12h com AM/PM
    public String getHora2() {
        int h = hora % 12;
        if (h == 0) h = 12;
        String periodo = hora < 12 ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", h, min, seg, periodo);
    }

    // Segundos totais
    public int getSegundos() {
        return hora * 3600 + min * 60 + seg;
    }

    // Métodos auxiliares de validação
    private boolean validarHora(int h) {
        return h >= 0 && h <= 23;
    }

    private boolean validarMinutoSegundo(int valor) {
        return valor >= 0 && valor <= 59;
    }

    // Método main para testes
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hora hora = null;

        while (true) {
            System.out.println("\n====== MENU ======");
            System.out.println("1 - Criar hora com entrada do usuário");
            System.out.println("2 - Criar hora com parâmetros");
            System.out.println("3 - Exibir hora (formato 24h)");
            System.out.println("4 - Exibir hora (formato 12h AM/PM)");
            System.out.println("5 - Exibir total de segundos");
            System.out.println("6 - Alterar hora");
            System.out.println("7 - Alterar minuto");
            System.out.println("8 - Alterar segundo");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            int opcao;
            try {
                opcao = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Tente novamente.");
                sc.next();
                continue;
            }

            switch (opcao) {
                case 1:
                    hora = new Hora();
                    break;
                case 2:
                    try {
                        System.out.print("Digite hora (0-23): ");
                        int h = sc.nextInt();
                        System.out.print("Digite minuto (0-59): ");
                        int m = sc.nextInt();
                        System.out.print("Digite segundo (0-59): ");
                        int s = sc.nextInt();
                        hora = new Hora(h, m, s);
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                        sc.nextLine();
                    }
                    break;
                case 3:
                    if (hora != null)
                        System.out.println("Hora (24h): " + hora.getHora1());
                    else
                        System.out.println("Crie uma hora primeiro.");
                    break;
                case 4:
                    if (hora != null)
                        System.out.println("Hora (12h): " + hora.getHora2());
                    else
                        System.out.println("Crie uma hora primeiro.");
                    break;
                case 5:
                    if (hora != null)
                        System.out.println("Total de segundos: " + hora.getSegundos());
                    else
                        System.out.println("Crie uma hora primeiro.");
                    break;
                case 6:
                    if (hora != null)
                        hora.setHor();
                    else
                        System.out.println("Crie uma hora primeiro.");
                    break;
                case 7:
                    if (hora != null)
                        hora.setMin();
                    else
                        System.out.println("Crie uma hora primeiro.");
                    break;
                case 8:
                    if (hora != null)
                        hora.setSeg();
                    else
                        System.out.println("Crie uma hora primeiro.");
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}