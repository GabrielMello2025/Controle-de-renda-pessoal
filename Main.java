import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\n**************************");
        System.out.println("*    CONTROLE DE RENDA   *");
        System.out.println("**************************");

        System.out.print("\nInforme seu nome: ");
        String nome = ler.nextLine();
        System.out.print("Informe o mês: ");
        String mes = ler.nextLine();
        System.out.print("Informe sua renda mensal: ");
        double renda = ler.nextDouble();
        ler.nextLine();

        DadosUsuario usuario = new DadosUsuario(nome, mes, renda);

        while (true) {
            System.out.print("\nDigite o nome do gasto ou ('Exit') para encerrar: ");
            String nomeGasto = ler.nextLine();
            if (nomeGasto.equalsIgnoreCase("exit")) break;

            System.out.print("Digite o valor do gasto: ");
            double valorGasto = ler.nextDouble();
            ler.nextLine();

            usuario.adicionarGastos(new Gastos (nomeGasto, valorGasto));
        }

        usuario.mostrarTabela();
        ler.close();
    }
}
