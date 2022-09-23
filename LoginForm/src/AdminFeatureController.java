import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.stage.Stage;

import javax.net.ssl.SSLContextSpi;
import java.io.IOException;
import java.net.URL;

public class AdminFeatureController {

    public void roomsOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("Rooms.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void mealOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("MealPackage.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void incomeReportsOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("IncomeReports.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void backadminLoginOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("AdminLoginForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
