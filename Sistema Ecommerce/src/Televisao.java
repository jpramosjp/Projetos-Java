public class Televisao extends Produto implements Imposto{
    private String resolucao;
    private double peso;
    private String tamanho;

    public Televisao(String fabricante, String nome, double preco, String resolucao, double peso, String tamanho) {
        super(fabricante, nome, preco);
        this.resolucao = resolucao;
        this.peso = peso;
        this.tamanho = tamanho;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getResolucao() {
        return resolucao;
    }

    public double getPeso() {
        return peso;
    }

    public String getTamanho() {
        return tamanho;
    }
    
    @Override
    public double valorImposto() {
        return super.preco * 0.11;
    }
}
