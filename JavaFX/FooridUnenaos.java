package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Joonista 500x500 ekraanile hunnikuga punaseid ringe.
 * Kui hiir ringile vastu läheb, muutub ring roheliseks.
 * Kordan - ring muudab värvi juba hiire puudutusest, mitte klikist.
 */
public class FooridUnenaos extends Application {
    public void start(Stage primaryStage) throws Exception {
        StackPane stack = new StackPane();
        Scene scene = new Scene(stack, 500, 500);//joonistame akna parameetritega 500*500
        primaryStage.setScene(scene);

        int xAlg = -240;
        int yAlg = -200;
        for (int i = 0; i < 12; i++) {//algab tsükkel: läbib 12 ringi
            xAlg=xAlg+40; //ringide keskuste vahed +40 kuidas nad positsioneerivad üksteise suhtes

            Circle ring = new Circle(20); //joonistame ringi raadiusega 20 pikslit
            ring.setTranslateX(xAlg); //Liiguta ringi allapoole xAlg koordinaadi peale
            ring.setTranslateY(yAlg); //ja paremale yAlg koordinaadi peale.
            ring.setFill(Color.RED); //ringi värv on punane
            stack.getChildren().add(ring); //paneeli lisatakse ringe parameetritega
            if (xAlg==200){
                if (yAlg<200){
                    yAlg=yAlg+40;
                    xAlg=-240;
                    i=0;
                }


            }

            ring.hoverProperty().addListener((ov, oldValue, newValue) -> { //hoverProperty - hiire puudutus, reageerib valiku muutmisele;
                // addListener (observableValue, vanaVaartus, uusVaartus)
                if (newValue){ //kui hiirega on puudutatud, siis tekib uus väärtus
                    ring.setFill(Color.GREEN); // ning ring muutub roheliseks
                }
            });

        }


        primaryStage. show();

    }
}