public class App {
    public static void main(String[] args) throws Exception {
        Pessoa homemAprovado = new Pessoa("Joao", 19, "818.687.102-03", 'M', false, false,17);
        Auxilio auxilioHomemAprovado = new Auxilio();

        auxilioHomemAprovado.controleBeneficiario(homemAprovado);
        auxilioHomemAprovado.envioAlertas(homemAprovado);
        if(homemAprovado.getAprovado() ==false){
            System.out.println("\n Data de inscricao "+ homemAprovado.getDiaMes() + "\nJa foi inscrito.");
        }
        else{
            System.out.println( "\n Data de inscricao "+ homemAprovado.getDiaMes() +"\nInscrito com sucesso.");
        }
        System.out.println("\nNome: " + homemAprovado.getNome() + "\nCPF: " + homemAprovado.getCPF() + "\nAprovado: " + homemAprovado.getAprovado() + "\nValor do Auxilio: R$" + homemAprovado.getValorAuxilio() + "\nData de Retirada do Auxilio: " + homemAprovado.getDiaRetirada());

        if(homemAprovado.getAlerta()==true){
            System.out.println("\nO auxilio pode ser retirado.");
        }
        else{
            System.out.println("\nO auxilio ainda nao pode ser retirado.");
        }

        

    
    }
}