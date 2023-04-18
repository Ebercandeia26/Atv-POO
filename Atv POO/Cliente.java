import java.util.ArrayList;

public class Cliente {

    private String nome;
    private String cpf;
    private Endereco endereco;
    private ArrayList<Telefone> telefones;
    private ArrayList<Conta> contas;

    public Cliente(String nome, String cpf, Endereco endereco, ArrayList<Telefone> telefones, ArrayList<Conta> contas) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefones = telefones;
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nCPF: " + cpf + "\nEndereço: " + endereco + "\nTelefones: " + telefones + "\nContas: " + contas;
    }
}
