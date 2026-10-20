public class ContaBancaria {
    private String numeroConta;
    private double saldo;
    public Cliente cliente;
    
    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public ContaBancaria(String numeroConta, double saldo, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public void depositar(double valor) {
        if (valor == 0) {
            System.out.println("Valor inválido");
        } else {
            saldo = saldo + valor;
            System.out.println("Deposito de: " + valor);
        }
    }

    public void sacar(double valor) {
        if (valor == 0 || valor > saldo) {
            System.out.println("Valor inválido ou Saldo indisponível");
        } else {
            saldo = saldo - valor;
            System.out.println("Saque de: " + valor);
        }
    }

    public void exibirSaldo(){
        System.out.println("Saldo: " + saldo);
    }

    public void exibirDados(){
        System.out.println("Conta: " + numeroConta);
        exibirSaldo();
        cliente.exibir();
    }
}
