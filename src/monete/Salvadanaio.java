package monete;

import java.util.ArrayList;
import java.util.List;

public class Salvadanaio implements CanSalvadanaio {
	private List<Moneta> monete;

    public Salvadanaio() {
        monete = new ArrayList<>();
    }

    public void addMoneta(Moneta moneta) {
        monete.add(moneta);
    }

    public int conteggio(Moneta moneta) {
        int count = 0;
        for (Moneta m : monete) {
            if (m.equals(moneta)) {
                count++;
            }
        }
        return count;
    }

    public double getTotal() {
        double total = 0;
        for (Moneta m : monete) {
            total += m.getValore();
        }
        return total;
    }

    public boolean remove(Moneta moneta) {
        return monete.remove(moneta);
    }

    public int findMoneta(Moneta moneta) {
        for (int i = 0; i < monete.size(); i++) {
            if (monete.get(i).equals(moneta)) {
                return i;
            }
        }
        return -1;
    }
}


