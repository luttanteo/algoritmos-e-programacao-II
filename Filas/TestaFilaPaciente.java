package fila;

import java.util.Scanner;

public class TestaFilaPaciente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        FilaPaciente fila = new FilaPaciente(5);
        do {
            System.out.println("--- MENU ---\r\n" + "1. Adicionar paciente\r\n" + "2. Atender paciente\r\n"
                    + "3. Mostrar fila\r\n" + "4. Consultar próximo paciente\r\n" + "5. Consultar tamanho da fila\r\n"
                    + "6. Redefinir tamanho da fila\r\n" + "7. Sair");
            opcao = sc.nextInt();
            try {
                switch (opcao) {
                    case 1:
                        System.out.println("Informe o nome do paciente");
                        fila.enqueue(sc.next());
                        break;
                    case 2:
                        System.out.println("Chamando paciente: " + fila.dequeue());
                        break;
                    case 3:
                        System.out.println(fila.toString());
                        break;
                    case 4:
                        System.out.println("O próximo paciente Ã©: " + fila.front());
                        break;
                    case 5:
                        System.out.println("Tamanho da fila: " + fila.length());
                        break;
                    case 6:
                        System.out.println("Informe a nova capacidade");
                        fila.redefinirTamanho(sc.nextInt());
                        break;
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (opcao != 7);
    }
}
