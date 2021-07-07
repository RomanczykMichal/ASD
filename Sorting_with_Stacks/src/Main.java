public class Main {
    public static void main(String[] args) {
        int[] zbior = {1, 5, 3, 8, 2, 9, 5, 10, 1};
        int[] odp = zad2(zbior);
        for (int item : odp) System.out.print(item + ",");
    }

    public static int[] zad2(int[] wejscie) {
        Stos stos1 = new Stos(wejscie.length);
        Stos stos2 = new Stos(wejscie.length);
        int[] sorted = insertionSort(wejscie);

        for (int i = 0; i < sorted.length; i++)
            if (i % 2 == 0)
                stos1.push(sorted[i]);
            else
                stos2.push(sorted[i]);

        for (int i = 0; i < sorted.length / 2 + 1; i++)
            stos2.push(stos1.pop());

        return stos2.getDane();
    }

    public static int[] insertionSort(int[] tab) {
        Stos stos1 = new Stos(tab.length);
        Stos stos2 = new Stos(tab.length);

        for (int value : tab) stos1.push(value);

        while (stos1.size() > 0) {
            int tmp = stos1.pop();

            while (stos2.size() > 0 && stos2.peak() > tmp)
                stos1.push(stos2.pop());

            stos2.push(tmp);
        }

        int[] wynik = new int[tab.length];

        for (int i = 0; i < tab.length; i++)
            wynik[tab.length - 1 - i] = stos2.pop();

        return wynik;
    }
}
