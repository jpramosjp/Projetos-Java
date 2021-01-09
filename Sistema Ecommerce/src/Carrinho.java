import java.util.ArrayList;

public class Carrinho {
    ArrayList<Pedido> pedidos = new ArrayList();

    public void addPedidos(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    public String listarPedidos() {
        String listaPedidos = "";

        for (Pedido pedido : pedidos) {
            Produto produto = pedido.getProduto();
            listaPedidos += produto.getNome() + " - " + pedido.getQuantidade() + " unidades - R$ "
                    + produto.getPreco() * pedido.getQuantidade() + "\n";
        }

        return listaPedidos;
    }

    public int somarPedidos() {
        int quantidadeTotal = 0;

        for (Pedido pedido : pedidos) {
            quantidadeTotal += pedido.getQuantidade();
        }

        return quantidadeTotal;
    }

    public double precoTotal() {
        double precoTotal = 0.0;

        for (Pedido pedido : pedidos) {
            Produto produto = pedido.getProduto();
            precoTotal += (pedido.getQuantidade() * produto.getPreco());
        }

        return precoTotal;
    }

    public double totalValorImposto() {
        double totalImposto = 0;
        double valorTotalPedido = 0;

        for (Pedido pedido : pedidos) {
            valorTotalPedido = pedido.imposto.valorImposto() * pedido.quantidade;
            totalImposto += valorTotalPedido;
        }

        return totalImposto;
    }

    public void limparCarrinho() {
        pedidos.clear();
    }

    public String efetuarPagamento(Pagamento pagamento) {
        pagamento.valorPagamento(this.precoTotal());
        limparCarrinho();
        return pagamento.finalizaPagamento();
    }
}