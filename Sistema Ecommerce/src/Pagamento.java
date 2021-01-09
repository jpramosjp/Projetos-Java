public interface Pagamento {
    public void valorPagamento(double valorTotal);
    
    public double taxa(double valorTaxa);
    
    public String finalizaPagamento();
}
