import services.FuncionarioService;

import java.util.Scanner;

public class Programa {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        FuncionarioService funcionarioService = new FuncionarioService();

        boolean execucao = true;

        while (execucao) {
            System.out.println("=== Manter funcionário ===");
            System.out.println();
            System.out.println("1. Salvar um novo funcionário");
            System.out.println("2. Atualizar dados de funcionário");
            System.out.println("3. Listar funcionários");
            System.out.println("4. Remover um funcionário");

            String opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    funcionarioService.save();
                    break;
                case "2":
                    funcionarioService.update();
                    break;
                case "3":
                    funcionarioService.getAll();
                    break;
                case "4":
                    funcionarioService.delete();
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
