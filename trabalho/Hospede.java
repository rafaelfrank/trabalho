package trabalho;

public class Hospede {
    private String nome;
    private String endereco;
    private String documento;

    public Hospede(String nome, String endereco, String documento) {
        this.nome = nome;
        this.endereco = endereco;
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getDocumento() {
        return documento;
    }
}