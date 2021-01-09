public class Auxilioo {
   public int totalBeneficiarios;
    public int idade;
    public boolean empregoFormal;
    public boolean seguroDesemprego;
    public boolean dependentes;
    public boolean solteiro;
    public double totalVerba;
     
             public void confere1(int idade){
                  if(idade>=18){
                      confere2(empregoFormal);
                  }
                 else{
                    System.out.println("Auxilio Negado: Você não possui idade permitida");
                 }
             }
    
             public void confere2(boolean empregoFormal){
                if(empregoFormal==false){
                    confere3(seguroDesemprego);
               }
                else{
                  System.out.println("Auxilio Negado: Você possui emprego");
               }
              }
    
              public void confere3(boolean seguroDesemprego){
                 if(seguroDesemprego==false){
                  confere4(dependentes);
                 }
                 else{
                  System.out.println("Auxilio Negado: Você está recebendo seguro-desemprego");
                }
             }
    
             public void confere4(boolean dependentes){
                if(dependentes==true){
                    confere5(solteiro);
                }
                else{
                   totalVerba=+600;
                  System.out.println("Auxilio Aprovado: Você receberá R$600,00 reais");
                 }
             }
    
        public void confere5(boolean solteiro){
            if(solteiro==true){
                totalVerba=+1200;
                System.out.println("Auxilio Aprovado: Você receberá R$1.200,00 reais");
                }
            else{
                totalVerba=+600;
                System.out.println("Auxilio Aprovado: Você receberá R$600,00 reais");
            }
        }
          
}
    
