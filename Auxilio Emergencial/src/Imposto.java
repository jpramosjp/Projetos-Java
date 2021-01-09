public class Imposto {
    private double salario;

    public Imposto(double salario){
        this.salario =salario;
    }

    public double calculoImposto(double salario){
        double imposto;
        if(salario < 2000){
            imposto = salario * 0.2;

        }
        else{
            imposto = salario * 0.2; 
        }

        return imposto;

    }
}
