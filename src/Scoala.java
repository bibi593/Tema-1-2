import java.util.*;

public class Scoala {
    private Map<String, Clasa> clase;

    public Scoala() {
        clase = new HashMap<>();
    }

    public void adaugaClasa(String id, Clasa clasa) {
        clase.put(id, clasa);
    }

    public void eliminaClasa(String id) {
        clase.remove(id);
    }

    public void adaugaElevInClasa(String id, Elev elev) {
        if (clase.containsKey(id)) {
            clase.get(id).adaugaElev(elev);
        }
    }

    public void eliminaElevDupaNume(String nume) {
        for (Clasa clasa : clase.values()) {
            clasa.eliminaElev(nume);
        }
    }

    public int getNumarClase() {
        return clase.size();
    }

    public int getTotalElevi() {
        int total = 0;
        for (Clasa clasa : clase.values()) {
            total += clasa.getTotalElevi();
        }
        return total;
    }
}