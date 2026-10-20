import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Informe o CPF: ");
        String cpf = scanner.nextLine();
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setCpf(cpf);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("CPF: " + pessoa.getCpf());

        scanner.close();
    }
}
