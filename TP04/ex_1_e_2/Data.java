import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;

public class Data {

	private int dia;
	private int mes;
	private int ano;
	private Scanner sc = new Scanner(System.in);
	
	public Data()
	{
		entraDia();
		entraMes();
		entraAno();
	}
	public Data(int d, int m, int a) {
		entraDia(d);
		entraMes(m);
		entraAno(a);
	}
	public void entraDia(int d) {
	        try {
	            if (d < 1 || d > 31) {
	                throw new IllegalArgumentException("Dia inválido: " + d);
	            }
	            this.dia = d;
	        } catch (Exception ex) {
	            System.out.println("Erro ao definir o dia: " + ex.getMessage());
	        }
	    }

	public void entraMes(int m) {
	        try {
	            if (m < 1 || m > 12) {
	                throw new IllegalArgumentException("Mês inválido: " + m);
	            }
	            this.mes = m;
	        } catch (Exception ex) {
	            System.out.println("Erro ao definir o mês: " + ex.getMessage());
	        }
	    }

	public void entraAno(int a) {
	        try {
	            if (a < 0) {
	                throw new IllegalArgumentException("Ano inválido: " + a);
	            }
	            this.ano = a;
	        } catch (Exception ex) {
	            System.out.println("Erro ao definir o ano: " + ex.getMessage());
	        }
	    }
	
	public void entraDia() {
	        while (true) {
	            System.out.print("Digite o dia (1-31): ");
	            try {
	                int d = Integer.parseInt(sc.nextLine());
	                if (d >= 1 && d <= 31) {
	                    this.dia = d;
	                    break;
	                } else {
	                    System.out.println("Dia inválido. Tente novamente.");
	                }
	            } catch (NumberFormatException ex) {
	                System.out.println("Entrada inválida. Digite um número inteiro.");
	            }
	        }
	    }
	public void entraMes() {
	        while (true) {
	            System.out.print("Digite o mês (1-12): ");
	            try {
	                int m = Integer.parseInt(sc.nextLine());
	                if (m >= 1 && m <= 12) {
	                    this.mes = m;
	                    break;
	                } else {
	                    System.out.println("Mês inválido. Tente novamente.");
	                }
	            } catch (NumberFormatException ex) {
	                System.out.println("Entrada inválida. Digite um número inteiro.");
	            }
	        }
	    }
	public void entraAno() {
	        while (true) {
	            System.out.print("Digite o ano (ex: 2024): ");
	            try {
	                int a = Integer.parseInt(sc.nextLine());
	                if (a >= 0) {
	                    this.ano = a;
	                    break;
	                } else {
	                    System.out.println("Ano inválido. Tente novamente.");
	                }
	            } catch (NumberFormatException ex) {
	                System.out.println("Entrada inválida. Digite um número inteiro.");
	            }
	        }
	    }
	
	public int retDia() {
		return this.dia;
	}
	public int retMes(){
		return this.mes;	
	}
	public int retAno() {
		return this.ano;		
	}
	
	public String mostra1() {
		return  String.format("%02d:%02d:%04d", this.dia, this.mes, this.ano);
	}
	
    public String mostra2() {
    	return  String.format("%02d:%s:%04d", this.dia, verificarMes(this.mes), this.ano);
	}

	private String verificarMes(int m) {
		    switch (m) {
		        case 1:
		            return "Janeiro";
		        case 2:
		            return "Fevereiro";
		        case 3:
		            return "Março";
		        case 4:
		            return "Abril";
		        case 5:
		            return "Maio";
		        case 6:
		            return "Junho";
		        case 7:
		            return "Julho";
		        case 8:
		            return "Agosto";
		        case 9:
		            return "Setembro";
		        case 10:
		            return "Outubro";
		        case 11:
		            return "Novembro";
		        case 12:
		            return "Dezembro";
		        default:
		            return "Mês inválido.";
		    }
		}

    public boolean bissexto() {
    	int ano = this.ano;
    	return (ano % 4 == 0 && ano % 100 !=0) || (ano % 400 == 0);
	}
    
    public int diasTranscorridos() {
        int dias = this.dia;

        for (int i = 1; i < this.mes; i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                dias += 31;
            } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                dias += 30;
            } else if (i == 2) {
                if (bissexto()) {
                    dias += 29;
                } else {
                    dias += 28;
                }
            }
        }
        return dias;
    }

    
    public void apresentaDataAtual() {
    	Date data = new Date();
    	DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
    	String dataFormatada = dateFormat.format(data); 

        System.out.println("Data atual: " + dataFormatada);
    }
}