public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"FELIPE", "ANA", "MARCOS", "JULIA"};

        for (int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no índice x = " + (x+1) + " é " + alunos[x]);
        }

        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}