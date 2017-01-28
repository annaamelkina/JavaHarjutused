package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;

/**
 * Tee JavaFXiga detektiivi mäng, kus kasutaja saab nähtamatuid ringe otsida.
 * 1. Ekraanil (näiteks 500x500) on suvalistes kohtades 3 ringi, mida näha ei ole.
 * 2. Hiirega ringile vastu minnes tuleb ring nähtavale.
 */
public class Detektiiv extends Application {

    @Override //start meetod kirjutatakse üle Application klassist
    public void start(Stage primaryStage) throws Exception { //siit programm algab
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);//joonistame akna parameetritega 500*500
        primaryStage.setScene(scene);//saan olemasolevas aknas sisu muuta selle käsuga
        for (int i = 0; i < 3; i++) { //algab tsükkel, teostab 3 korda tegevust, mis kirjeldatud allpool

            Random rand = new Random(); //tahame kasutada uue Randomi
            int xAlg = rand.nextInt(470) + 30; //genereerib x juhuarvi min 30 kuni 470 pikslit koordinaat
            int yAlg = rand.nextInt(470) + 30; //genereerib y juhuarvu min 30 kuni 470 pikslit koordinaat
            System.out.println("x alg = " + xAlg); //prindib konsoolis juhu x
            System.out.println("y alg = " + yAlg); //prindib konsoolis juhu y

            Circle ring = new Circle(30); //joonistame ringi raadiusega 30
            ring.setTranslateX(xAlg); //nihutame paremale xAlg piksli võrra
            ring.setTranslateY(yAlg); //nihutame allapoole yAlg piksli võrra
            pane.getChildren().add(ring); //joonistame ringi parameetritega paneeli peale
            ring.setFill(Color.TRANSPARENT); //teeme algselt ringi läbipaistvaks
            ring.hoverProperty().addListener((ov, oldValue, newValue) -> { //hiire puudutusega, lisab pealtvaatajat
                //hoverProperty - hiire puudutus, reageerib valiku muutmisele;
                // addListener (observableValue, vanaVaartus, uusVaartus)
                        if (newValue) { //kui töötas hoverProperty, muudame uusVäärtuse
                            ring.setFill(Color.BLUE); //ring muutub siniseks
                        }
                    }
            );

            primaryStage.show();
        }
    }
}