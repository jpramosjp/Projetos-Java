import java.util.Arrays;

public class Eleitor extends Pessoa {
    boolean[] votouCandidato = new boolean[3];

    public Eleitor(String nome, String cpf, String datanas, String titulo) {
        super(nome, cpf, datanas, titulo);
        Arrays.fill(votouCandidato, false);
    }

    public void setCandidato(int i, boolean votouP) {
        votouCandidato[i] = votouP;
    }

    public boolean getCandidato(int i) {
        return votouCandidato[i];
    }
}
