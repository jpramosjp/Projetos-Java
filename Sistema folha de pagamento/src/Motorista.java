public class Motorista extends Pessoa implements Funcionario {
    private int totalCorridasDia;
    private double mediaCorrida;
    

    public Motorista(String nome, String rg, String cpf, int totalCorridasDia, double mediaCorrida) {
        super(nome, rg, cpf);
        this.totalCorridasDia = totalCorridasDia;
        this.mediaCorrida = mediaCorrida;
    }

    @Override
    public String getFuncionarioNome() {
        return super.getNome();
    }

    @Override
    public double valorSalarioBruto() {
        return totalCorridasDia * mediaCorrida;
    }

    @Override
    public double descontoSalario() {
        return mediaCorrida * totalCorridasDia * 0.25;
    }

    @Override
    public String getCargo() {
        return "Motorista";
    }
}