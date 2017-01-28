package OOP;

/**
 * Loo see Pastaka objekt, mida kirjanik soovib siin kasutada.
 *
 * Reeglid:
 * 1. Käesolevat faili ei tohi muuta
 * 2. Kui pastakas kirjutab siis tuleb tekst konsooli - kuni tinti jätkub.
 * 3. Iga täht kulutab ühe ühiku.
 */
public class Kirjanik {
    public static void main(String[] args) {
        int tindiKogus = 60;

        Pastakas pastakas = new Pastakas(tindiKogus);

        pastakas.kirjuta("Elu oleks palju lihtsam, kui meil oleks selle lähtekood.");

        pastakas.prindiPaljuTintiAlles();

        pastakas.kirjuta("Õiged progejad ei kommenteeri oma koodi. Kui seda oli raske kirjutada, siis peab olema seda ka raske lugeda!");

    }
}

class Pastakas {

    public static int Tindid;
    Pastakas(int Kogus) {
        Tindid = Kogus;
    }

    public void kirjuta(String sonum) {
        String sonumKokku=sonum.replaceAll("\\s+","");
        if (sonumKokku.length()<=Tindid) {
            System.out.println(sonum);
            Tindid=Tindid-sonumKokku.length();
        }
        else {
            String sonumTuhikuga = sonum.substring(0,Tindid); //loome uue muutuja sonumTuhikuga, mis arvutab kui palju sümboleid koos tühikutega meil jääb kirjutama 0-Tindid
            String sonumTuhikuta = sonumTuhikuga.replaceAll("\\s+",""); //saadud tulemusest eemaldame tühikud
            System.out.println(sonum.substring(0,Tindid + (sonumTuhikuga.length() - sonumTuhikuta.length()))); //arvutame tühukute arvu, ja liidame Tindiga
        }
    }

    public void prindiPaljuTintiAlles() {
        System.out.println(Tindid);
    }
}