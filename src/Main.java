public class Main {
    public static void main(String[] args) {
        Choroba katar = new Choroba("katar");
        Choroba alkoholizm = new Choroba("alkoholizm");

        Lekarz halina = new Lekarz("Halina", "Kiepska");
        Lekarz grazynka = new Lekarz("Grażyna", "Kozłowska");

        Pacjent ferdek = new Pacjent("Ferdynand", "Kiepski");
        Pacjent grubas = new Pacjent("Arnold", "Boczek");
        Pacjent menda = new Pacjent("Marian", "Paździoch");

        halina.dodajPacjenta(ferdek);
        grazynka.dodajPacjenta(menda);

        System.out.println(ferdek);
    }
}