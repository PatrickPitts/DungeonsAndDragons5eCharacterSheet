package org.nerdcore.dungeonsanddragons5echaractersheet;

import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.VBox;
import org.json.JSONObject;
import org.nerdcore.dungeonsanddragons5echaractersheet.service.IOServices;

public class ApplicationViewerController {

    public VBox characterSheet;

    @FXML
    private MenuBar applicationMenuBar;
    @FXML
    private BaseCharacterSheetController baseCharacterSheetController;

    @FXML
    protected void onSave() {
        JSONObject characterSheetObject = new JSONObject();
        baseCharacterSheetController.onSave(characterSheetObject);
        //TODO: Spell Sheet characterSheetObject save

        IOServices.writeBaseCharacterJSONObjectToFile(characterSheetObject, applicationMenuBar);


    }

    @FXML
    protected void onLoad() {
        JSONObject characterSheetObject = IOServices.getJSONObjectFromFile(applicationMenuBar);

        baseCharacterSheetController.onLoad(characterSheetObject);
        //TODO: Spell Sheet implementation

    }

    @FXML
    protected void alert() {
        baseCharacterSheetController.alert();
    }
}
