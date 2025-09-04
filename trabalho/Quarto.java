package trabalho;

public class Quarto {
    private int numero;
    private int andar;

    public Quarto(int numero, int andar) {
        this.andar = andar;
        this.numero = numero;
    }

    public int getNumeroQuarto() {
        return this.numero;
    }

    public int getAndarQuarto() {
        return this.andar;
    }
}