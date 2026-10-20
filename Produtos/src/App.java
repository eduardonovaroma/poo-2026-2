import java.util.ArrayList;

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

class Pedido {
    private int numeroPedido;
    private ArrayList<Produto> produtos;

    public Pedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
        this.produtos = new ArrayList<Produto>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularTotal() {
        double total = 0;

        for (Produto produto : produtos) {
            total += produto.getPreco();
        }

        return total;
    }

    public void exibirResumo() {
        System.out.println("Pedido numero: " + numeroPedido);
        System.out.println("Produtos:");

        for (Produto produto : produtos) {
            System.out.println("- " + produto.getNome());
        }

        System.out.printf("Total: R$ %.2f%n", calcularTotal());
    }
}

public class App {

    
    public static void main(String[] args) {
        Pedido pedido = new Pedido(101);
        
        pedido.adicionarProduto(new Produto("Teclado", 150.00));
        pedido.adicionarProduto(new Produto("Mouse", 80.00));
        pedido.adicionarProduto(new Produto("Monitor", 900.00));
        
        pedido.exibirResumo();
        
        
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");

        System.out.println("Frutas:");
        for (String fruta : frutas) {
            System.out.println("- " + fruta);
        }
    }
}
