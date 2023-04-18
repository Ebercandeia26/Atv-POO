import java.util.Scanner;

public class Banco {
    
    public static void main(String[] args) {
        Registro registro = new Registro();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n===== BANCO =====");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Listar clientes");
            System.out.println("3 - Excluir cliente");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    registro.cadastrarCliente();
                    break;
                case 2:
                    registro.listarClientes();
                    break;
                case 3:
                    registro.excluirCliente();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("ERRO: Opção inválida.");
                    break;
            }
        }
    }
}
