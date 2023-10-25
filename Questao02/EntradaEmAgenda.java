public class EntradaEmAgenda{

    private int hora;
    private int dia; 
    private int mes; 
    private int ano;
    private String assunto;

    public EntradaEmAgenda(int hora, int dia, int mes, int ano, String assunto){
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.assunto = assunto;
    }   

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String toString(){
        return ("hora: " + hora + " dia: " + dia + " mes: " + mes + " ano: " + ano + " assunto: " + assunto);
    }

    public Boolean ehNoDia(int dia, int mes, int ano){


        return this.dia == dia && this.mes == mes && this.ano == ano;
    }
}