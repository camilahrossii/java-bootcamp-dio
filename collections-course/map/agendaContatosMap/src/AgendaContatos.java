import java.util.Map;
import java.util.HashMap;

public class AgendaContatos {
    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatosMap.isEmpty()) {
            agendaContatosMap.remove(nome);
        } else {
            System.out.println("A Agenda está vazia!");
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatosMap.isEmpty()) {
            numeroPorNome = agendaContatosMap.get(nome);
        } else {
            System.out.println("A Agenda está vazia!");
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila", 219595635);
        agendaContatos.adicionarContato("Camila", 319876413);
        agendaContatos.adicionarContato("Maria", 412563589);
        agendaContatos.adicionarContato("João", 1198756872);
        agendaContatos.adicionarContato("Ana Maria", 442135946);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Maria");

        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Ana Maria"));
    }
}
