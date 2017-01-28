package OOP;

/**
 * Peole on kutsutud rohkem inimesi kui korterisse mahub. Sinu ülesanne on Korteri
 * objekt ehitada nii, et üleliigsetest keelduda saaks.
 *
 * Reeglid
 * 1. Pidu klassi muuta ei tohi.
 * 2. Maja maksimum on 10 inimest.
 * 3. Kui Korter on täis siis on täis. Rohkem juurde ei saa
 */
public class Pidu {
    public static void main(String[] args) {

        int mahutab = 10;
        Korter korter = new Korter(mahutab);

        korter.saabus("Taavi");
        korter.saabus("Pilve");
        korter.saabus("Maarika");
        korter.saabus("Joonas");
        korter.saabus("Kalle");
        korter.saabus("Muri");
        korter.saabus("Sille");

        korter.prindiKylalisteArv();
        korter.prindiPaljuVeelMahub();

        korter.lahkus("Taavi");

        korter.saabus("Tambet");
        korter.saabus("Liisa");
        korter.saabus("Liis");
        korter.saabus("Veidro");
        korter.saabus("Moonika");
        korter.saabus("Politsei");

        korter.lahkus("Sille");

        korter.prindiKylalisteArv(); // peaks olema 9, järjekorda ei ole.
    }
}
class Korter {
    private int mahutab; //muutuja mahutab, mis laieneb koikide klasside peale
    public int kylalistearv;
    public Korter(int mahutab) {
        this.mahutab = mahutab; //kaasab muutuja elusid klassist Legend
    }

    public void saabus(String nimi){
        if(this.mahutab > kylalistearv){
            kylalistearv++;
        }
        else{
            System.out.println("Korter on täis!");
        }
    }

    public void lahkus(String nimi){
        kylalistearv--;
    }

    public void prindiKylalisteArv(){
        System.out.println("Külalisi hetkel " + kylalistearv);
    }


    public void prindiPaljuVeelMahub(){
        if(this.mahutab > kylalistearv){
            System.out.println("Mahub veel " + (this.mahutab - kylalistearv) + " inimest");
        }
        else{
            System.out.println("Korter on täis!");
        }
    }
}