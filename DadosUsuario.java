import java.util.ArrayList;
import java.util.List;

public class DadosUsuario {
    private String nome;
    private String mes;
    private double rendaMensal;
    private double rendaFinal;
    private List<Gastos> gastos = new ArrayList<>();

    public DadosUsuario(String nome, String mes, double rendaMensal){
        this.nome = nome;
        this.mes = mes;
        this.rendaMensal = rendaMensal;
        this.rendaFinal = rendaMensal;
    }
    public void adicionarGastos(Gastos g) {
        gastos.add(g);
        rendaFinal -= g.getGastoMensal();
    }

    public void mostrarTabela() {
        System.out.print("\nUsuário: " + nome + "   Mês: " + mes);
        System.out.println();
        System.out.printf("\n%-20s %-20s %-20s%n", "Nome do Gasto", "Gasto (R$)", "Renda Final (R$)");
        System.out.println("------------------------------------------------------------------");

        for (Gastos g : gastos) {
            System.out.printf("%-20s %-20.2f %-20.2f%n", g.getNomeGasto(), g.getGastoMensal(), rendaFinal);
        }

        System.out.printf("\nSaldo final do mês: R$ %.2f%n\n", rendaFinal);

    }
}