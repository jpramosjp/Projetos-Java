import java.util.ArrayList;

public class Financeiro implements Salario{
    ArrayList<Funcionario> funcionariosPagos  = new ArrayList();
    ArrayList<Double> listaSalarios = new ArrayList();

    public void addFuncionarioPago(Funcionario funcionario) {
        this.funcionariosPagos.add(funcionario);
    }

    public void addSalario(double salario) {
        this.listaSalarios.add(salario);
    }

    public ArrayList<Funcionario> listaFuncionariosPagos() {
        return funcionariosPagos;
    }

    public ArrayList<Double> getListaSalarios() {
        return listaSalarios;
    }

    public double totalSalarios() {
        double totalSalario = 0.0;

        for(double salario : listaSalarios) {
            totalSalario += salario;
        }

        return totalSalario;
    }

    @Override
    public void valorSalarioLiquido(Funcionario funcionarioAPagar) {
        double salarioLiquido = funcionarioAPagar.valorSalarioBruto() - funcionarioAPagar.descontoSalario();

        addFuncionarioPago(funcionarioAPagar);
        addSalario(salarioLiquido);
    }
}