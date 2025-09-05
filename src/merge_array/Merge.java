package merge_array;
import java.util.Scanner;
public class Merge {

    public static int[] merge(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        int[] C = new int[n + m];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (A[i] <= B[j]) C[k++] = A[i++];
            else C[k++] = B[j++];
        }
        while (i < n) C[k++] = A[i++];
        while (j < m) C[k++] = B[j++];
        return C;
    }

    private static int[] lerArrayOrdenado(Scanner in, String nome) {
        System.out.print("Quantos elementos para " + nome + "? ");
        int n = in.nextInt();
        int[] v = new int[n];
        System.out.println("Digite " + n + " inteiros em ORDEM crescente:");
        for (int i = 0; i < n; i++) v[i] = in.nextInt();
        return v;
    }

    private static void imprime(int[] v) {
        System.out.print("[ ");
        for (int x : v) System.out.print(x + " ");
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("--- MERGE (Vetores) ---");
        System.out.println("1) Usar exemplo do enunciado");
        System.out.println("2) Inserir manualmente (vetores ordenados)");
        System.out.print("Escolha: ");
        int op = in.nextInt();

        int[] A, B;
        if (op == 1) {
            A = new int[]{12, 35, 52, 64};
            B = new int[]{5, 15, 23, 55, 75};
        } else {
            A = lerArrayOrdenado(in, "A");
            B = lerArrayOrdenado(in, "B");
        }

        int[] C = merge(A, B);
        imprime(C);
        in.close();
    }
}
