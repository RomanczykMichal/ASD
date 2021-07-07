public class Algorytm {

    public static int podziel(int[] arr, int[] lewa, int[] prawa) { //O(n)
        arr = countingSort(arr);

        int posLewa = 0;
        int sumaLewa = 0;
        int posPrawa = 0;
        int sumaPrawa = 0;

        int roznicaPoDodaniuDoLewej;
        int roznicaPoDodaniuDoPrawej;

        int i = arr.length - 1;

        while (i > -1) { //umieszczanie na szalkach wzgledem sumy
            roznicaPoDodaniuDoLewej = Math.abs((sumaLewa + arr[i]) - sumaPrawa);
            roznicaPoDodaniuDoPrawej = Math.abs(sumaLewa - (sumaPrawa + arr[i]));

            if (roznicaPoDodaniuDoLewej < roznicaPoDodaniuDoPrawej) {
                lewa[posLewa] = arr[i];
                posLewa++;
                sumaLewa += arr[i];
            } else {
                prawa[posPrawa] = arr[i];
                posPrawa++;
                sumaPrawa += arr[i];
            }

            i--;
        }

        //wypisanie wyniku
        printWynik(lewa, prawa, sumaLewa, sumaPrawa);
        return Math.abs((sumaLewa - sumaPrawa));
    }


    public static int[] countingSort(int[] arr) {
        int[] tmp = new int[arr.length];
        int[] wystepowanie = new int[26]; //robimy tablice z zakresem maksymalnym (maks waga obciaznika to 25)

        for (int i : arr)
            wystepowanie[i]++;

        for (int i = 0, k = 0; i < wystepowanie.length; i++)
            while (wystepowanie[i]-- > 0)
                tmp[k++] = i;

        return tmp;
    }


    private static void printSzalki(int arr[], String szala) {
        System.out.print(szala + " ");
        for (int value : arr) {
            if (value != 0)
                System.out.print(value + " ");
        }
    }


    private static void printWynik(int[] lewa, int[] prawa, int sumaLewa, int sumaPrawa) {
        printSzalki(lewa, "Lewa");
        printSzalki(prawa, "Prawa");
        System.out.println("\nSuma lewej szalki " + sumaLewa);
        System.out.println("Suma prawej szalki " + sumaPrawa);
        System.out.println("Różnica szalek = " + Math.abs((sumaLewa - sumaPrawa)) + "\n");
    }
}
