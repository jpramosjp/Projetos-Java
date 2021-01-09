import java.util.ArrayList;

public class Voto {
    private ArrayList<Candidato> candidatos = new ArrayList();

    public void addCandidato(Candidato candidato) {
        candidatos.add(candidato);
    }

    public ArrayList<Candidato> candidatoss() {
        return this.candidatos;
    }

    public boolean votarCandidato(String cargo, int n, Eleitor eleitor) {
        Candidato aux;
        int k = 0;

        if (cargo == "Presidente")
            k = 0;
        else if (cargo == "Governador")
            k = 1;
        else if (cargo == "Deputado")
            k = 2;

        if (eleitor.getCandidato(k) == true) {
            return false;
        }

        for (int i = 0; i < candidatos.size(); i++) {
            aux = candidatos.get(i);
            if (n == aux.numeroCandidatura() && cargo == aux.getCargo()) {
                aux.adicionarVoto();
                eleitor.setCandidato(k, true);

                break;
            }
        }

        return true;
    }
}