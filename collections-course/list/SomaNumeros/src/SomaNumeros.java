import java.util.ArrayList;
import java.util.List;
import java.lang.RuntimeException;

public class SomaNumeros {
    private List<Integer> numerosLista;

    public SomaNumeros() {
        this.numerosLista = new ArrayList<>();
    } 

    public void adicionarNumero(int numero) {
        numerosLista.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for(Integer numero: numerosLista) {
            soma += numero;            
        } return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if(!numerosLista.isEmpty()){
            for(Integer numero: numerosLista){
                if(numero >= maiorNumero){
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A Lista está vazia!");
        }
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if(!numerosLista.isEmpty()){
            for(Integer numero: numerosLista) {
                if(numero <= menorNumero){
                    menorNumero = numero;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A Lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if(!numerosLista.isEmpty()){
            System.out.println(this.numerosLista);
        } else {
            System.out.println("A Lista está vazia!");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(12);
        somaNumeros.adicionarNumero(8);

        System.out.println("Números Adicionados:");
        somaNumeros.exibirNumeros();

        System.out.println("Soma dos números=" + somaNumeros.calcularSoma());

        System.out.println("Maior número=" + somaNumeros.encontrarMaiorNumero());

        System.out.println("Menor número=" + somaNumeros.encontrarMenorNumero());
    }

}
