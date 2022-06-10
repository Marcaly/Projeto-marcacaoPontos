package services;

import model.Funcionario;
import repositories.FuncionarioRepository;

import java.io.IOException;
import java.util.Scanner;

public class FuncionarioService {

    static Scanner scanner;
    static FuncionarioRepository funcionarioRepository;

    public FuncionarioService() throws IOException {
        scanner = new Scanner(System.in);
        funcionarioRepository = new FuncionarioRepository();
    }

    public void salvarInformacoes() {
        System.out.println("Método save");
        Funcionario funcionario = new Funcionario();

        System.out.println("Escreva o nome do funcionário:");
        funcionario.setNome(scanner.nextLine());

        funcionarioRepository.save(funcionario);
    }

    public void editarInformacoes() {
        System.out.println("Método update");
    }

    public void mostrarInformacoes() {
        System.out.println("Método getAll");
    }

    public void deletar() {
        System.out.println("Método delete");
    }
}
