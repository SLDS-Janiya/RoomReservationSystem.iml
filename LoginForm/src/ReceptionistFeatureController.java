import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ReceptionistFeatureController {
    public void reserveARoomOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("ReserveARoom.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

    }

    public void marksRoomsInMaintance(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("MarkRoomsInMaintenance.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
