package JavaFX;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Group;

import java.util.Random;

/**
 * Joonista ekraanile hunnik ristkülikuid, suvalistel positsioonidel. Ühe korra kastile klikates
 * muutub ta 2x väiksemaks. Teist korda klikates kaob ta sootuks.
 */
public class PixelChaser extends Application {

    public void start(Stage primaryStage) throws Exception {

        Pane root = new Pane();//loome uue paneeli
        Scene scene = new Scene(root, 500, 500);//loome stseeni suurusega 500*500
        int xAlg; //määrame muutuja koordinaati x
        int yAlg; //määrame muutuja koordinaati y
        //       int counter;
        for (int i = 0; i < 10; i++) { //algab tsükkel: genereerib 10 ruutu tsüklis, mis kirjeldatud all, käib 10 korga läbi

            Random rand = new Random(); //genereerib juhuslikult
            xAlg = rand.nextInt(300) + 1; //genereerib x juhuarvu koordinaati 1 kuni 300 (sest 500paneel-200ruutupikkus, mahub täeisti)
            yAlg = rand.nextInt(400) + 1; //genereerib y juhuarvu koordinaati 1 kuni 400 (sest 500paneel-100ruutukõrgus, mahub täeisti)

            Rectangle rect1 = new Rectangle(xAlg, yAlg, 200, 100); //loome riskküliku, pikkusega 200 ja kõrgusega 100
            rect1.setFill(Color.YELLOW); //määrame sinise värvi
            rect1.setStroke(Color.RED); //määrame borderi värvi

            root.getChildren().addAll(rect1);//joonistame stseeni sisse riskülikud

            rect1.setOnMouseClicked(new EventHandler<MouseEvent>() {//reageerimine klikile
                @Override
                public void handle(MouseEvent t) {

                    if (rect1.getWidth() == 200) {//kui ruudu laius on 200
                        rect1.setWidth(100); // siis klikimisel muutub ta 2 korga väiksemaks
                        rect1.setHeight(50);// ja kõrgus 2 korda väiksemaks

                    } else {
                        rect1.setWidth(0); // siis teisel klikimisel muutub pikkus 0-ks
                        rect1.setHeight(0); // ja kõrgus 0-ks

                    }


                }
            });
        }

        primaryStage.setScene(scene);
        primaryStage.show();



    }




}