import java.util.ArrayList;

public class Lekarz {
    private String imie;
    private String nazwisko;
    private ArrayList<Pacjent> leczeniPacjeci = new ArrayList<>();

    public Lekarz(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public ArrayList<Pacjent> getLeczeniPacjeci() {
        return leczeniPacjeci;
    }
    public void dodaj(Pacjent pacjent){
        leczeniPacjeci.add(pacjent);
    }
}
