import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutos;

    public EstoqueProdutos() {
        this.estoqueProdutos = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutos.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutos);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if(!estoqueProdutos.isEmpty()){
            for(Produto p : estoqueProdutos.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        } else {
            System.out.println("O estoque está vazio!");
        } 
        return valorTotalEstoque;
    } 

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutos.isEmpty()){
            for(Produto p: estoqueProdutos.values()){
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        } else {
            System.out.println("O estoque está vazio!");
        } 
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!estoqueProdutos.isEmpty()){
            for(Produto p: estoqueProdutos.values()) {
                if(p.getPreco() < menorPreco) {
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }else {
            System.out.println("O estoque está vazio!");
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorTotalNoEstoque = null;
        double maiorQuantidadeValorTotalNoEstoque = 0d;
        if(!estoqueProdutos.isEmpty()) {
            for(Map.Entry<Long, Produto> entry : estoqueProdutos.entrySet()) {
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if(valorProdutoEmEstoque > maiorQuantidadeValorTotalNoEstoque) {
                    maiorQuantidadeValorTotalNoEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorTotalNoEstoque = entry.getValue();
                }
            }
        }else {
            System.out.println("O estoque está vazio!");
        }
        return produtoMaiorQuantidadeValorTotalNoEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1L, "Produto A", 10, 5.0);
        estoqueProdutos.adicionarProduto(2L, "Produto B", 5, 10.0);
        estoqueProdutos.adicionarProduto(3L, "Produto C", 2, 15.0);
        estoqueProdutos.adicionarProduto(4L, "Produto C", 2, 25.0);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do estoque: R$" + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais barato: " + estoqueProdutos.obterProdutoMaisBarato());        
        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("Produto com maior quantidade em estoque:" + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());        
    }
}
