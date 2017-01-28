package OOP;

import java.util.ArrayList;
import java.util.List;

/**
 * Siin failis kasutatakse objekti Kassa, aga Kassa klassi ei eksisteeri. Sinu ülesanne
 * on see luua.
 *
 * Käesolevat klassi ei tohi muuta - mitte ühtegi tähemärki!
 *
 * Jep, sama ülesanne oli ka proovieksamis.
 */
public class Pood {

    public static void main(String[] args) {

        String kassapidaja = "Laine";
        Kassa kassa = new Kassa(kassapidaja);

        kassa.lisaToode("Piim");
        kassa.lisaToode("Sai");
        kassa.lisaToode("Lillkapsas");
        kassa.lisaToode("Lamuu jäätis");
        kassa.lisaToode("Kanepiküpsis");
        kassa.eemaldaToode("Piim");
        kassa.eemaldaToode("Sai");
        kassa.lisaToode("Leib");

        kassa.prindiOstutsekk();
        kassa.prindiKassapidajaNimi();
    }
}
class Kassa {
    List<String> Ostutsekk = new ArrayList<>();
    public static String kassapidaja;
    Kassa (String kassapidaja) {
        this.kassapidaja = kassapidaja;
    }

    public void lisaToode(String toode) {
        Ostutsekk.add(toode);
    }

    public void prindiOstutsekk() {
        for(int i=0; i < Ostutsekk.size(); i++) {
            System.out.println(Ostutsekk.get(i));
        }
    }

    public void prindiKassapidajaNimi() {
        System.out.println("Kassapidaja: " + kassapidaja);
    }

    public void eemaldaToode(String toode) {
        int index = Ostutsekk.indexOf(toode);//vaatab massiivi sisse, leiab elementi ja ytleb mis positsioonil (index) see elemnet asub
        Ostutsekk.remove(index); //eemaldab see element, mis asub positsioonil index

    }


}
