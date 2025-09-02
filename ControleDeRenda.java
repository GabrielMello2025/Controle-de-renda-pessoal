import java.util.Scanner;

public class ControleDeRenda {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("\n**************************");  
        System.out.println("*                        *");
        System.out.println("*    CONTROLE DE RENDA   *");
        System.out.println("*                        *");
        System.out.println("**************************");
        double gastosMensal = 0.0;
        double rendaFinal = 0.0;
        String nomeGasto = "";
        System.out.println("\nCaro usuario, o sistema consiste em duas Etapas.");
        System.out.println("\n1° Cadastro de usuario.");
        System.out.println("2° Informações de gastos.");
        System.out.print("\nAperte ENTER para iniciar o cadstro. ");
        ler.nextLine();
        System.out.println("\nEtapa 1° Cadastro do usuario.");

        // Dados do usuario 
        System.out.print("\nInforme seu nome: ");
        String nome = ler.nextLine();
        System.out.print("Informe o nome do mês para controle de renda: ");
        String mes = ler.nextLine();
        System.out.print("Informe sua renda mensal: ");
        double rendaMensal = ler.nextDouble();

        System.out.print("\nAperte ENTER para prosseguir para 2 etapa. ");
        ler.nextLine();
        ler.nextLine();
        System.out.println("\nEtapa 2° Dados e valores de gastos.");
        
        String tabela = "";
        rendaFinal = rendaMensal;

            
        // gastos do controle de renda 
        while (true) {
            System.out.print("\nDigite o nome do gasto ou ('Exit') para encerrar: ");
            nomeGasto = ler.nextLine();
            if (nomeGasto.equalsIgnoreCase("exit")) {     
            break;
            }
            System.out.print("Digite o valolr do gasto: ");
            gastosMensal = ler.nextDouble();
            ler.nextLine();
            rendaFinal -=gastosMensal;
            tabela += String.format("%-20s %-20.2f %-20.2f%n", nomeGasto, gastosMensal, rendaFinal);
    }
        System.out.print("\nUsuario: " + nome + "    Mês: " + mes);
        System.out.printf("\n%-20s %-20s %-20s%n", "Nome do Gasto", "Gasto (R$)", "Renda Final (R$)");
        System.out.println("------------------------------------------------------------------");
        System.out.print(tabela);
        ler.close();
    }

}
