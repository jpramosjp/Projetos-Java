public abstract class Pessoa {
    private String nome;
    private String cpf;
    private String datanasc;
    private String tituloEleitor;

    public Pessoa(String nome, String cpf, String datanasc, String titulo) {
        this.nome = nome;
        this.cpf = cpf;
        this.datanasc = datanasc;
        this.tituloEleitor = titulo;

    }

    public String pegarNome() {
        return this.nome;
    }
}
