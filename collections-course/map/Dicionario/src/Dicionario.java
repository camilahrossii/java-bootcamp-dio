import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if(!dicionario.isEmpty()) {
            dicionario.remove(palavra);
        } else {
            System.out.println("O dicionário está vazio!");
        }
    }

    public void exibirPalavras() {
        if(!dicionario.isEmpty()){
            System.out.println(dicionario);
        } else {
            System.out.println("O dicionário está vazio!");
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicao = dicionario.get(palavra);
        if(definicao != null) {
            return definicao;
        }
        return "Linguagem de definição não encontrada em dicionário!";
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Palavra 1", "Difinição 1");
        dicionario.adicionarPalavra("Palavra 2", "Definição 2");
        dicionario.adicionarPalavra("Palavra 3", "Definição 1");
        dicionario.adicionarPalavra("Palavra 4", "Definição 4");
        dicionario.adicionarPalavra("Palavra 1", "Definição 5");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("Palavra 1");

        dicionario.exibirPalavras();

        System.out.println("A definição é: " + dicionario.pesquisarPorPalavra("Palavra 2"));

    }
}
