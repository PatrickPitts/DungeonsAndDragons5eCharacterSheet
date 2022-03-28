package org.nerdcore.dungeonsanddragons5echaractersheet;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.scene.web.WebView;
import org.json.JSONArray;
import org.json.JSONObject;
import org.nerdcore.dungeonsanddragons5echaractersheet.service.IOServices;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class SpellsSheetController implements Initializable {

    private static JSONArray allSpells;

    @FXML
    public ListView cantripListView;
    @FXML
    public ListView firstLevelListView;
    @FXML
    public ListView secondLevelListView;
    @FXML
    public ListView thirdLevelListView;
    @FXML
    public ListView fourthLevelListView;
    @FXML
    public ListView fifthLevelListView;
    @FXML
    public ListView sixthLevelListView;
    @FXML
    public ListView seventhLevelListView;
    @FXML
    public ListView eighthLevelListView;
    @FXML
    public ListView ninthLevelListView;
    @FXML
    public WebView spellDescriptionWebView;
    @FXML
    public Label spellNameLabel;
    @FXML
    public Label spellLevelSchoolLabel;
    @FXML
    public Label spellCastingTimeLabel;
    @FXML
    public Label spellRangeLabel;
    @FXML
    public Label spellTargetLabel;
    @FXML
    public Label spellComponentsLabel;
    @FXML
    public Label spellDurationLabel;
    @FXML
    public Label spellClassesLabel;

    protected void setSpellDescriptionText(String spellName){
        spellDescriptionWebView.getEngine().loadContent("");
        for(Object obj : allSpells){
            JSONObject j = (JSONObject) obj;
            if(j.get("spellName").equals(spellName)){
                spellDescriptionWebView.getEngine().loadContent(j.getString("description"));


                break;
            }
        }
    }

    public void setAllSpells(JSONArray spells){
        allSpells = spells;
        ListView target;
        allSpells = IOServices.getAllSpellsJSONArray();
        assert allSpells != null;
        for(Object o : allSpells){
            JSONObject spellObj = (JSONObject) o;
            target = switch (spellObj.getInt("spellLevel")) {
                case 0 -> cantripListView;
                case 1 -> firstLevelListView;
                case 2 -> secondLevelListView;
                case 3 -> thirdLevelListView;
                case 4 -> fourthLevelListView;
                case 5 -> fifthLevelListView;
                case 6 -> sixthLevelListView;
                case 7 -> seventhLevelListView;
                case 8 -> eighthLevelListView;
                case 9 -> ninthLevelListView;
                default -> new ListView();
            };
            Label l = new Label(spellObj.getString("spellName"));
            l.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    Label source = (Label) mouseEvent.getSource();
                    setSpellDescriptionText(source.getText());
                }
            });
            target.getItems().add(l);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        List<ListView> listViews = new ArrayList<>();
        listViews.add(cantripListView);
        listViews.add(firstLevelListView);
        listViews.add(secondLevelListView);
        listViews.add(thirdLevelListView);
        listViews.add(fourthLevelListView);
        listViews.add(fifthLevelListView);
        listViews.add(sixthLevelListView);
        listViews.add(seventhLevelListView);
        listViews.add(eighthLevelListView);
        listViews.add(ninthLevelListView);
        for(ListView lv : listViews){
            lv.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
                @Override
                public void changed(ObservableValue observableValue, Object oldVal, Object newVal) {
                    setSpellDescriptionText(((Label) newVal).getText());
                }
            });
        }
    }
}
