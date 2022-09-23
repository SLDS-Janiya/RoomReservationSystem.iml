import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class IncomeReportsController {
    public void viewMonthlyOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("ViewMonthlyForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

    }

    public void viewAnnuallyOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("ViewAnnuallyForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

    }

    public void backAdminFutureOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("AdminFeature.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

    }
}
