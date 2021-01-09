import java.util.Date;

public class Cerveja extends Produto implements Imposto {
    private double teorAlcoolico;
    private Date dataValidade;

    public Cerveja(String fabricante, String nome, double preco, double teorAlcoolico, Date dataValidade) {
        super(fabricante, nome, preco);
        this.teorAlcoolico = teorAlcoolico;
        this.dataValidade = dataValidade;
    }

    public void setTeorAlcoolico(double teorAlcoolico) {
        this.teorAlcoolico = teorAlcoolico;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public double getTeorAlcoolico() {
        return teorAlcoolico;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    @Override
    public double valorImposto() {
        return super.preco * .08;
    }
}