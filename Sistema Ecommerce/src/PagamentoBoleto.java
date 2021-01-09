public class PagamentoBoleto implements Pagamento {

    private double pagamento;

    @Override
    public void valorPagamento(double valorTotal) {
        pagamento = valorTotal - (valorTotal * 0.75);
    }

    @Override
    public double taxa(double valorTaxa) {
        return pagamento * valorTaxa;
    }

    @Override
    public String finalizaPagamento() {
        return "Pagamento no Boleto no Valor de R$ " + this.pagamento;
    }
}