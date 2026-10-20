public class Gato {
    // Atributos
    public String raca;
    public String nome;
    public float peso;
    public int idade;

    // Métodos
    public void fazerSom() {
        System.out.println("Miau!");
    }

    public void comer(String comida, double quantidade) {
        System.out.println(nome + " está comendo " + comida + " em quantidade de " + quantidade);
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Peso: " + peso);
        System.out.println("Idade: " + idade);
    }
}
