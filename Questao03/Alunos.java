package Questao03;

public class Alunos {
    private String matricula;
    private String nome;
    private double n1, n2, notaTrab;

    public Alunos(String matricula, String nome, double n1, double n2, double notaTrab) {
        this.matricula = matricula;
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
        this.notaTrab = notaTrab;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getN1() {
        return n1;
    }
    public void setN1(double n1) {
        this.n1 = n1;
    }
    public double getN2() {
        return n2;
    }
    public void setN2(double n2) {
        this.n2 = n2;
    }
    public double getNotaTrab() {
        return notaTrab;
    }
    public void setNotaTrab(double notaTrab) {
        this.notaTrab = notaTrab;
    }

    public double media(){
        double notaProva = (n1 + n2) * 2.5 / 2;
        double notaTrabalho = notaTrab * 2.0;
        return (notaProva + notaTrabalho) / 4.5;
    }

    public double provaFinal(){
        
        double mediaFinal = media();
        double falta = media();
        double notaFinal;
        if( mediaFinal >= 7){
            System.out.println("Aprovado");
            return 0;
        } else if(mediaFinal < 7 && mediaFinal >= 3.5){
            System.out.println("Prova final");
            while(mediaFinal < 7){
            mediaFinal += 0.5;
            }
            notaFinal = mediaFinal - falta;
            System.out.println(notaFinal);
        } else{
            System.out.println("reprovado");
        }

        return mediaFinal;
    }
}
