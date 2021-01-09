public class Computador extends Produto implements Imposto {
    private String hd;
    private String processador;
    private String memoria;

    public Computador(String fabricante, String nome, double preco, String hd, String processador, String memoria) {
        super(fabricante, nome, preco);
        this.hd = hd;
        this.processador = processador;
        this.memoria = memoria;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getHd() {
        return hd;
    }

    public String getProcessador() {
        return processador;
    }

    public String getMemoria() {
        return memoria;
    }

    @Override
    public double valorImposto() {
        return super.preco * 0.05;
    }
}