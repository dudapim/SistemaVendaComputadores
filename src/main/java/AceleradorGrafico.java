public class AceleradorGrafico extends Componente{
    public AceleradorGrafico (double precoCusto, double precoLucroMinimo, double precoLucroMaximo){
        super("AceleradorGrafico",precoCusto, precoLucroMinimo, precoLucroMaximo);
    }
    @Override
    public double getPrecoCusto() {
        return this.precoCusto;
    }

    @Override
    public double getPrecoLucroMinimo() {
        return this.precoLucroMinimo;
    }

    @Override
    public double getPrecoLucroMaximo() {
        return this.precoLucroMaximo;
    }

    @Override
    public String getDescricao() {
        return this.nome;
    }

}
