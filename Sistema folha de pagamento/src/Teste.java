public class Teste {
    public static void main(String[] args) throws Exception {
        Financeiro arthurMoney = new Financeiro();
        Empresa escolaDoArthur = new Empresa(arthurMoney);

        Professor arthurMatematica = new Professor("Arthur", "123456789", "987654321", "Professor de Matematica", 32, 20.3, 5);
        Professor israelFisica = new Professor("Israel", "54123997", "753698412", "Professor de Fisica", 8, 20.3, 0);
        Professor angelaHistoria = new Professor("Angela", "15239874", "452369871", "Professor de Historia", 8, 15.7, 2);

        Motorista jaozinDaVan = new Motorista("Jao", "987654321", "123456789", 20, 9.6);
        Motorista mayaraDaVan = new Motorista("Mayara", "125634789", "365214589", 10, 12.3);

        escolaDoArthur.addFuncionario(jaozinDaVan);
        escolaDoArthur.addFuncionario(mayaraDaVan);

        escolaDoArthur.addFuncionario(arthurMatematica);
        escolaDoArthur.addFuncionario(israelFisica);
        escolaDoArthur.addFuncionario(angelaHistoria);

        escolaDoArthur.departamentoFinanceiro.valorSalarioLiquido(arthurMatematica);
        escolaDoArthur.departamentoFinanceiro.valorSalarioLiquido(jaozinDaVan);
        escolaDoArthur.departamentoFinanceiro.valorSalarioLiquido(israelFisica);

        System.out.println("Lista de Funcionarios:");
        for (Funcionario funcionario : escolaDoArthur.listaFuncionarios()) {
            System.out.println("Nome: " + funcionario.getFuncionarioNome() + " | Cargo: " + funcionario.getCargo());
        }

        System.out.println("\nLista de Funcionarios Pagos:");
        Financeiro departamentoFinanceiro = escolaDoArthur.departamentoFinanceiro;
        for (int i = 0; i < departamentoFinanceiro.funcionariosPagos.size(); i++) {
            Funcionario funcionario = departamentoFinanceiro.funcionariosPagos.get(i);
            double salarioLiquido = departamentoFinanceiro.listaSalarios.get(i);

            System.out.println("Nome: " + funcionario.getFuncionarioNome() + " | Cargo: " + funcionario.getCargo() + " | Salario: " + salarioLiquido);
        }
        System.out.println("\nTotal salarios pagos: R$ " + departamentoFinanceiro.totalSalarios());
    }

}