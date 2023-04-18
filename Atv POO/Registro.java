import java.util.ArrayList;
import java.util.Scanner;

public class Registro {
    
    private ArrayList<Cliente> clientes;
    
    public Registro() {
        this.clientes = new ArrayList<Cliente>();
    }
    
    public void cadastrarCliente() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n===== CADASTRO DE CLIENTE =====");
        
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        
        // Verifica se o CPF já está cadastrado
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                System.out.println("ERRO: CPF já cadastrado.");
                return;
            }
        }
        
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("CEP: ");
        String cep = scanner.nextLine();
        
        System.out.print("Logradouro: ");
        String logradouro = scanner.nextLine();
        
        System.out.print("Número: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Telefone: ");
        String telefoneStr = scanner.nextLine();
            
        
        Endereco endereco = new Endereco(cep, logradouro, numero);
        
        ArrayList<Telefone> telefones = new ArrayList<Telefone>();
        
        while (true) {
            System.out.print("Digite (fim) para parar");
            String opcao = scanner.nextLine();


            
            if (opcao.equalsIgnoreCase("fim")) {
                break;
            }
            
            String[] telefoneParts = opcao.split(" ");
            
            if (telefoneParts.length != 2) {
                System.out.println("ERRO: Formato de telefone inválido.");
                continue;
            }
            
            String ddd = telefoneParts[0];
            String numeroTelefone = telefoneParts[1];
            
            Telefone telefone = new Telefone(ddd, numeroTelefone);
            telefones.add(telefone);
        }
        
        ArrayList<Conta> contas = new ArrayList<Conta>();
        
        while (true) {
            System.out.print("Número da conta (Digite 'fim' para encerrar): ");
            String numeroConta = scanner.nextLine();
            
            if (numeroConta.equalsIgnoreCase("fim")) {
                break;
            }
            
            System.out.print("Agência: ");
            String agencia = scanner.nextLine();

    
            Conta conta = new Conta(numeroConta, agencia);
            contas.add(conta);
        }
        
        Cliente cliente = new Cliente(nome, cpf, endereco, telefones, contas);
        clientes.add(cliente);
        
        System.out.println("Cliente cadastrado com sucesso!");
    }
    
    public void listarClientes() {
        System.out.println("\n===== LISTA DE CLIENTES =====");
        
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
    
    public void excluirCliente() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n===== EXCLUSÃO DE CLIENTE =====");
        
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                clientes.remove(cliente);
                System.out.println("Cliente excluído com sucesso!");
                return;
            }
        }
        
        System.out.println("ERRO: Cliente não encontrado.");
    }
}

