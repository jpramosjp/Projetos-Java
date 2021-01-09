public class UrnaTeste {
    public static void main(String[] args) {
        Urna urna = new Urna();
        Voto votoUnico = new Voto();

        Candidato c1P = new Candidato("Joao", "244242424", "23/10/2000", "1234560", 13, "Presidente");
        Candidato c2P = new Candidato("Mayara", "244242424", "21/07/1989", "8521463", 14, "Presidente");
        Candidato c3P = new Candidato("Arthur", "3669842", "28/05/2002", "12542763", 25, "Presidente");

        Candidato c1G = new Candidato("Vinicius", "23514635", "22/03/2001", "52442256", 13, "Governador");
        Candidato c2G = new Candidato("Hygao", "87592952", "26/11/2001", "3252195185", 14, "Governador");
        Candidato c3G = new Candidato("Carlos", "21351256", "18/06/2001", "285029467", 25, "Governador");

        Candidato c1D = new Candidato("Miyashiro", "23568592", "23/10/1999", "2323257", 13, "Deputado");
        Candidato c2D = new Candidato("Marcelo", "23568592", "23/10/1999", "2323257", 14, "Deputado");
        Candidato c3D = new Candidato("Sossai", "23568592", "23/10/1999", "2323257", 25, "Deputado");

        Eleitor e1 = new Eleitor("Henrique", "123456", "1/1/2000", "6666");
        Eleitor e2 = new Eleitor("Bressanin", "235624", "06/12/1999", "6667");
        Eleitor e3 = new Eleitor("Matheus", "123459", "12/9/2000", "6668");
        Eleitor e4 = new Eleitor("Israel", "245542", "08/11/1996", "6669");
        Eleitor e5 = new Eleitor("Roger", "2456823", "2/1/2000", "6670");

        votoUnico.addCandidato(c1P);
        votoUnico.addCandidato(c2P);
        votoUnico.addCandidato(c3P);

        votoUnico.addCandidato(c1G);
        votoUnico.addCandidato(c2G);
        votoUnico.addCandidato(c3G);

        votoUnico.addCandidato(c1D);
        votoUnico.addCandidato(c2D);
        votoUnico.addCandidato(c3D);

        if (votoUnico.votarCandidato("Presidente", 13, c1P)) {
            urna.addVoto(votoUnico);
        }
        
        if (votoUnico.votarCandidato("Presidente", 13, e5)) {
            urna.addVoto(votoUnico);
        }

        if (votoUnico.votarCandidato("Governador", 25, c2D)) {
            urna.addVoto(votoUnico);
        }

        if (votoUnico.votarCandidato("Governador", 13, e2)) {
            urna.addVoto(votoUnico);
        }

        if (votoUnico.votarCandidato("Governador", 13, e5)) {
            urna.addVoto(votoUnico);
        }

        if (votoUnico.votarCandidato("Deputado", 25, e5)) {
            urna.addVoto(votoUnico);
        }

        if (votoUnico.votarCandidato("Deputado", 25, e3)) {
            urna.addVoto(votoUnico);
        }

        System.out.println("Total de Votos: " + urna.totalVotos() + "\n");
        System.out.println("Presidentes:");
        System.out.println("Joao: " + urna.totalVotosCandidato("Joao"));
        System.out.println("Mayara: " + urna.totalVotosCandidato("Mayara"));
        System.out.println("Arthur: " + urna.totalVotosCandidato("Arthur")+ "\n");
        System.out.println("Governador:");
        System.out.println("Vinicius: " + urna.totalVotosCandidato("Vinicius"));
        System.out.println("Hygao: " + urna.totalVotosCandidato("Hygao"));
        System.out.println("Carlos: " + urna.totalVotosCandidato("Carlos")+ "\n");
        System.out.println("Deputado:");
        System.out.println("Miyashiro: " + urna.totalVotosCandidato("Miyashiro"));
        System.out.println("Sossai: " + urna.totalVotosCandidato("Sossai"));
        System.out.println("Marcelo: " + urna.totalVotosCandidato("Marcelo"));
    }
}
