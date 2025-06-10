package net.weg.gerenciamentoDeFuncionarios.main;

import net.weg.gerenciamentoDeFuncionarios.service.ServiceGerenciador;
import net.weg.gerenciamentoDeFuncionarios.view.ViewGerenciador;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ServiceGerenciador service = new ServiceGerenciador();
        ViewGerenciador view = new ViewGerenciador();
        Scanner input = new Scanner(System.in);

        boolean running = true;

        while (running) {
            view.interacao();

            int escolha = -1;
            try {
                escolha = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira um número válido.");
                continue;
            }

            switch (escolha) {
                case 1:
                    service.cadastrarFuncionario();
                    break;
                case 2:
                    service.deletarFuncionario();
                    break;
                case 3:
                    service.pesquisarFuncionario();
                    break;
                case 4:
                    service.listarFuncionarios();
                    break;
                case 6:
                    System.out.println("Saindo do sistema... Até logo!");
                    running = false;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

            System.out.println();
        }

        input.close();
    }
}
