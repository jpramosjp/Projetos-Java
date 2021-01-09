public abstract class Produto {
    String fabricante;
    String nome;
    double preco;

    public Produto(String fabricante, String nome, double preco) {
        this.fabricante = fabricante;
        this.nome = nome;
        this.preco = preco;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

}