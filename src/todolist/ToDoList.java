/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package todolist;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ToDoList {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] tarefas = new String[10];
        int total = 0;
        int opcao = 0;

        while (opcao != 5) {

            System.out.println("\n LISTA DE TAREFAS ");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Ver tarefas");
            System.out.println("3 - Concluir tarefa");
            System.out.println("4 - Excluir tarefa");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {

                if (total < 10) {
                    System.out.print("Digite a tarefa: ");
                    tarefas[total] = scanner.nextLine();
                    total++;

                    System.out.println("Tarefa adicionada!");
                } else {
                    System.out.println("Lista cheia!");
                }

            } else if (opcao == 2) {

                System.out.println("\n SUAS TAREFAS ");

                if (total == 0) {
                    System.out.println("Nenhuma tarefa.");
                } else {
                    for (int i = 0; i < total; i++) {
                        System.out.println((i + 1) + " - " + tarefas[i]);
                    }
                }

            } else if (opcao == 3) {

                System.out.print("Digite o número da tarefa concluída: ");
                int numero = scanner.nextInt();

                if (numero >= 1 && numero <= total) {
                    System.out.println("Tarefa concluída: " + tarefas[numero - 1]);
                } else {
                    System.out.println("Número inválido!");
                }

            } else if (opcao == 4) {

                System.out.print("Digite o número da tarefa para excluir: ");
                int numero = scanner.nextInt();

                if (numero >= 1 && numero <= total) {

                    for (int i = numero - 1; i < total - 1; i++) {
                        tarefas[i] = tarefas[i + 1];
                    }

                    total--;

                    System.out.println("Tarefa excluída!");

                } else {
                    System.out.println("Número inválido!");
                }

            } else if (opcao == 5) {

                System.out.println("Programa encerrado!");

            } else {

                System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
