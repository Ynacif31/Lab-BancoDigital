public class Main {
    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");
        venilton.setSalario(4500); // Configurando o salário para teste

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(20, poupanca);
        cc.sacar(10);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        System.out.println("\n=== Informações sobre Crédito ===");

        cc.analiseDeCredito(venilton.getSalario());// Chamando o método de análise de crédito
        
    }
}