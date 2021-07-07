public class Stos {

    private int[] dane;
    private int top;

    public Stos(int rozmiar) {
        dane = new int[rozmiar];
        top = -1;
    }

    public boolean push(int x) {
        if (++top >= dane.length) {
            System.out.println("Stack overflow");
            return false;
        }
        dane[top] = x;
        return true;
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack deflow");
            return Integer.MIN_VALUE;
        }
        int pop = dane[top];
        dane[top] = 0;
        top--;
        return pop;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int peak() {
        if (top > -1)
            return dane[top];
        return Integer.MIN_VALUE;
    }

    public int size() {
        return top + 1;
    }

    public int[] getDane() {
        return dane;
    }
}
