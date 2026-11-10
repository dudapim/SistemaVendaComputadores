public abstract class Componente {
    protected String nome;
    protected double precoCusto;
    protected double precoLucroMinimo;
    protected double precoLucroMaximo;

    public Componente(String nome,double precoCusto, double precoLucroMinimo, double precoLucroMaximo){
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoLucroMaximo = precoLucroMaximo;
        this.precoLucroMinimo = precoLucroMinimo;
    }

    public abstract double getPrecoCusto();
    public abstract double getPrecoLucroMinimo();
    public abstract double getPrecoLucroMaximo();
    public abstract String getDescricao();
}
