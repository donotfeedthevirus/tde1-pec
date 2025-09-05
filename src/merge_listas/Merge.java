package merge_list;

import queue.Queue;
import java.util.Scanner;

public class Merge {

    public static Queue merge(Queue a, Queue b) {
        Queue c = new Queue();
        while (!a.vazia() && !b.vazia()) {
            int va = a.frente();
            int vb = b.frente();
            if (va <= vb) {
                c.insere(a.remove());
            } else {
                c.insere(b.remove());
            }
        }
        while (!a.vazia()) c.insere(a.remove());
        while (!b.vazia()) c.insere(b.remove());
        return c;
    }

    private static Queue lerFilaOrdenada(Scanner in, String nome) {
        Queue q = new Queue();
        System.out.print("Quantos elementos para " + nome + "? ");
        int n = in.nextInt();
        System.out.println("Digite " + n + " inteiros em ORDEM crescente:");
        for (int i = 0; i < n; i++) {
            q.insere(in.nextInt());
        }
        return q;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("--- MERGE (Listas Encadeadas) ---");
        System.out.println("1) Usar exemplo do enunciado");
        System.out.println("2) Inserir manualmente (filas ordenadas)");
        System.out.print("Escolha: ");
        int op = in.nextInt();

        Queue A = new Queue();
        Queue B = new Queue();

        if (op == 1) {
            // Exemplo do enunciado
            A.insere(12); A.insere(35); A.insere(52); A.insere(64);
            B.insere(5);  B.insere(15); B.insere(23); B.insere(55); B.insere(75);
        } else {
            A = lerFilaOrdenada(in, "A");
            B = lerFilaOrdenada(in, "B");
        }

        System.out.print("A: "); A.imprime();
        System.out.print("B: "); B.imprime();

        Queue C = merge(A, B);
        System.out.print("C (merge): "); C.imprime();

        in.close();
    }
}
