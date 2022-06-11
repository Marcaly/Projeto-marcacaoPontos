package services;

import model.Funcionario;
import repositories.FuncionarioRepository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FuncionarioService {

    static Scanner scanner;
    static FuncionarioRepository funcionarioRepository;
    static FileReader fileReader;
    static BufferedReader bufferedReader;

    public FuncionarioService() throws IOException {
        scanner = new Scanner(System.in);
        funcionarioRepository = new FuncionarioRepository();
    }

    public void salvarInformacoes() {
        System.out.println("Método save");
        Funcionario funcionario = new Funcionario();

        boolean salvarInforacoes = true;
        while (salvarInforacoes) {

            System.out.println("Digite as informações do funcionário:");

            System.out.println("Nome completo:");
            funcionario.setNome(scanner.nextLine());

            System.out.println("CPF:");
            funcionario.setCpf(scanner.nextLine());

            System.out.println("Data de nascimento:");
            funcionario.setDataNascimento(scanner.nextLine());

            System.out.println("Endereço:");
            funcionario.setEndereco(scanner.nextLine());

            System.out.println("DDD");
            funcionario.setDdd(scanner.nextLine());

            System.out.println("Nº de celular");
            funcionario.setCelular(scanner.nextLine());

            salvarInforacoes = false;
        }
        funcionarioRepository.save(funcionario);
    }

    public void editarInformacoes() {
        System.out.println("Método update");

        System.out.println("Digite o Nº de identificação do funcionário:");

    }

    public void mostrarInformacoes() throws IOException {
        System.out.println("Método getAll");

        boolean mostrarInformacoes = true;
        while (mostrarInformacoes) {
            funcionarioRepository.getAll();

            System.out.println("1. Voltar para o Menu principal");
            String opcao = scanner.nextLine();

            if (opcao.equals("1"))
                mostrarInformacoes = false;
            else
                System.out.println("Opção inválida");
        }
    }

    public void deletar() {
        System.out.println("Método delete");
    }
}
