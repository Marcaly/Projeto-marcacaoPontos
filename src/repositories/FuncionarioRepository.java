package repositories;

import model.Funcionario;

import java.io.*;

public class FuncionarioRepository {

    static File arquivo;

    public FuncionarioRepository() throws IOException {
        File diretorio = new File("C:\\Users\\gabri\\Projetos\\Projeto-marcacaoPontos\\src\\repositories\\diretorio");
        if (!diretorio.exists()) {

            diretorio.mkdir();
        }
        arquivo = new File(diretorio + "\\arquivo.txt");
        if (!arquivo.exists()) {

            arquivo.createNewFile();
        }
    }

    public void save(Funcionario funcionario) {

        try (FileWriter fw = new FileWriter(arquivo, true);
             BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write(funcionario.toString());
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void update(Funcionario funcionario) {

    }

    public void getAll() throws IOException {
        FileReader fileReader = new FileReader(arquivo);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String linha;
        while ((linha = bufferedReader.readLine()) != null) {
            System.out.println(linha);
        }
    }

    public void delete(Funcionario funcionario) {

    }
}
