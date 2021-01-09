public class PagamentoCartao implements Pagamento {

    private double pagamento;

    @Override
    public void valorPagamento(double valorTotal) {
        this.pagamento = valorTotal + (valorTotal * 0.02);
    }

    @Override
    public double taxa(double valorTaxa) {
        return pagamento * valorTaxa;
    }

    @Override
    public String finalizaPagamento() {
        return "Pagamento Cartao com acrescimo de 2% no valor de R$ " + this.pagamento;
    }
}
