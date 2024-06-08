package com.example.projek_musem;

import javafx.animation.FadeTransition;
import javafx.animation.FillTransition;
import javafx.animation.SequentialTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.Objects;

public class pengunjungController {

    @FXML
    public AnchorPane main;
    @FXML
    private ProgressBar Bar;

    @FXML
    private ImageView BG;
    @FXML
    private ImageView BGCreatePengunjung;
    @FXML
    private Label welcomeText;
    @FXML
    private AnchorPane sceneKedua;
    @FXML
    private TextField password;
    @FXML
    private Label signIn;
    private Stage stag;
    private Scene Scen;


    @FXML
    protected void click() {
        showMessage("This is a message box");
    }

    @FXML
    private void createAccount(MouseEvent event) throws IOException {
//        showMessage("Create your account");
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("CRUDpengunjung.fxml")));
        stag = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scen = new Scene(root);
        stag.setScene(Scen);
        stag.show();

        SequentialTransition sequentialTransition = new SequentialTransition();
        sequentialTransition.setNode(main);
        sequentialTransition.play();
//        FillTransition fill = new FillTransition();
//        FadeTransition fade = new FadeTransition();
//        fade.setDuration(Duration.millis(600));
//        fade.setNode(root);
//        fill.setFromValue(Color.BLACK);
//        fill.setToValue(Color.GRAY);
//        fade.setFromValue(0.7);
//        fade.setToValue(1.0);
//        fade.play();

    }

    @FXML
    private void SIGNIN() {
        signIn.setUnderline(true);
    }

    @FXML
    private void showMessage(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setWidth(50);
        alert.setHeight(50);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    private void exitToVisitorLogin(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("pengunjung.fxml")));
        stag = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scen = new Scene(root);
        stag.setScene(Scen);
        stag.show();

        FadeTransition fade = new FadeTransition();
        fade.setDuration(Duration.millis(600));
        fade.setNode(root);
        fade.setFromValue(0.7);
        fade.setToValue(1.0);
        fade.play();
    }
}