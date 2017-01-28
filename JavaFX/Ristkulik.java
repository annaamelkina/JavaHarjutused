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
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
/**
 * Küsi kasutajalt alguskordinaadid ja laius-kõrgus ning joonista talle ristkülik.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Ristkulik extends Application{
    @Override
    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 500, 500);
        stage.setScene(scene);
        stage.setTitle("Ristkulik input");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);

        scene.setRoot(grid);

        final TextField xArg = new TextField();
        xArg.setPromptText("x:");
        xArg.setPrefColumnCount(5);
        xArg.getText();
        GridPane.setConstraints(xArg, 0, 0);
        grid.getChildren().add(xArg);

        final TextField yArg = new TextField();
        yArg.setPrefColumnCount(5);
        yArg.setPromptText("y:");
        GridPane.setConstraints(yArg, 1, 0);
        grid.getChildren().add(yArg);

        final TextField korgus = new TextField();
        korgus.setPrefColumnCount(5);
        korgus.setPromptText("Kõrgus:");
        GridPane.setConstraints(korgus, 2, 0);
        grid.getChildren().add(korgus);

        final TextField laius = new TextField();
        laius.setPrefColumnCount(5);
        laius.setPromptText("Laius:");
        GridPane.setConstraints(laius, 3, 0);
        grid.getChildren().add(laius);

        Button submit = new Button("Submit");
        GridPane.setConstraints(submit, 4, 0);
        grid.getChildren().add(submit);


        final Label label = new Label();
        GridPane.setConstraints(label, 0, 3);
        GridPane.setColumnSpan(label, 2);
        grid.getChildren().add(label);
        //Circle ring = new Circle(0);
        Rectangle ristkulik = new Rectangle(0, 0, 0, 0);

        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                if (
                        (laius.getText() != null && !laius.getText().isEmpty() && korgus.getText() != null && !korgus.getText().isEmpty() && xArg.getText() != null && !xArg.getText().isEmpty() && yArg.getText() != null && !yArg.getText().isEmpty())
                        ) {

                    ristkulik.setWidth(Integer.parseInt(laius.getText()));//laius tekst konverteerime integeriks ja siis omistame riskuliku laiusele
                    ristkulik.setHeight(Integer.parseInt(korgus.getText()));
                    ristkulik.setTranslateX(Integer.parseInt(xArg.getText()));
                    ristkulik.setTranslateY(Integer.parseInt(yArg.getText()));
                    GridPane.setConstraints(ristkulik, 0, 1); //null veerus reas 1 loome ristkülik
                    grid.getChildren().add(ristkulik);//joonistab välja
                    label.setText("");

                    stage.show();

                } else {
                    label.setText("Please fill all the fields!"); //kui mingi field on tühi, siis ilmub teade
                    ristkulik.setWidth(0); //laius 0
                    ristkulik.setHeight(0);//korgus 0
                }
            }
        });



        stage.show();
    }

}


