import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class RoomsController {
    public void addNewRoomOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("AddNewRoomForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void deleteRoomOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("DeleteRoomForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void modifyRoomOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("ModifyRoomForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void backAdminFeatureOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("AdminFeature.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
