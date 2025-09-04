package trabalho;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        Hotel hotel = new Hotel("Hotel do Theo"); //criando primeiro hotel

        //definindo quartos
        Quarto q101 = new Quarto(101, 1); 
        Quarto q102 = new Quarto(102, 1);
        hotel.adicionarQuarto(q101);
        hotel.adicionarQuarto(q102);
        //criando hospedes
        Hospede h1 = new Hospede("Rafael", "Rua sao joao batista", "093.319.539-76");
        Hospede h2 = new Hospede("Rafaela", "Rua sra maria batista", "935.913.390-67");
        //criando reserva
        Reserva r1 = new Reserva("01/10/2025", "05/10/2025", q101);
        System.out.println("Estado da reserva: " + r1.getEstado() + " | Hóspedes: " + r1.getHospedes().size()); //imprimindo hospedes e estado da reserva
        
        //exibindo hotel e quartos
        System.out.println("Hotel: " + hotel.getNome() + " | Qtde quartos: " + hotel.getQuartos().size()); 
        
        //criando veiculo
        Veiculo v1 = new Veiculo("ARM8F87", "ret");
        System.out.println("Veículo: " + (v1.getModelo() + v1.getPlaca())); //exibindo veiculo



        //fazendo checkin
        r1.checkin(Arrays.asList(h1, h2));
        System.out.println("Estado da reserva alterado!: " + r1.getEstado() + " | Hóspedes: " + r1.getHospedes().size());

        //fazendo checkout
        r1.checkout();
        System.out.println("Estado da reserva alterado novamente!: " + r1.getEstado() + " | Hóspedes: " + r1.getHospedes().size());

        //definindo funcionario e cargo
        Funcionario f = new Funcionario("Josefina", 1.200);
        f.adicionarCargo(new Cargo("Recepcionista"));
        //imprimindo funcionario e cargos
        System.out.println("Funcionário: " + f.getNome() + " | Cargos: " + f.getCargos().size());
    }
}