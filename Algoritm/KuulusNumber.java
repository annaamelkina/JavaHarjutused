package Algoritm;
import java.util.ArrayList;
import java.util.List;


/**
 * Antud on int[] massiiv. Eemalda kõik nr 3 väärtused ja leia millist numbrit esineb kõige siis rohkem?
 * Mitte siis number, mis on kolmandal indeksil, vaid nr kolm ise.
 */
public class KuulusNumber {

    public static void main(String[] args) {

        int[] naide = {1, 5, 3, 3, 6, 3, 7, 7}; // vastus on 7

        List<Integer> list = new ArrayList<>(); //loome uue ArrayListi nimega List
        for (int i : naide) { //tsükli algus: läbib kõiki elemente massivis "naide"
            list.add(i); //lisame uue elemendi vastavalt massiiviga "naide" - lisab 8 korda uus element eraldi
        }

        int n = list.size(); //muutujale n omistame listi suuruse väärtust
        int FrequentNumebr=0; //kõige sagedamini kohtuva väärtuse
        int NumberCount=0; // arvutab kui palju see number esineb massivis
        for(int i=0; i<n; i++){ //algab tsükkel: läbime terve listi, kus otsime nr 3


            if(list.get(i)==3) { //kontrollime kas käesolev element listis võrdub 3-ga
                list.remove(i); //kui jah, siis eemaldame seda elementi listist
                i--; //viib eemaldatud elemendi positsioonist samm tagasi elemendi positsioonile
                n = list.size(); //uuendame tsüklide arvu peale elemendi eemaldamist
            }

        }
        System.out.println(list); // prindime välja uuendatud listi ilma nr. 3-ta
        for (int j=0; j<n; j++){ //algab tsükkel: läbib terve listi, kus otsib arvude esinemise sagedust
            int TempNumber = list.get(j); //määrame ajutise numbri sama numbri j positsioonis otsimise aluseks kogu listis
            int TempCount=0; //määrame elemendi, mida hakkame edaspidi otsima
            for(int p=0; p<n; p++){ //algab tsükkel: läbib terve listi, kus otsime korduvad elementide väärtused
                if(list.get(p)==TempNumber) TempCount++; //kontrollime kui peamine element klapib kordivada, siis +1 arvutus
                if (TempCount>NumberCount){ //kontrollime kui ajutiselt peamine element on suurem kui eelmine peamine element
                    FrequentNumebr=TempNumber; //kirjutame ajutuse elemendi väärtuse

                }
            }



        }

        System.out.println("Frequent Number is: " + FrequentNumebr); // prindime sagedamini esineva elemendi väärtuse
    }

}