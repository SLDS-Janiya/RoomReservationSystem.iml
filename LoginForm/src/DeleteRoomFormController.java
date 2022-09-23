import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.print.DocFlavor;
import java.io.IOException;
import java.net.URL;

public class DeleteRoomFormController {
    public void deleteRoomOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("SuccessDelete.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

    }

    public void backRoomOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("Rooms.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
