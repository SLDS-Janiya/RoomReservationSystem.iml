import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AddNewRoomFormController {


    public void menuButtonOnAction(ActionEvent actionEvent) {
        MenuButton menuButton = new MenuButton("Select Room Type");
        MenuButton singleRoom = new MenuButton("Single Room");
        MenuButton doubleRoom = new MenuButton("Double Room");
        MenuButton tripleRoom = new MenuButton("Triple Room");
        MenuButton quadRoom = new MenuButton("Quad Room");

        menuButton.getItems();


    }

    public void addNewRoomOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("SuccesFullyAddNewRoom.fxml");
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
