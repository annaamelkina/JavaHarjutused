package Maatriks;

import java.util.Arrays;
import java.util.Random;

/**
 * Loo 9*9 suurune maatriks, millele tekib kagu suunaline nurkade muster, nagu näites.
 * Tundub raske? Sul tuleb lihtsalt veeru ja rea indeksi seos leida.
 *
 * Näide
 * 9 8 7 6 5 4 3 2 1
 * 8 8 7 6 5 4 3 2 1
 * 7 7 7 6 5 4 3 2 1
 * 6 6 6 6 5 4 3 2 1
 * 5 5 5 5 5 4 3 2 1
 * 4 4 4 4 4 4 3 2 1
 * 3 3 3 3 3 3 3 2 1
 * 2 2 2 2 2 2 2 2 1
 * 1 1 1 1 1 1 1 1 1
 *
 */
public class KaguNurk {
    public static void main(String[] args) {
        int m = 9; //ridu
        int n = 9; //veerge
        int[][] matrix = new int[m][n]; //määrame maatriksi
        //taidame maatriksi
        for (int i = 0; i < matrix.length; i++) {//row - цикл по первой размерности
            for (int j = 0; j < matrix[i].length; j++) { //column - цикл по второй размерности
                matrix[i][j] = numbrid(i,j); // инициализация элементов массиыв
            }
        }
        printMaatriks(matrix); //соззание метода вывода элементов массива
    }

    public static int numbrid(int i, int j) {
        int cifra;
        // i-Row
        // j-Column
        if(i == 0 || j == 0) {
            cifra = 9-i-j;
        }
        else if (i>j) {
            cifra = 9-i;
        }
        else if (i<j){
            cifra = 9 - j;
        }
        else{
            cifra = 9-i;
        }

        return cifra;
    }




    // Lihtsalt abiline meetod, et maatriksit välja printida
    private static void printMaatriks(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i])); //вывод элементов массива
        }
        System.out.println("");
    }

}