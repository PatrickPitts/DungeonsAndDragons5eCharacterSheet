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
import org.nerdcore.dungeonsanddragons5echaractersheet.service.StringProcessingService;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
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
    @FXML
    public Label spellSourceBookLabel;

    protected void setSpellDescriptionText(String spellName){
        spellDescriptionWebView.getEngine().loadContent("");
        for(Object obj : allSpells){
            JSONObject j = (JSONObject) obj;
            if(j.get("spellName").equals(spellName)){
                spellDescriptionWebView.getEngine().loadContent(j.getString("description"));
                spellNameLabel.setText(j.getString("spellName"));
                List<String> components = new ArrayList<>();
                if(j.getBoolean("verbalComponent")){
                    components.add("V");
                }
                if(j.getBoolean("somaticComponent")){
                    components.add("S");
                }
                String materials = j.getString("materialComponents");
                if(!materials.equals("None")){
                    components.add(String.format("M (%s)", materials));
                }
                spellComponentsLabel.setText(String.join(", ", components));
                spellRangeLabel.setText(j.getString("range"));
                spellDurationLabel.setText(j.getString("duration"));
                spellCastingTimeLabel.setText(j.getString("castingTime"));
                int spellLevel = j.getInt("spellLevel");
                String spellSchool = j.getString("school");
                String spellLevelSchoolText;
                if(spellLevel == 0){
                    spellLevelSchoolText = String.format("%s cantrip", spellSchool);
                    spellLevelSchoolText = spellLevelSchoolText.substring(0, 1).toUpperCase() + spellLevelSchoolText.substring(1).toLowerCase();
                } else {
                    spellLevelSchoolText=String.format("%s-level %s", StringProcessingService.getOrdinal(spellLevel), spellSchool);
                }
                spellLevelSchoolLabel.setText(spellLevelSchoolText);
                spellSourceBookLabel.setText(j.getString("source"));
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
