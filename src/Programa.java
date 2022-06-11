import services.FuncionarioService;

import java.io.IOException;
import java.util.Scanner;

public class Programa {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        FuncionarioService funcionarioService = new FuncionarioService();

        boolean execucao = true;

        while (execucao) {
            System.out.println("=== Manter funcionário ===");
            System.out.println();
            System.out.println("1. Salvar um novo funcionário");
            System.out.println("2. Atualizar dados de funcionário");
            System.out.println("3. Listar funcionários");
            System.out.println("4. Remover um funcionário");
            System.out.println("5. Sair do programa");

            String opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    funcionarioService.salvarInformacoes();
                    break;
                case "2":
                    funcionarioService.editarInformacoes();
                    break;
                case "3":
                    funcionarioService.mostrarInformacoes();
                    break;
                case "4":
                    funcionarioService.deletar();
                    break;
                case "5":
                    execucao = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
