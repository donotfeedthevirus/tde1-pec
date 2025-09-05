package queue;

import java.util.Scanner;

public class MainQueue {
    public static void main(String[] args) {
        Queue q = new Queue();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- FILA ---");
            System.out.println("1) Inserir (enqueue)");
            System.out.println("2) Remover (dequeue)");
            System.out.println("3) Imprimir");
            System.out.println("0) Sair");
            System.out.print("Escolha: ");
            int op = in.nextInt();
            if (op == 0) break;
            if (op == 1) {
                System.out.print("Valor: ");
                int v = in.nextInt();
                q.insere(v);
            } else if (op == 2) {
                int r = q.remove();
                if (r == Integer.MIN_VALUE) {
                    System.out.println("Fila vazia, nada a remover.");
                } else {
                    System.out.println("Removido da fila: " + r);
                }
            } else if (op == 3) {
                q.imprime();
            }
        }
        in.close();
    }
}
