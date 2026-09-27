package br.com.joaocarloslima;

public class Celeiro {
    private int capacidade = 30;
    private int qtdeBatatas = 5;
    private int qtdeCenouras = 2;
    private int qtdeMorangos = 10;

    public void armazenarBatata() {
        if (getOcupacaoTotal() + 2 <= capacidade) {
            qtdeBatatas += 2;
        } else if (getOcupacaoTotal() < capacidade) {
            qtdeBatatas += (capacidade - getOcupacaoTotal());
        }
    }

    public void armazenarCenoura() {
        if (getOcupacaoTotal() + 2 <= capacidade) {
            qtdeCenouras += 2;
        } else if (getOcupacaoTotal() < capacidade) {
            qtdeCenouras += (capacidade - getOcupacaoTotal());
        }
    }

    public void armazenarMorango() {
        if (getOcupacaoTotal() + 2 <= capacidade) {
            qtdeMorangos += 2;
        } else if (getOcupacaoTotal() < capacidade) {
            qtdeMorangos += (capacidade - getOcupacaoTotal());
        }
    }

    public void consumirBatata() {
        if (qtdeBatatas > 0) {
            qtdeBatatas--;
        }
    }

    public void consumirCenoura() {
        if (qtdeCenouras > 0) {
            qtdeCenouras--;
        }
    }

    public void consumirMorango() {
        if (qtdeMorangos > 0) {
            qtdeMorangos--;
        }
    }

    public int getEspacoDisponivel() {
        int espaco = capacidade - getOcupacaoTotal();
        return Math.max(0, espaco);
    }

    public int getOcupacao() {
        int porcentagem = (getOcupacaoTotal() * 100) / capacidade;
        return Math.min(100, Math.max(0, porcentagem));
    }

    public boolean celeiroCheio() {
        return getOcupacaoTotal() >= capacidade;
    }

    private int getOcupacaoTotal() {
        return qtdeBatatas + qtdeCenouras + qtdeMorangos;
    }

    public int getCapacidade() {
        return capacidade;
    }
    public int getQtdeBatatas() {
        return qtdeBatatas;
    }
    public int getQtdeCenouras() {
        return qtdeCenouras;
    }
    public int getQtdeMorangos() {
        return qtdeMorangos;
    }
}