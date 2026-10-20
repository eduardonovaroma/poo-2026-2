public class Validacoes {
    
    public static boolean isCPFValido(String cpf) {
        // Remove caracteres não numéricos
        if (cpf == null) return false;
        cpf = cpf.replaceAll("\\D", "");

        // O CPF deve ter exatamente 11 dígitos
        if (cpf.length() != 11) return false;

        // Elimina CPFs com todos os dígitos iguais (ex: 000.000.000-00)
        if (cpf.matches("(\\d)\\1{10}")) return false;

        try {
            // Cálculo do primeiro dígito verificador
            int soma = 0;
            int peso = 10;
            for (int i = 0; i < 9; i++) {
                int num = Character.getNumericValue(cpf.charAt(i));
                soma += (num * peso);
                peso--;
            }

            int r = 11 - (soma % 11);
            char digito1 = (r == 10 || r == 11) ? '0' : Character.forDigit(r, 10);

            // Cálculo do segundo dígito verificador
            soma = 0;
            peso = 11;
            for (int i = 0; i < 10; i++) {
                int num = Character.getNumericValue(cpf.charAt(i));
                soma += (num * peso);
                peso--;
            }

            r = 11 - (soma % 11);
            char digito2 = (r == 10 || r == 11) ? '0' : Character.forDigit(r, 10);

            // Verifica se os dígitos calculados correspondem aos dígitos do CPF
            return (digito1 == cpf.charAt(9)) && (digito2 == cpf.charAt(10));

        } catch (Exception e) {
            return false;
        }
    }

}
