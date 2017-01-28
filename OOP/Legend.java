package OOP;

/**
 * Loo klass Zelda, mis käitub nii nagu käesolev programm ootab.
 *
 * Reeglid:
 * 1. Legend klassi muuta ei tohi.
 * 2. Zelda kaotab nii palju elusid kui kollil elusid on.
 */
public class Legend {
    public static void main(String[] args) {
        int kollilElusid;

        int elusid = 35;
        Zelda zelda = new Zelda(elusid);

        kollilElusid = 25;
        zelda.kaklusKolliga(kollilElusid);

        zelda.prindiMituEluAlles();

        kollilElusid = 57;
        zelda.kaklusKolliga(kollilElusid);

        zelda.prindiKasOnElus();

    }
}

class Zelda {
    private int elusid; //muutuja elusid, mis laieneb koikide klasside peale
    public Zelda(int elusid) {
        this.elusid = elusid; //kaasab muutuja elusid klassist Legend
    }

    public void kaklusKolliga(int kollilelusid){
        this.elusid = this.elusid - kollilelusid; // lahutab: Zelda elusid - kolli elusid
    }

    public void prindiMituEluAlles(){
        System.out.println(this.elusid);
    }

    public void prindiKasOnElus(){
        if(this.elusid > 0){
            System.out.println("Elus");
        }
        else{
            System.out.println("Surnud");
        }
    }
}

