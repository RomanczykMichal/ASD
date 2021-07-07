public class Test {

    public static void przeprowadzTest(int[] odwazniki) {
        int[] zbiorOdwaznikow = odwazniki;
        int[] lewa = new int[zbiorOdwaznikow.length];
        int[] prawa = new int[zbiorOdwaznikow.length];

        Algorytm.podziel(zbiorOdwaznikow, lewa, prawa);
    }

    //test z podanym zakresem (ilosc odwaznikow)
    public static void przeprowadzTest(int zakres) {
        int[] zbiorOdwaznikow = stworzLosowyZbiorOdwaznik(zakres);
        int[] lewa = new int[zbiorOdwaznikow.length];
        int[] prawa = new int[zbiorOdwaznikow.length];

        Algorytm.podziel(zbiorOdwaznikow, lewa, prawa);
    }

    //duze testy
    public static double przeprowadzTest(int zakres, int nr) {
        int[] zbiorOdwaznikow = stworzLosowyZbiorOdwaznik(zakres);
        int[] lewa = new int[zbiorOdwaznikow.length];
        int[] prawa = new int[zbiorOdwaznikow.length];

        System.out.println("\nTEST #" + nr);
        return  Algorytm.podziel(zbiorOdwaznikow, lewa, prawa);
    }

    public static int[] stworzLosowyZbiorOdwaznik(int zakres) {
        //stworz tablice tymczasowa
        int[] temp = new int[zakres];
        //przydziel do tablicy losowe liczby (0,5,10,15,20,25)
        for (int i = 0; i < zakres; i++) {
            int tp = (((int) (Math.random() * zakres) % 6)) * 5;

            if (tp == 0)
                temp[i] = 1;
            else
                temp[i] = tp;
        }
        return temp;
    }

}
