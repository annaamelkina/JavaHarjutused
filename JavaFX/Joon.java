package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.util.Scanner;

/**
 * Küsi kasutajalt alguse ja lõpu x-y kordinaadid ning joonista talle joon.
 * Akna võime limiteerida 500x500 piksli peale.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Joon extends Application {
    public void start (Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);//joonistame akna parameetritega 500*500
        primaryStage.setScene(scene);//saan olemasolevas aknas sisu muuta selle käsuga

        TextField textfield = new TextField(); // loome tekstivälja kuhu kirjutame koordinaadid
        Button submit = new Button("Joonista!"); // loome nuppu, mis joonistab joont
        submit.setTranslateX(170); //nupp "Joonista" asetseb 170 piksli võrra paremale
        pane.getChildren().addAll(textfield, submit); //lisab paneeli tekstfield ja nupp
        Line joon = new Line(0, 0, 0, 0); //loome uue joone algkoordinaatidega 0/0/0/0
        submit.setOnAction(event -> { //vajutame nuppu

                    String input = textfield.getText(); //küsime inputi stringi näol
                    String[] k = input.split("-"); //lahutame numbrid k masiivis

                    joon.setStartX(Integer.parseInt(k[0])); //määrame algpositsiooni: võtame k massiivi esimene element ja konverteerime Int-ks
                    joon.setStartY(Integer.parseInt(k[1]));
                    joon.setEndX(Integer.parseInt(k[2]));
                    joon.setEndY(Integer.parseInt(k[3]));
                    pane.getChildren().add(joon); //joonistame joone antud parameetritega
                });

        primaryStage.show();
    }
}