public class Executavel {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.adicionarCompromisso(new EntradaEmAgenda(12, 11, 06, 2008, "1efect"));
        agenda.adicionarCompromisso(new EntradaEmAgenda(12, 20, 02, 2017, "2efect"));
        agenda.adicionarCompromisso(new EntradaEmAgenda(12, 26, 12, 2019, "3efect"));
        agenda.adicionarCompromisso(new EntradaEmAgenda(12, 29, 01, 2020, "4efect"));
        agenda.adicionarCompromisso(new EntradaEmAgenda(11, 11, 06, 2000, "5efect"));

        agenda.listaDia(11, 06, 2000);
    }
}