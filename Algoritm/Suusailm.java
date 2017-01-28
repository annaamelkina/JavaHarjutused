package Algoritm;

/**
 * Antud on kaks massiivi õhu temperatuuridega. Arvuta mõlema puhul mitu positiivset temperatuuri
 * on massiivis rohkem kui negatiivseid.
 */
public class Suusailm {

    public static void main(String[] args) {

        int[] kraadid1 = {11, 10, 5, 1, 3, -2, -6, 2, -13, -24, -9, 0};
        int[] kraadid2 = {-23, -25, -22, -18, -15, -19, -13};
        arvutaPaevad(kraadid1);
        arvutaPaevad(kraadid2);
    }


    public static void arvutaPaevad(int[] kraadid) {
        int a = 0; //positiivsed temo
        int b = 0; //negatiivsed temp

        for (int i = 0; i < kraadid.length; i++) { //inkrementeeritakse niipalju, kui palju on massivis elemente .length
            if (kraadid[i] >= 0) {
                a++; //lisatakse positiivsele
            } else {
                b++; //lisatakse negatiivsele
            }
        }
        System.out.println("Positiivseid päevi on " + a);
        System.out.println("Negatiivseid päevi on " + b);
            if (a > b) {
                System.out.println("Soojasid paevi oli " + (a - b) + " rohkem");
            } else {
                System.out.println("Külmasid paevi oli " + (b - a) + " rohkem");
            }
        }
    }