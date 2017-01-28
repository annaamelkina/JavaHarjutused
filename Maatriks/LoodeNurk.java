package Maatriks;

import java.util.Arrays;

/**
 * Loo 9*9 suurune maatriks, millele tekib loode suunaline nurkade muster, nagu näites.
 * Tundub raske? Sul tuleb lihtsalt veeru ja rea indeksi seos leida.
 *
 * Näide
 * 1 1 1 1 1 1 1 1 1
 * 1 2 2 2 2 2 2 2 2
 * 1 2 3 3 3 3 3 3 3
 * 1 2 3 4 4 4 4 4 4
 * 1 2 3 4 5 5 5 5 5
 * 1 2 3 4 5 6 6 6 6
 * 1 2 3 4 5 6 7 7 7
 * 1 2 3 4 5 6 7 8 8
 * 1 2 3 4 5 6 7 8 9
 *
 * Tundub raske? Leia seoseid rea ja veeru indeksi numbritega.
 */
public class LoodeNurk {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) { //row - цикл по первой размерности
            for (int j = 1; j < 10; j++) { //column - цикл по второй размерности
                System.out.print(" "+Math.min(i, j));
            }
                System.out.println();
        }
    }


    // Lihtsalt abiline meetod, et maatriksit välja printida
    private static void printMaatriks(int[][] laud) {
        for (int i = 0; i < laud.length; i++) {
            System.out.println(Arrays.toString(laud[i]));
        }
        System.out.println("");
    }

}
