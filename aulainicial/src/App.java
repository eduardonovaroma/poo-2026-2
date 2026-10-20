import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        
        
        Veiculo corola = new Veiculo();
        corola.marca = "Toyota";
        corola.ano = 2020;

        Veiculo civic = new Veiculo();
        civic.marca = "Honda";
        civic.ano = 2021;
        
        System.out.println("Marca do carro: " + corola.marca);
        System.out.println("Ano do carro: " + corola.ano);

        System.out.println("Marca do carro 2: " + civic.marca);
        System.out.println("Ano do carro 2: " + civic.ano);

        String nome;
        int idade;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();

        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");

        scanner.close();
    }
}
