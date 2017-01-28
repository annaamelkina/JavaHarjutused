package Maatriks;

import java.util.Arrays;

/**
 * Loo 9*9 maatriks, millel on kujutatud liivakella. Värvitud ala on number 0 ja
 * värvimata on punkt. Kui ei oska siis joonista esiteks rist ja liigu sealt edasi.
 *
 * Näide
 * 0 0 0 0 0 0 0 0 0
 * . 0 0 0 0 0 0 0 .
 * . . 0 0 0 0 0 . .
 * . . . 0 0 0 . . .
 * . . . . 0 . . . .
 * . . . 0 0 0 . . .
 * . . 0 0 0 0 0 . .
 * . 0 0 0 0 0 0 0 .
 * 0 0 0 0 0 0 0 0 0
 *
 */
public class Liivakell {
    public static void main(String[] args) {
        int suurus = 9;
        for (int i = 0; i < suurus; i++) { //row - цикл по первой размерности
            for (int j = 0; j < suurus; j++) { //column - цикл по второй размерности
                if (i + j < suurus && i<=j) {
                    System.out.print("0");
                } else if (i + j >= suurus -1 && i >= j) {
                    System.out.print("0");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }

/**
    // Lihtsalt abiline meetod, et maatriksit välja printida
    private static void printMaatriks(int[][] laud) {
        for (int i = 0; i < laud.length; i++) {
            System.out.println(Arrays.toString(laud[i]));
        }
        System.out.println("");
    }
 */
}

