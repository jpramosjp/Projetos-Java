import java.util.ArrayList;

public class Urna {
    private ArrayList<Voto> votos = new ArrayList();

    public void addVoto(Voto voto) {
        votos.add(voto);
    }

    public ArrayList<Voto> votoss() {
        return this.votos;
    }

    public int totalVotos() {
        return votos.size();
    }

    public int totalVotosCandidato(String nome) {
        for (int i = 0; i < votos.size(); i++) {
            Voto votoT = votos.get(i);
            for (int j = 0; j < votoT.candidatoss().size(); j++) {
                if (nome == votoT.candidatoss().get(j).pegarNome()) {
                    return votoT.candidatoss().get(j).getVotos();
                }
            }
        }
        return 0;
    }
}
