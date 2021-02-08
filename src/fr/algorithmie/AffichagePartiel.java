package fr.algorithmie;

public class AffichagePartiel {

    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int index = 0;

        // > 3
        for (int a : array) {
            if (a > 3)
                System.out.println(a);
        }

        // pair
        for (int a : array) {
            if (a % 2 == 0)
                System.out.println(a);
        }

        // index pair
        for (int a : array) {
            if (index % 2 == 0)
                System.out.println(a);
            index++;
        }

        // impaire
        for (int a : array) {
            if (a % 2 != 0)
                System.out.println(a);
        }
    }
}
