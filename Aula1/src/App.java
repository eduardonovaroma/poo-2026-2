public class App {
    public static void main() {
        // Pessoa pessoa1 = new Pessoa("João", 30, 1.82, 78.0);
        Pessoa pessoa1 = new Pessoa("João", 30);
        pessoa1.peso = 79;
        pessoa1.altura = 1.82;

        pessoa1.exibirInformacoes();
        // System.out.println("IMC: " + pessoa1.calcularIMC());

    }
}
