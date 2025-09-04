package trabalho;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private String nome;
    private List<Quarto> quartos;

    public Hotel(String nome) {
        this.nome = nome;
        this.quartos = new ArrayList<>();
    }

    public void adicionarQuarto(Quarto novoQuarto) {
        if (novoQuarto != null && !quartos.contains(novoQuarto)) {
            this.quartos.add(novoQuarto);
        }
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }

    public String getNome() {
        return nome;
    }
}