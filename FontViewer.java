//Name: Ayoub
//Purpose: learn JavaFX
import javafx.application.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.*;
public class FontViewer extends Application
{
   private Label sample;
   private RadioButton smallButton;
   private RadioButton largeButton;
   private ChoiceBox<String> fontChoice;
   public void start(Stage primaryStage)
   {
      Pane root = createRootPane();
      Scene scene1 = new Scene(root);
      primaryStage.setSCene(scene1);
      primaryStage.setTitle("Java FX FONT VIEWER");
      primaryStage.show();
      }
      private Pane createRootPane()
      {
         fontChoice = new ChoiceBox<>();
         fontChoice.getItems().addAll("Serif", "SansSerif", "Monospaced" );
         fontChoice.getSelectionModel().select("Serif");
         fontchoice.setOnAction(event -> updateSample());
         GridPane pane = new GridPane();
         sample = new Label("Big Java");
         pane.add(sample, 0, 0, 3, 1);
         pane.add(fontChoice, 2, 1);
         return pane;
         }
         private void updateSample()
         {
          int size = 15;
          String facename = fontChoice.getSelectionModel().getSelectedItem();
          FontWeight weight = FontWeight.BOLD;
          FontPosture posture = FontPosture.REGULAR;
          sample.setFont(Font.font(facename, weight, posture, size));

}
}