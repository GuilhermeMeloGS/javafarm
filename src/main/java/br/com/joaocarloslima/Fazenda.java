package br.com.joaocarloslima;

import java.util.ArrayList;
import java.util.List;

public class Fazenda {

    private static List<Terreno> terrenos = new ArrayList<>();
    private static Celeiro celeiro = new Celeiro();

    static {
        for (int x = 0; x < 13; x++) {
            for (int y = 0; y < 13; y++) {
                terrenos.add(new Terreno(x, y));
            }
        }
    }

    public static Celeiro getCeleiro() {
        return celeiro;
    }

    public static Terreno getTerreno(int x, int y) {
        for (Terreno t : terrenos) {
            if (t.getX() == x && t.getY() == y) {
                return t;
            }
        }
        return null;
    }

    public static void plantarBatata(int x, int y) {
        Terreno t = getTerreno(x, y);
        if (t == null || t.estaOcupado()) return;
        celeiro.consumirBatata();
        t.plantar(new Batata());
    }

    public static void plantarCenoura(int x, int y) {
        Terreno t = getTerreno(x, y);
        if (t == null || t.estaOcupado()) return;
        celeiro.consumirCenoura();
        t.plantar(new Cenoura());
    }

    public static void plantarMorango(int x, int y) {
        Terreno t = getTerreno(x, y);
        if (t == null || t.estaOcupado()) return;
        celeiro.consumirMorango();
        t.plantar(new Morango());
    }

    public static void colher(int x, int y) {
        Terreno t = getTerreno(x, y);
        if (t != null) {
            t.colher(celeiro);
        }
    }
}