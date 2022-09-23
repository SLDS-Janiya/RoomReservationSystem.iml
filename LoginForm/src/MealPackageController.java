import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sun.nio.cs.ext.ISO2022_CN_CNS;

import java.io.IOException;
import java.net.URL;

public class MealPackageController {
    public void addNewMealPackageOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("AddNewMealPackage.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void deleteMealPackageOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("DeleteMealPackage.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void modifyMealPackageOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("ModifyMealPackage.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

    }
}
