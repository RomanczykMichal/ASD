import java.util.Arrays;
import java.util.Stack;

public class Main {

    static Node predecessor;
    static Node successor;
    static int liscie;

    public static void main(String[] args) {
        int[] tab = {1, 5, 4, 10, 11, 3, 2, 14};
        int los = (int) (Math.random() * tab.length);
        Node root = new Node(tab[los]);
        predecessor = new Node(Arrays.stream(tab).min().getAsInt());
        successor = new Node(Arrays.stream(tab).max().getAsInt());
        liscie = 0;

        for (int i = 0; i < tab.length; i++) {
            if (i != los)
                putNodeToTree(tab[i], root);
        }

        System.out.println(root);

        //wypisanie wartości korzenia
        boolean parz = root.getVal() % 2 == 0;
        System.out.println("\nWartość korzenia = " + root.getVal() + " i jest ona " + (parz ? "parzysta" : "nieparzysta"));

        //Wypisz liscie drzewa
        System.out.print("Liscie drzewa o tej samej charakterystyce co korzen: ");
        printLeafs(root, parz);
        System.out.println("\nIlosc lisci drzewa ogolnie: " + (liscie == 0 ? "brak" : liscie));

        //wypisz poprzednika i nastepce
        findPresSucc(root);
        System.out.println("Poprzednik dla korzenia: " + predecessor.getVal() + "\nNastepca dla korzenia: " + successor.getVal());
    }

    private static void putNodeToTree(int val, Node root) {
        Node temp = new Node(val);

        if (root.getVal() >= temp.getVal()) {
            if (root.getRight() == null)
                root.setRight(temp);
            else
                putNodeToTree(val, root.getRight());
        } else {
            if (root.getLeft() == null)
                root.setLeft(temp);
            else
                putNodeToTree(val, root.getLeft());
        }
    }

    private static void printLeafs(Node root, boolean parzyste) {
        if (root == null)
            return;

        Stack<Node> stack = new Stack<Node>();
        Node temp = root;

        //dopoki stos nie bedzie pusty przechodz po kazdym elemencie od lewej
        while (temp != null || stack.size() > 0) {

            //dojdz do najbardziej lewego elementu
            while (temp != null) {
                stack.push(temp);
                temp = temp.getLeft();
            }

            temp = stack.pop();

            //Tutaj printuje i inkrementuje
            if (temp.getRight() == null && temp.getLeft() == null) {
                liscie++;

                if ((temp.getVal() % 2 == 0) == parzyste)
                    System.out.print(temp.getVal() + " ");
            }
            temp = temp.getRight();
        }
    }

    private static void findPresSucc(Node root) {
        if (root == null)
            return;

        if (root.getLeft() != null) {
            Node tmp = root.getLeft();
            while (tmp.getRight() != null)
                tmp = tmp.getRight();

            predecessor = tmp;
        }

        if (root.getRight() != null) {
            Node tmp = root.getRight();

            while (tmp.getLeft() != null)
                tmp = tmp.getLeft();

            successor = tmp;
        }
    }
}