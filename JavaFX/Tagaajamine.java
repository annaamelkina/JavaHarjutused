package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;


/**
 * Joonista 500x500 ekraanile ring. Kui hiir ringile vastu läheb, leiab ring omale
 * uue koha. Ei pea animeerima ega midagi fäänsit. Lihtsalt ilmub uues kohas ja kõik.
 * Ehk hiirega saab ringi taga ajada. Kordan - ring leiab uue koha juba hiire puudutusest,
 * mitte klikist. Aga alustada võid muidugi klikist.
 */
public class Tagaajamine extends Application {
    public void start(Stage primaryStage) throws Exception {
        StackPane stack = new StackPane();
        Scene scene = new Scene(stack, 500, 500);//joonistame akna parameetritega 500*500
        primaryStage.setScene(scene);

        int xAlg = 0;
        int yAlg = 0;

            Circle ring = new Circle(50); //joonistame ringi raadiusega 50
            ring.setTranslateX(xAlg); //määrame ringi paremapoolse asetuse
            ring.setTranslateY(yAlg); //määrame ringi allapoolse asetuse
            ring.setFill(Color.RED); //värvime ringi punaseks
            stack.getChildren().add(ring); ///lisame paneeli peale ringi parameetritega

            ring.hoverProperty().addListener((ov, oldValue, newValue) -> { //hoverProperty - hiire puudutus, reageerib valiku muutmisele;
                // addListener (observableValue, vanaVaartus, uusVaartus)
                if (newValue){ //kui töötas hoverProperty, muudame uusVäärtuse
                    Random rand = new Random(); //genereerime juhuslikult kasutades Random
                    int xAlg1 = rand.nextInt(400) - 200; //genereerib juhuarvu x koordinaati -200 kuni 400
                    int yAlg2 = rand.nextInt(400) - 200; //genereerib juhuarvu y koordinaati -200 kuni 400

                    ring.setTranslateX(xAlg1); //määrame ringi parempoolse asetuse
                    ring.setTranslateY(yAlg2); // määrame ringi allapoolse väärtuse

                }
            });

        primaryStage. show();
    }
}