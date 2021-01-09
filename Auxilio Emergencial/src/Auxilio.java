public class Auxilio {
   
    public Pessoa controleBeneficiario (Pessoa pessoa) {
        if (pessoa.getAprovado()==false) {
            if (pessoa.getIdade() >= 18 && pessoa.getTrabalhoFormal() == false) {
                pessoa.setAprovado(true);
                controleVerbas(pessoa); 
            }
        }
        return pessoa;
            
        
    }

   

    public Pessoa controleVerbas(Pessoa pessoa) {
        if(pessoa.getGenero() == 'F' && pessoa.getFilhos()) {
            pessoa.setValorAuxilio(1200);
        }
        else {
           pessoa.setValorAuxilio(600);
        }
        return pessoa;    
    }

    public Pessoa envioAlertas(Pessoa pessoa) {
        if(pessoa.getAprovado()) {
            if (pessoa.setDiaRetirada() <= pessoa.getDiaMes()) {
                
                pessoa.setAlerta(true);
            }
            else {
                pessoa.setAlerta(false);
                
            }
        }
        return pessoa;
    }
}