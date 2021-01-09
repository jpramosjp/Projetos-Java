import java.util.Random;
public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private char genero;
    private boolean trabalhoFormal;
    private boolean filhos;
    private int valorAuxilio;
    private boolean aprovado = false;
    private int diaMes;
    private int diaRetirada;
    private boolean alerta;


    public Pessoa(String nome, int idade, String cpf, char genero, boolean trabalhoFormal, boolean filhos,int diaMes)
    {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.genero = genero;
        this.trabalhoFormal = trabalhoFormal;
        this.filhos = filhos;
        this.diaMes = diaMes;
    }

    public String getNome() {return nome;}
    public int getIdade() {return idade;}
    public String getCPF() {return cpf;}
    public char getGenero() {return genero;}
    public boolean getTrabalhoFormal() {return trabalhoFormal;}
    public boolean getFilhos() {return filhos;}
    public int getValorAuxilio(){return valorAuxilio;}
    public boolean getAprovado() {return aprovado;}
    public int getDiaMes(){return diaMes;}
    public int getDiaRetirada(){return diaRetirada;}
    public boolean getAlerta() {return alerta;}

    public void setAprovado(boolean aprovado){
        this.aprovado=aprovado;
    }
    public void setValorAuxilio(int valorAuxilio){
        this.valorAuxilio=valorAuxilio;
    }

    public void setAlerta(boolean alerta){
        this.alerta=alerta;
    }

    public int setDiaRetirada(){
        Random geradorAleatorio = new Random();
        diaRetirada= geradorAleatorio.nextInt(31) + 1;
        return diaRetirada;
    }
}