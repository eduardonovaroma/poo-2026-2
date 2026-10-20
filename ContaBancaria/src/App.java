import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
    
        // Cliente cliente_ = new Cliente("Fulano", "(81)99999-8888");
        // ContaBancaria conta = new ContaBancaria("12345", 0, cliente_);

        // conta.depositar(1000.0);
        // conta.exibirSaldo();
        // conta.sacar(100);
        // conta.exibirSaldo();

        // System.out.println("============");
        // conta.exibirDados();
        // conta.cliente.exibir();


        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("José", "(81)99999-0000", 1));
        clientes.add(new Cliente("João", "(81)99999-0001", 2));
        clientes.add(new Cliente("Maria", "(81)99999-0002", 3));

        int soma = 0;
        System.out.println("Clientes:");
        for (Cliente cliente : clientes) {
            cliente.exibir();
            soma += cliente.valor;
        }
        System.out.println("Soma dos valores: " + soma);
    }
}
