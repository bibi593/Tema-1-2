import java.util.*;

public class Clasa {
    private int capacitate;
    private NumarClasa numar;
    private char litera;
    private List<Elev> elevi;

    public Clasa(int capacitate, NumarClasa numar, char litera) {
        this.capacitate = capacitate;
        this.numar = numar;
        this.litera = litera;
        elevi = new ArrayList<>();
    }

    public void adaugaElev(Elev elev) {
        if (elevi.size() < capacitate) {
            elevi.add(elev);
        }
    }

    public void eliminaElev(String nume) {
        elevi.removeIf(elev -> elev.getNume().equals(nume));
    }

    public int getTotalElevi() {
        return elevi.size();
    }
}