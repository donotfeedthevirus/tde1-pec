package stack;

import common.Node;

public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public void insere(int x) {
        Node n = new Node(x);
        n.next = top;
        top = n;
    }

    public int remove() {
        if (top == null) return Integer.MIN_VALUE;
        int v = top.value;
        top = top.next;
        return v;
    }

    public boolean vazia() {
        return top == null;
    }

    public void imprime() {
        System.out.print("Pilha (topo -> base): ");
        for (Node cur = top; cur != null; cur = cur.next) {
            System.out.print(cur.value + " ");
        }
        System.out.println();
    }
}
