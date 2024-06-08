package com.example.projek_musem;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuPengunjung extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MenuPengunjung.class.getResource("pengunjung.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), -1, -1);
        stage.setMaximized(true);
        stage.setTitle("Welcome to EMu!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}