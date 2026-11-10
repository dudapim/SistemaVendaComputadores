
import java.util.ArrayList;
import java.util.List;

public class PlacaVideo extends Componente {

    private List<AceleradorGrafico> aceleradorGrafico;

    public PlacaVideo() {
        super("Placa de Vídeo", 0, 0, 0);
        aceleradorGrafico = new ArrayList<>();
    }

    public void adicionar(AceleradorGrafico comp) {
        this.aceleradorGrafico.add(comp);
    }

    public void remover(AceleradorGrafico comp) {
        this.aceleradorGrafico.remove(comp);
    }

    @Override
    public double getPrecoCusto() {
        double total = this.precoCusto;

        for (AceleradorGrafico comp : this.aceleradorGrafico) {
            total += comp.getPrecoCusto();
        }

        return total;
    }

    @Override
    public double getPrecoLucroMinimo() {
        double total = this.precoLucroMinimo;

        for (AceleradorGrafico comp : this.aceleradorGrafico) {
            total += comp.getPrecoLucroMinimo();
        }

        return total;
    }

    @Override
    public double getPrecoLucroMaximo() {
        double total = this.precoLucroMaximo;

        for (AceleradorGrafico comp : this.aceleradorGrafico) {
            total += comp.getPrecoLucroMaximo();
        }

        return total;
    }

    @Override
    public String getDescricao() {
        String descricao = this.nome;

        for (AceleradorGrafico comp : this.aceleradorGrafico) {
            descricao += "\n" + comp.getDescricao();
        }

        return descricao;
    }
}
