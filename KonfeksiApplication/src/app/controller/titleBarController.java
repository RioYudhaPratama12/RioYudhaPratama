package app.controller;

import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;

public class titleBarController implements Initializable
{


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void min(MouseEvent mouseEvent) {
        Node node= (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setIconified(true);

    }

    public void max(MouseEvent mouseEvent) {
        Node node= (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setFullScreen(true);
    }

    public void close(MouseEvent mouseEvent) {
        Node node= (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();
    }
}
