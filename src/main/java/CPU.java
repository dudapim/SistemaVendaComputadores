public class CPU extends Componente{
    public CPU (double precoCusto, double precoLucroMinimo, double precoLucroMaximo){
        super("CPU",precoCusto, precoLucroMinimo, precoLucroMaximo);
    }

    @Override
    public double getPrecoCusto(){
        return this.precoCusto;
    }

    @Override
    public double getPrecoLucroMinimo(){
        return this.precoLucroMinimo;
    }

    @Override
    public double getPrecoLucroMaximo() {
        return this.precoLucroMaximo;
    }

    @Override
    public String getDescricao(){
        return this.nome;
    }
}
