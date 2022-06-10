package repositories;

import model.Funcionario;

import java.io.*;


public class LeituraEscritaArquivo {
    public static void main(String[] args) throws IOException {

        File fileDiretorio = new File("C:\\Users\\gabri\\Projetos\\Projeto-marcacaoPontos\\src\\repositories\\diretorio");
        File arquivo = new File(fileDiretorio + "\\arquivo.txt");

        if (!fileDiretorio.exists()) {
            fileDiretorio.mkdir();
        }

        if (!arquivo.exists()) {

            arquivo.createNewFile();
        }

        Funcionario funcionario = new Funcionario("Joesley","15662595678");

        try (FileWriter fw = new FileWriter(arquivo);
             BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write(funcionario.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader(arquivo); BufferedReader br = new BufferedReader(fr)){
            String linha;
            while((linha = br.readLine())!= null) {
                System.out.println(linha);
            }
        }
    }
}
