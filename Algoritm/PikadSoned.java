package Algoritm;

import java.util.Arrays;

/**
 * Antud on massiiv. Mitu sõne on massiivis keskmisest pikemad?
 */
public class PikadSoned {
    public static void main(String[] args){
        String[] naide = {"kaalikas", "joonas", "maakera", "homeros", "mandel"}; // vastus on 3

        double summa = 0;
        for (int i = 0; i < naide.length; i++){ //algab tsükkel: läbib kõik elemendid massiivis
            naide[i].length(); //arvutades iga elemendi pikkust eraldi
            System.out.println(i + 1 + ". sõna pikkus on " + naide[i].length()); //prindib välja iga elementi pikkust eraldi

            summa = summa + naide[i].length(); //summa väärtus = algsumma 0 + elemendi pikkus
        }
        System.out.println("Pikkuste summa on: " + summa); //prindib välja elementide pikkuste summat

        double keskmine = summa/naide.length; //määrab keskmise leidmise valemi
        System.out.println("Keskmine pikkus: " + keskmine); //prindib välja keskmise väärtuse

        int vastus = 0; //määrame muutujat keskmisest suurema sõnade arvu kohta
        for (int i = 0; i < naide.length; i++){ //algab tsükkel: läbib kõik elementide pikkused
            if (naide[i].length() > keskmine){ //kui elemendi pikkus on keskmisest suurem
                vastus++; //siis vastuse väärtusele lisatakse 1 juurde
            }
        }
        System.out.println("Keskmisest pikem on " + vastus + " sõna"); //prindib välja keskmisest suurema sõnade arvu
    }


}