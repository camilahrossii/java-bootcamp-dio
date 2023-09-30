import java.util.ArrayList;
import java.util.List;
import java.lang.RuntimeException;

public class CarrinhoDeCompras {
    private List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.listaItens.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if(!listaItens.isEmpty()){
            for(Item item : listaItens) {
                if(item.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(item);
                }
            }
            listaItens.removeAll(itensParaRemover);       

        } else {
            System.out.println("A Lista está vazia!");
        }
        
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if(!listaItens.isEmpty()) {
            for(Item item: listaItens) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A Lista está vazia!");
        }
    }

    public void exibirItens() {
        if(!listaItens.isEmpty()) {
            System.out.println(this.listaItens);
        } else {
            System.out.println("A Lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{ " +
                "itens = " +listaItens +
                "}";
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 45d, 2);
        carrinhoDeCompras.adicionarItem("Caneta", 3d, 2);
        carrinhoDeCompras.adicionarItem("Estojo", 25d, 1);

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Estojo");

        carrinhoDeCompras.exibirItens();

        System.out.println("Valor Total da Compra: R$" + carrinhoDeCompras.calcularValorTotal());
    }
}

