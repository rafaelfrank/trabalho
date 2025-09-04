package trabalho;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private String nome;
    private double salario;
    private List<Cargo> cargos = new ArrayList<>();

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void mudarSalario(double novo) {
        this.salario = novo;
    }

    public void adicionarCargo(Cargo c) {
        if (c != null && !cargos.contains(c)) {
            cargos.add(c);
        }
    }

    public List<Cargo> getCargos() {
        return cargos;
    }
}