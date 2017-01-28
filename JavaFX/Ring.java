package JavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


 /**
 * Küsi kasutajalt x, y kordinaadid ja raadius ning joonista talle ring.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Ring extends Application {


    @Override
    public void start(Stage stage) {
        Pane root = new Pane();
        Scene scene = new Scene(root, 500, 500);
        stage.setScene(scene);
        stage.setTitle("Ring input");

        GridPane grid = new GridPane(); //teeme võrgu paneeli sees
        grid.setPadding(new Insets(10, 10, 10, 10)); //võrgu suurused inputi ja nuppu suurused (kokku 4 välja)
        grid.setVgap(5); //vertical gap - input väljade all olev vahe
        grid.setHgap(5); //horisontal gap - input väljade vahel olevad vahed

        scene.setRoot(grid); //Sets the value of the property root.

        final TextField xArg = new TextField();
        xArg.setPromptText("x:");
        xArg.setPrefColumnCount(5); //Sets the preferred number of text columns, calculating the TextField's preferred width.
        xArg.getText();
        GridPane.setConstraints(xArg, 0, 0); //äärete määramine
        grid.getChildren().add(xArg); //lisame gridi xArg parameetritega

        final TextField yArg = new TextField();
        yArg.setPrefColumnCount(5);
        yArg.setPromptText("y:");
        GridPane.setConstraints(yArg, 1, 0);
        grid.getChildren().add(yArg);

        final TextField radius = new TextField();
        radius.setPrefColumnCount(5);
        radius.setPromptText("Radius:");
        GridPane.setConstraints(radius, 3, 0);
        grid.getChildren().add(radius);

        Button submit = new Button("Submit");
        GridPane.setConstraints(submit, 4, 0);
        grid.getChildren().add(submit);


        final Label label = new Label();
        GridPane.setConstraints(label, 0, 3);
        GridPane.setColumnSpan(label, 2);
        grid.getChildren().add(label);
        Circle ring = new Circle(0);

        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                if (
                        (radius.getText() != null && !radius.getText().isEmpty() && xArg.getText() != null && !xArg.getText().isEmpty() && yArg.getText() != null && !yArg.getText().isEmpty())
                        ) {

                    ring.setRadius(Integer.parseInt(radius.getText())); //konverteerib raadiuse Int-ks
                    ring.setTranslateX(Integer.parseInt(xArg.getText())); //konverteerib xArg Int-ks
                    ring.setTranslateY(Integer.parseInt(yArg.getText())); //konverteerib yArg Int-ks
                    GridPane.setConstraints(ring, 0, 1);
                    grid.getChildren().add(ring);
                    label.setText("");

                    stage.show();

                } else {
                    label.setText("Please fill all the fields!");
                    ring.setRadius(0);
                }
            }
        });



        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}