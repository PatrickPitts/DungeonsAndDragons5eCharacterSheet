package org.nerdcore.dungeonsanddragons5echaractersheet;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.json.JSONArray;
import org.json.JSONObject;
import org.nerdcore.dungeonsanddragons5echaractersheet.service.IOServices;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ApplicationViewerController implements Initializable {

    private static JSONArray allSpellsJSONArray;
    public VBox characterSheet;

    @FXML
    private MenuBar applicationMenuBar;
    @FXML
    private BaseCharacterSheetController baseCharacterSheetController;
    @FXML
    private SpellsSheetController spellsSheetController;

    @FXML
    protected void onSave() {
        JSONObject characterSheetObject = new JSONObject();
        baseCharacterSheetController.onSave(characterSheetObject);
        //TODO: Spell Sheet characterSheetObject save
        IOServices.writeBaseCharacterJSONObjectToFile(characterSheetObject, applicationMenuBar);
    }

    @FXML
    protected void onLoad() {
        JSONObject characterSheetObject = IOServices.getCharacterJSONObjectFromFile(applicationMenuBar);

        baseCharacterSheetController.onLoad(characterSheetObject);
        //TODO: Spell Sheet implementation

    }

    @FXML
    protected void openFeatureBuilderView() {
        try {
            Parent root = FXMLLoader.load(CharacterSheetApplication.class.getResource("feature-builder.fxml"));

            Stage stage = new Stage();
            stage.setTitle("Add Features to Application");
            stage.setScene(new Scene(root, 950, 800));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void alert() {
        baseCharacterSheetController.alert();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        allSpellsJSONArray = IOServices.getAllSpellsJSONArray();
        spellsSheetController.setAllSpells(allSpellsJSONArray);
    }
}
