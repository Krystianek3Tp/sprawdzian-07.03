import java.util.Objects;

public class Choroba {
    private String nazwaChoroby;
    private int smiertelnosc;

    public Choroba(String nazwaChoroby) {
        this.nazwaChoroby = nazwaChoroby;
    }

    public Choroba() {
    }

    public String getNazwaChoroby() {
        return nazwaChoroby;
    }

    public int getSmiertelnosc() {
        return smiertelnosc;
    }

    public void setNazwaChoroby(String nazwaChoroby) {
        this.nazwaChoroby = nazwaChoroby;
    }

    public void setSmiertelnosc(int smiertelnosc) {
        this.smiertelnosc = smiertelnosc;
    }

    @Override
    public String toString() {
        return nazwaChoroby + "-" + smiertelnosc ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Choroba choroba = (Choroba) o;
        return smiertelnosc == choroba.smiertelnosc && Objects.equals(nazwaChoroby, choroba.nazwaChoroby);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwaChoroby, smiertelnosc);
    }
}
