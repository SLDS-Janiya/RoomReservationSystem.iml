import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ModifyMealPackageController {
    public void chooseYourSelectionMealPackageOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("ModifySuccessFull.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void backMealPackageOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("MealPackage.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
