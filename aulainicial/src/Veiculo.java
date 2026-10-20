public class Veiculo {
    public String marca;
    public int ano;

    public static void main(String[] args) {
        Veiculo corola = new Veiculo();
        corola.marca = args[0];
        corola.ano = Integer.parseInt(args[1]);

        System.out.println("Marca do carro: " + corola.marca);
        System.out.println("Ano do carro: " + corola.ano);
    }
}
