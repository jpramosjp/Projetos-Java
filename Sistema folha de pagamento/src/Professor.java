public class Professor extends Pessoa implements Funcionario {
    int cargaHoraria;
    int qtdFaltas;
    String disciplinaCargo;
    double horaAula;

    public Professor(String nome, String rg, String cpf, String disciplinaCargo, int cargaHoraria, double horaAula, int qtdFaltas) {
        super(nome, rg, cpf);
        this.disciplinaCargo = disciplinaCargo;
        this.cargaHoraria = cargaHoraria;
        this.horaAula = horaAula;
        this.qtdFaltas = qtdFaltas;
    }

    @Override
    public double valorSalarioBruto() {
        return cargaHoraria * horaAula;
    }

    @Override
    public double descontoSalario() {
        return 50.0 * qtdFaltas;
    }

    @Override
    public String getFuncionarioNome() {
        return super.getNome();
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public int getQtdFaltas() {
        return qtdFaltas;
    }

    public double getHoraAula() {
        return horaAula;
    }

    @Override
    public String getCargo() {
        return disciplinaCargo;
    }
}