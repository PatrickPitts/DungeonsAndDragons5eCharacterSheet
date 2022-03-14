package org.nerdcore.dungeonsanddragons5echaractersheet;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Screen;
import javafx.stage.Stage;
import org.nerdcore.dungeonsanddragons5echaractersheet.service.UIListPopulationService;


import java.io.IOException;

public class CharacterSheetApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CharacterSheetApplication.class.getResource("character-sheet.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), Screen.getPrimary().getBounds().getWidth()-75 , Screen.getPrimary().getBounds().getHeight()-75);

        stage.setTitle("Hello!");
        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}