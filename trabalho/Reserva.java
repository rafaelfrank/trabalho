package trabalho;

import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private String dataEntrada;
    private String dataSaida;
    private String estado;
    private Quarto quarto;
    private List<Hospede> hospedes;
    private Veiculo veiculo;

    //construtor 
    public Reserva(String dataEntrada, String dataSaida, Quarto quarto, Veiculo veiculo) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.quarto = quarto;
        this.hospedes = new ArrayList<>();
        this.estado = "pendente"; //ao criar a reserva, o estado é pendente
        this.veiculo = veiculo;
    }

    //iniciar lista
    public Reserva(String dataEntrada, String dataSaida, Quarto quarto) {
        this(dataEntrada, dataSaida, quarto, null);
    }

    //metodos get e set
    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getEstado() {
        return estado;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public List<Hospede> getHospedes() {
        return hospedes;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void checkin(List<Hospede> novosHospedes) {
        //verifica se a lista está vazia (nula) e adiciona hospedes
        for (Hospede h : novosHospedes) {
            if (h != null && !this.hospedes.contains(h)) {
                this.hospedes.add(h);
            }
        }
        this.estado = "confirmada"; //apos adicionar, muda o status para confirmado
        System.out.println("checkin realizado com sucesso para o quarto: " + this.quarto.getNumeroQuarto());
    }

    public void checkout() { 
        this.estado = "finalizada";
        System.out.println("checkout realizado com sucesso.");
    }

    public void cancelar() {
        this.estado = "cancelada";
        System.out.println("Reserva cancelada com sucesso.");
    }
}