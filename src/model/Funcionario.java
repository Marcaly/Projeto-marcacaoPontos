package model;

import java.util.Date;

public class Funcionario {

    private String nome;
    private String cpf;
    private String dataNascimento;
    private String rg;
    private String endereco;
    private String ddd;
    private String celular;



    public Funcionario(String nome, String cpf, String dataNascimento, String rg, String endereco, String ddd, String celular) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.endereco = endereco;
        this.ddd = ddd;
        this.celular = celular;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }


    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Nome do funcionário = " + nome +
                ", Cpf = " + cpf +
                ", Data de nascimento = " + dataNascimento +
                ", RG = " + rg +
                ", Endereco = " + endereco +
                ", DDD = " + ddd +
                ", Celular = " + celular;

    }
}
