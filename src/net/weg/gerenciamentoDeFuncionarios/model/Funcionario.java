package net.weg.gerenciamentoDeFuncionarios.model;

public class Funcionario {

    static int idFuncionario;
    int codFuncionario = 1;
    private String nome;
    private int id;

    public Funcionario(String nome){

        this.nome = nome;
        idFuncionario = codFuncionario;

        codFuncionario++;

    }

    public void setNome(String nome){ this.nome = nome; }

    public String getNome(){ return nome; }

    public void setId(int id){ this.id = id; }

    public int getId(){ return id; }

}
