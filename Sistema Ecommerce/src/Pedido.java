public class Pedido {
    private Produto produto;
    int quantidade;
    Imposto imposto;

    public Pedido(Produto produto, int quantidade, Imposto impostinhoDEMERDA) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.imposto = impostinhoDEMERDA;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }
}