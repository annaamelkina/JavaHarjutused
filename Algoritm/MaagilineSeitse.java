package Algoritm;

import java.util.ArrayList;

/**
 * Antud on int[] massiiv. Korruta kõik seitsmed kahega ja leia arvude keskmine.
 */
public class MaagilineSeitse {

    public static void main(String[] args) {

        int[] naide = {7, 4, 324, 65, 4, 78, 7, 45, 4};
        ArrayList <Integer> KahekordsedSeitsmed = new ArrayList<>(); //loob uue massiivi koos korrutatud seitsmetega 7*2

        for (int i = 0; i < naide.length; i++){ //algab tsükkel: läbib massiivi otsides kui palju on massiivis elemente
            if (naide [i] == 7){ //kui element võrdub 7,
                int SeitseKordaKaks = naide[i]*2; //siis muudab uues massiivis seda elementi korrutades kahega
                KahekordsedSeitsmed.add(SeitseKordaKaks); //ning paneb kirja elemendid koos uute väärtustega uue listi
            } else {
                KahekordsedSeitsmed.add(naide[i]); //vastasel juhul kirjutab sama arvu aga ka uue listi sisse
            }
        }
        System.out.println(KahekordsedSeitsmed); //prindib välja massiivi koos uute väärtustega 7*2

        double summa = 0; //määrab muutuja elementide summa kohta

        for (int i = 0; i < KahekordsedSeitsmed.size(); i++) { //algab tsükkel, läbib kõik elemendid listis
            summa = summa + KahekordsedSeitsmed.get(i); //seni toimib summa arvutamine = 0+pöördume iga elemendi väärtustele (.get)
        }
        System.out.println("Arvude summa on " + summa); //prindib välja summa väärtuse

        double keskmine = summa/KahekordsedSeitsmed.size(); //keskmise arvutamise valem
        System.out.println("Arvude keskmine on " + keskmine); //prindib välja keskmise väärtuse
    }

}