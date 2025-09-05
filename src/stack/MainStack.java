package stack;

import java.util.Scanner;

public class MainStack {
    public static void main(String[] args) {
        Stack s = new Stack();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- PILHA ---");
            System.out.println("1) Inserir (push)");
            System.out.println("2) Remover (pop)");
            System.out.println("3) Imprimir");
            System.out.println("0) Sair");
            System.out.print("Escolha: ");
            int op = in.nextInt();
            if (op == 0) break;
            if (op == 1) {
                System.out.print("Valor: ");
                int v = in.nextInt();
                s.insere(v);
            } else if (op == 2) {
                int r = s.remove();
                if (r == Integer.MIN_VALUE) {
                    System.out.println("Pilha vazia, nada a remover.");
                } else {
                    System.out.println("Removido da pilha: " + r);
                }
            } else if (op == 3) {
                s.imprime();
            }
        }
        in.close();
    }
}
