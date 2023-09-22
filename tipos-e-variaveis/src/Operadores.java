public class Operadores {

    public static void main(String[] args) {
        
    String nomeCompleto = "LINGUAGEM " + "JAVA";
    System.out.println(nomeCompleto); 

    int numero = 5;
    numero = - numero;
    System.out.println(numero);

    numero = numero * -1;
    System.out.println(numero);

    // x repetição
    numero++; // numero +1
    System.out.println(numero);
    System.out.println(numero++); //imprimi primeiro, incrementa depois
    System.out.println(numero); //numero incrementado

    // negar expressões boleanas
    boolean variavel = true;
    variavel = !variavel;  //false
    System.out.println(variavel);

    // Operador Ternário
    int a, b;
    a = 5;
    b = 6;

    // String resultado = "";
    // if(a == b) 
    //     resultado = "verdadeiro";
    // else
    //     resultado = "false";

    String resultado = a==b ? "verdadeiro" : "falso"; //forma resumida, deve ser sempre usada para expressões boleanas
    // String resultado = a==b ? 1 : 2; 

    System.out.println(resultado);




    }
}
