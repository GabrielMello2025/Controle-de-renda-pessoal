public class Gastos {
    private String nomeGasto;
    private double gastosMensal;

    
    public Gastos(String nomeGasto , double gastosMensal) {
        this.nomeGasto = nomeGasto;
        this.gastosMensal = gastosMensal;
    }

    
    public String getNomeGasto() {
        return nomeGasto;
    }

    public double getGastoMensal() {
        return gastosMensal;
    }
}
