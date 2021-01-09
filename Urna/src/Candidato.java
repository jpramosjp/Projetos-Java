public class Candidato extends Eleitor implements Candidatura {
    int qtdVotos = 0;
    int numeroCandidatura;
    String cargo;

    public Candidato(String nome, String cpf, String datanasc, String titulo, int numeroCandidatura, String cargo) {
        super(nome, cpf, datanasc, titulo);
        this.numeroCandidatura = numeroCandidatura;
        this.cargo = cargo;
    }

    @Override
    public int numeroCandidatura() {
        return numeroCandidatura;
    }

    public void adicionarVoto() {
        qtdVotos++;
    }

    public int getVotos() {
        return qtdVotos;
    }

    public void setCandidatura(int n) {
        numeroCandidatura = n;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return this.cargo;
    }

}
