public class NomeCompleto {
    public static void main(String[] args) {
        String nome = "Jr";
        String sobrenome = "Gouveia";

        String nomeCompleto = nomeCompleto(nome, sobrenome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String nome, String sobrenome) {
        return"Resultado: " + nome.concat(" ").concat(sobrenome)+ ".";
    }
}

 