package OOP;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Raamatukogus on Sõnaraamat. Õigemini siis on, kui sa selle klassi kirjutad.
 *
 * Raamatukogu klassi ei tohi muuta.
 */
public class Raamatukogu {
    public static void main(String[] args) {

        String raamatuKeel = "Eesti";
        Sonaraamat raamat = new Sonaraamat(raamatuKeel);
        raamat.sisestaSona("puaas");
        raamat.sisestaSona("uubuma");
        raamat.sisestaSona("uudikristamine");
        raamat.sisestaSona("suaree");
        raamat.sisestaSona("sarkasm");
        raamat.sisestaSona("iroonia");

        String[] vaste = raamat.otsiEsimeseTaheJargi("u");
        System.out.println(Arrays.toString(vaste));

        String[] vaste2 = raamat.otsiEsimeseTaheJargi("s");
        System.out.println(Arrays.toString(vaste2));

        raamat.eemaldaSona(vaste2[0]);

        raamat.misKeelesRaamatOn();

    }
}
class Sonaraamat {
    ArrayList <String> soned = new ArrayList <String>();
    private String keel;

    public Sonaraamat(String raamatuKeel) {
        keel = raamatuKeel;
    }

    public void sisestaSona(String sona) {
        soned.add(sona);
    }

    public String[] otsiEsimeseTaheJargi(String u) {
        char esimeneTaht = u.charAt(0);
        ArrayList <String> sobivaAlgusega = new ArrayList <String>();//seda ei tohi üles panna, sest siis ta lisab vast2 eelmistele väärutustele juurde, mitte ei tee uut
        for (int i = 0; i < soned.size(); i++) {
            if (soned.get(i).charAt(0) == esimeneTaht) {
                String tahegaSone = soned.get(i);
                sobivaAlgusega.add(tahegaSone);
            }
        }
        String [] sobivaAlgusegaString = new String[sobivaAlgusega.size()];
        for (int i = 0; i < sobivaAlgusega.size(); i++) {
            sobivaAlgusegaString[i] = sobivaAlgusega.get(i);
        }
        return sobivaAlgusegaString;
    }

    public void eemaldaSona(String s) {
        soned.remove(s);
    }

    public void misKeelesRaamatOn() {
        System.out.println(keel);
    }

    public String misOnRaamatus() {
        return soned.toString();
    }
}