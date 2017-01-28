package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Loo JavaFXis koristaja mäng.
 * 1. Ekraan (näiteks 500x500) on paksult ringe täis. Nii, et läbi ei näe.
 * 2. Ringile hiirega vastu minnes kaob ring ära.
 * 3. Ringide all on peidus sõnum (näiteks Labeliga), mida kasutaja lõpuks näeb.
 */
public class Koristaja extends Application {
    public void start(Stage primaryStage) throws Exception {
        Pane field = new Pane();
        Scene scene = new Scene(field, 500, 500);//joonistame akna parameetritega 500*500
        primaryStage.setScene(scene);
        Text text = new Text(100, 250, "Hello World!!!"); //jonistame teksti ekraanile koordinaatidega x100-y250
        text.setFont(Font.font("verdana", FontWeight.EXTRA_BOLD, 40)); //määrame teksti fonti ja suuruse
        text.setFill(Color.GREEN); //määrame teksti värvi roheliseks
        field.getChildren().add(text); //lisame teksti paneeli peale

        int xAlg = 50;
        int yAlg = 50;
        for (int i = 0; i < 10; i++) {//algab tsükkel: läbib 10 ringi ühes reas


            Circle ring = new Circle(50); //joonistame ringi
            ring.setTranslateX(xAlg); //määrame ringi paremapoolse asetuse
            ring.setTranslateY(yAlg); //määrame ringi allapoolse asetuse
            xAlg=xAlg+50; //ringine keskide vahel on 50 pikslit paremale, muutsime x
            ring.setFill(Color.RED); //värvime ringid punaseks
            field.getChildren().add(ring); //lisame paneelile ringid parameetritega
            if (xAlg==500){ //kui lähenes ääreni (X telg)
                if (yAlg<450){ //kui lähenesime Y telje ääreni 450, siis = 450 -> lõpeb tegevus
                    yAlg=yAlg+50; //kui vähem kui 450, siis pikeneb Y koorditaat 50 piksli võrra
                    xAlg=50; //x muutub 50 ja alustab uue rida
                    i=0; //ja nullitab i ja uuesti joonistab 10 ringi uues reas kuni x=500 ja y<450
                }
            }

            ring.hoverProperty().addListener((ov, oldValue, newValue) -> { //hoverProperty - hiire puudutus, reageerib valiku muutmisele;
                // addListener (observableValue, vanaVaartus, uusVaartus)
                if (newValue){ ///kui hiirega on puudutatud, siis tekib uus väärtus
                    ring.setFill(Color.TRANSPARENT); //ninh ring muutub läbipaistvaks
                }
            });

        }


        primaryStage. show();

    }
}