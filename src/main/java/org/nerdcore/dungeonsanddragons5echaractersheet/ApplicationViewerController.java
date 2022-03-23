package org.nerdcore.dungeonsanddragons5echaractersheet;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.VBox;
import org.json.JSONArray;
import org.json.JSONObject;
import org.nerdcore.dungeonsanddragons5echaractersheet.service.IOServices;

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
    protected void alert() {
        baseCharacterSheetController.alert();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        allSpellsJSONArray = IOServices.getAllSpellsJSONArray();
        spellsSheetController.setAllSpells(allSpellsJSONArray);
    }
}
