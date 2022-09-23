import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ViewMonthlyFormController {
    public void backIncomeReportsOnAcction(ActionEvent actionEvent) {
    }

    public void submitOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("IncomeReports.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
