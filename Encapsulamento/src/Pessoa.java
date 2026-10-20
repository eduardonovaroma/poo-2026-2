public class Pessoa {
    private String nome;
    private String cpf;

    public void setNome(String nome) {
        if (nome.length() > 10) {
            this.nome = nome;
        } else {
            System.out.println("Nome informado é inválido.");
        }
    }

    public void setCpf(String cpf) {
        if (Validacoes.isCPFValido(cpf)) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF informado é inválido.");
        }
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }
}
