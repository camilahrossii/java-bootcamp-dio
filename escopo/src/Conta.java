public class Conta {
    // variavel da classe conta
    double saldo = 10.0;

    public void sacar(Double valor){
        //variável local do método
        double novoSaldo = saldo - valor;
    }

    public void imprimirSaldo(){
        // disponível em toda classe
        System.out.println(saldo);
        //somente o método sacar conhece essa variável
        System.out.println(novoSaldo);
    }

    public double calcularDividaExponencial() {
        // variável local de método
        double valorParcela = 50.0;
        double valorMontante = 0.0; 
        //FOR - controle de fluxo
        for(int x = 1; x <= 5; x++){// x variável de escopo de bloco
            // esta variável será reiniciada a cada execução
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
        } 
        //escopo de fluxo
        // a unica variavel que vai estar disponivel é valorMontante para prosseguir o nosso bloco
        // x e valorCalculado nunca estarão disponíveis fora desse bloco

        return valorMontante;
    }
}
