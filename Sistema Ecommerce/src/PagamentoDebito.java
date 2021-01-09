public class PagamentoDebito implements Pagamento {
    
    private double pagamento;

    @Override
    public void valorPagamento(double valorTotal) {
        pagamento = valorTotal - (valorTotal * 0.02);
    }

    @Override
    public double taxa(double valorTaxa) {
        return pagamento * valorTaxa;
    }

    @Override
    public String finalizaPagamento() {
        return "Pagamento Debito no valor de R$ " + this.pagamento;
    }
}