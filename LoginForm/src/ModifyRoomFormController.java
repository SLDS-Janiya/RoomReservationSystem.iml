import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ModifyRoomFormController {
    public void backRoomOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("Rooms.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

    }

    public void chooseYourSelectionOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("chooseYourSelection.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

    }
}
