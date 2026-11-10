import java.util.ArrayList;
import java.util.List;

public class Computador extends Componente{
    private List<Componente> componentes;

    public Computador(String nome){
        super(nome,0,0,0);
        componentes = new ArrayList<>();
    }

    public void add(Componente comp){
        this.componentes.add(comp);
    }

    public void remove(Componente comp){
        this.componentes.remove(comp);
    }

    @Override
    public double getPrecoCusto() {
        double total = this.precoCusto;

        for(Componente comp: componentes){
            total += comp.getPrecoCusto();
        }
        return total;
    }

    @Override
    public double getPrecoLucroMinimo() {
        double total = this.precoLucroMinimo;

        for(Componente comp: componentes){
            total += comp.getPrecoLucroMinimo();
        }
        return total;
    }

    @Override
    public double getPrecoLucroMaximo() {
        double total = this.precoLucroMaximo;

        for(Componente comp: componentes){
            total += comp.getPrecoLucroMaximo();
        }
        return total;
    }

    @Override
    public String getDescricao(){
        String descricao = this.nome;
        for(Componente comp: componentes){
            descricao += "\n" + comp.getDescricao();
        }
        return descricao;
    }
}
