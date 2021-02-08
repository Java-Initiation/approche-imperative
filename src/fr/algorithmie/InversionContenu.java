package fr.algorithmie;

public class InversionContenu {

    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] arrayCopie = new int[array.length];
        for (int i = 1; i < array.length; i++) {
            System.out.println("i = " + (array.length - i));
            arrayCopie[i] = array[array.length - i];
        }
        System.out.println("Tableau array");
        for (int a : array) {
            System.out.println(a);
        }
        System.out.println("Tableau arrayCopie");
        for (int a : arrayCopie) {
            System.out.println(a);
        }
    }
}
