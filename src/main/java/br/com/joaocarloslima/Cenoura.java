package br.com.joaocarloslima;

public class Cenoura {
    private int tamanho = 1;
    private int tempoDeVida = 0;
    private int tempoDeCrescimento = 3;

    public void crescer() {
        tempoDeVida++;
        if (tempoDeVida >= tempoDeCrescimento && tamanho < 4) {
            tamanho++;
            tempoDeVida = 0;
        }
    }

    public boolean podeColher() {
        return tamanho == 4;
    }

    public String getImagem() {
        return "images/cenoura" + tamanho + ".png";
    }

    public int getTamanho() {
        return tamanho;
    }
    public int getTempoDeVida() {
        return tempoDeVida;
    }
    public int getTempoDeCrescimento() {
        return tempoDeCrescimento;
    }
}