public class Gastos {
    private String nomeGasto;
    private double gastosMensal;

    // 🔹 Construtor correto
    public Gastos(String nomeGasto , double gastosMensal) {
        this.nomeGasto = nomeGasto;
        this.gastosMensal = gastosMensal;
    }

    // Getters
    public String getNomeGasto() {
        return nomeGasto;
    }

    public double getGastoMensal() {
        return gastosMensal;
    }
}
