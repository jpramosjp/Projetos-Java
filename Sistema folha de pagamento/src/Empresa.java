import java.util.*;

public class Empresa {
    Financeiro departamentoFinanceiro;
    ArrayList<Funcionario> funcionarios  = new ArrayList();

    public Empresa(Financeiro financeiro) {
        this.departamentoFinanceiro = financeiro;
    }

    public void addFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public ArrayList<Funcionario> listaFuncionarios() {
      return funcionarios;
    }
}