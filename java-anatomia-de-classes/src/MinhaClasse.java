public class MinhaClasse {

public static void main (String [] args) {
    String primeiroNome = "Camila";
    String segundoNome = "Rossi";

    String nomeCompleto = nomeCompleto (primeiroNome,segundoNome); // primero:variavel, segundo:método(tem parâmetros)
    System.out.println(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
}

}