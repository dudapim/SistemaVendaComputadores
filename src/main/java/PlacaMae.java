public class PlacaMae extends Componente{
    public PlacaMae(double precoCusto, double precoLucroMinimo, double precoLucroMaximo){
        super("PlacaMae",precoCusto, precoLucroMinimo, precoLucroMaximo);
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
