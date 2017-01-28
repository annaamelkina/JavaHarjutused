package Maatriks;

import java.util.Arrays;

import static Maatriks.KaguNurk.numbrid;


/**
 * Loo 9*9 maatriks, millel on kujutatud kikilipsu. Värvitud ala on number 0 ja
 * värvimata on punkt. Kui ei oska siis joonista esiteks rist ja liigu sealt edasi.
 *
 * Näide
 * 0 . . . . . . . 0
 * 0 0 . . . . . 0 0
 * 0 0 0 . . . 0 0 0
 * 0 0 0 0 . 0 0 0 0
 * 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 . 0 0 0 0
 * 0 0 0 . . . 0 0 0
 * 0 0 . . . . . 0 0
 * 0 . . . . . . . 0
 *
 *  for (int i = 0; i < 9; i++) {
 for (int j = 0; j < 9; j++) {
 if (i >= j && i + j < 9)|| (i <= j && i+j =< 8){
 System.out.println(" 0 ");

 } else {
 System.out.println("-");

 }

 }
 System.out.println();
 }
 *
 */
public class Kikilips {

    public static void main(String[] args) {
        String [][] maatriks = new String[9][9]; //määrame maatriksi suurusega 9*9

        for (int i = 0; i < 9; i++) { //row - цикл по первой размерности
            for (int j = 0; j < 9; j++) { //column - цикл по второй размерности
                if (i+j<9 && i-j>=0) {
                    maatriks[i][j] = "0";
                } else if (i+j>=8 && i-j<=0) {
                    maatriks[i][j] = "0";
                } else {
                    maatriks[i][j] = " ";
                }
            }
            System.out.println(Arrays.toString(maatriks[i]));
        }
    }

}