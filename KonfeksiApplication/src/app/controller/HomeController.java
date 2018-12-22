package app.controller;

import com.jfoenix.controls.JFXButton;
import com.sun.org.apache.bcel.internal.generic.NEW;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {

    @FXML
    private JFXButton btnHome;

    @FXML
    private JFXButton btnInput;

    @FXML
    private JFXButton btnStatus;

    @FXML
    private JFXButton btnLaporan;

    @FXML
    private JFXButton btnSablon;

    @FXML
    private JFXButton btnBahan;

    @FXML
    private JFXButton btnUser;

    @FXML
    private JFXButton btnTentang;

    @FXML
    private AnchorPane pnHome;

    @FXML
    private AnchorPane pnInput;

    @FXML
    private AnchorPane pnStatus;

    @FXML
    private AnchorPane pnUser;

    @FXML
    private AnchorPane pnTentang;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    public void handleClick(ActionEvent actionEvent) {
        if (actionEvent.getSource() == btnHome) {
            pnHome.toFront();
        }
        if (actionEvent.getSource() == btnInput) {
            pnInput.toFront();
        }
        if (actionEvent.getSource() == btnUser) {
            pnUser.toFront();
        }
        if (actionEvent.getSource() == btnTentang) {
            pnTentang.toFront();
        }

    }


    public void logout(MouseEvent mouseEvent) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/app/view/login.fxml"));
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.centerOnScreen();
    }


    double x=0,y=0;
    public void dragged(MouseEvent mouseEvent) {
        Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.setX(mouseEvent.getScreenX() - x);
        stage.setY(mouseEvent.getScreenY()- y);
    }

    public void pressed(MouseEvent mouseEvent) {
        x=mouseEvent.getSceneX();
        y=mouseEvent.getSceneY();
    }



}
