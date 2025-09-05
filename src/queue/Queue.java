package queue;

import common.Node;

public class Queue {
    private Node head;
    private Node tail;

    public Queue() {
        head = null;
        tail = null;
    }

    public void insere(int x) {
        Node n = new Node(x);
        if (tail == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
    }

    public int remove() {
        if (head == null) return Integer.MIN_VALUE;
        int v = head.value;
        head = head.next;
        if (head == null) tail = null;
        return v;
    }

    public boolean vazia() {
        return head == null;
    }

    public int frente() {
        if (head == null) return Integer.MIN_VALUE;
        return head.value;
    }

    public void imprime() {
        System.out.print("Fila (frente -> fim): ");
        for (Node cur = head; cur != null; cur = cur.next) {
            System.out.print(cur.value + " ");
        }
        System.out.println();
    }
}
