public class Cliente {
    public String nome;
    public String celular;
    public int valor;

    public Cliente(String nome, String celular, int valor) {
        this.nome = nome;
        this.celular = celular;
        this.valor = valor;
    }

    public void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Celular: " + celular);
    }
}
