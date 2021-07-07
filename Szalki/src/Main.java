/**
 * Michal Romanczyk s20422
 */

public class Main {

    public static double srednia = 0;

    public static void main(String[] args) {

        Test.przeprowadzTest(new int[]{1, 5, 5}); //test z podana tablica
        Test.przeprowadzTest(32);   //przeprowadz test na losowych danych

        /**tutaj mozna przeprowadzic test na wiekszej ilosci prob i wyciagnac srednia*/
//        int iloscProb = 1000;
//        for (int i = 0; i < iloscProb; i++) {
//            srednia += przeprowadzTest((int) (Math.random() * 100 + 1), i + 1);
//        }
//        System.out.println("\nSrednia roznica pomiedzy szalkami z " + iloscProb + " testow: " + srednia / iloscProb);
    }
}
