package net.weg.gerenciamentoDeFuncionarios.service;

import net.weg.gerenciamentoDeFuncionarios.model.Funcionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceGerenciador {

    private List<Funcionario> funcionarios = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public void cadastrarFuncionario() {
        System.out.print("Insira o nome do Funcionário: ");
        String nome = input.nextLine();
        Funcionario funcionario = new Funcionario(nome);
        funcionarios.add(funcionario);
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    public void deletarFuncionario() {
        System.out.print("Insira o nome do Funcionário para deletar: ");
        String nome = input.nextLine();
        boolean removido = funcionarios.removeIf(f -> f.getNome().equalsIgnoreCase(nome));
        if (removido) {
            System.out.println("Funcionário deletado com sucesso!");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    public void pesquisarFuncionario() {
        System.out.print("Insira o nome do Funcionário para pesquisar: ");
        String nome = input.nextLine();

        for (Funcionario f : funcionarios) {
            if (f.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Funcionário encontrado: " + f.getNome());
                return;
            }
        }
        System.out.println("Funcionário não encontrado.");
    }

    public void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            System.out.println("Lista de Funcionários:");
            for (Funcionario f : funcionarios) {
                System.out.println("- " + f.getNome());
            }
        }
    }
}
