package Questao03;

public class TesteAlunos {
    public static void main(String[] args) {
        Alunos alunos = new Alunos("2020011045", "BRUNO", 7.0, 1.0, 7.0);

        System.out.println(alunos.media());
        alunos.provaFinal();
    }
}
