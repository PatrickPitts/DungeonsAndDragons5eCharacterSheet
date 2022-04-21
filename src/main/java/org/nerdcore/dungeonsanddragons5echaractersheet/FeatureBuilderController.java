package org.nerdcore.dungeonsanddragons5echaractersheet;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.web.HTMLEditor;
import org.json.JSONObject;
import org.nerdcore.dungeonsanddragons5echaractersheet.model.AbilityFeature;
import org.nerdcore.dungeonsanddragons5echaractersheet.model.ChoiceFeature;
import org.nerdcore.dungeonsanddragons5echaractersheet.model.Feature;
import org.nerdcore.dungeonsanddragons5echaractersheet.model.FeatureAggregate;
import org.nerdcore.dungeonsanddragons5echaractersheet.service.IOServices;
import org.nerdcore.dungeonsanddragons5echaractersheet.service.JSONFactory;

public class FeatureBuilderController implements Initializable {

    @FXML
    private RadioButton abilityFeatureRadioButton;

    @FXML
    private Button addPrerequisiteButton;

    @FXML
    private RadioButton aggregateFeatureRadioButton;

    @FXML
    private RadioButton basicFeatureRadioButton;

    @FXML
    private RadioButton choiceFeatureRadioButton;

    @FXML
    private Button editFeatureButton;

    @FXML
    private ChoiceBox<?> featureCollectionChooseChoiceBox;

    @FXML
    private ListView<?> featureCollectionListView;

    @FXML
    private HTMLEditor featureHTMLEditor;

    @FXML
    private TextField featureNameTextField;

    @FXML
    private Button featureTagAddButton;

    @FXML
    private ListView<?> featureTagListVIew;

    @FXML
    private TextField featureTagTextField;

    @FXML
    private RadioButton modifierFeatureRadioButton;

    @FXML
    private CheckBox prerequisiteCheckBox;

    @FXML
    private ListView<?> prerequisiteListView;

    @FXML
    private Button submitFeatureButton;

    private ToggleGroup featureTypeToggleGroup;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        featureTypeToggleGroup = new ToggleGroup();

        abilityFeatureRadioButton.setToggleGroup(featureTypeToggleGroup);
        aggregateFeatureRadioButton.setToggleGroup(featureTypeToggleGroup);
        basicFeatureRadioButton.setToggleGroup(featureTypeToggleGroup);
        choiceFeatureRadioButton.setToggleGroup(featureTypeToggleGroup);
        modifierFeatureRadioButton.setToggleGroup(featureTypeToggleGroup);

        basicFeatureRadioButton.setSelected(true);

        submitFeatureButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                JSONObject obj;
                if(featureTypeToggleGroup.getSelectedToggle().equals(abilityFeatureRadioButton)){
                    obj = JSONFactory.getEmptyFeature(new AbilityFeature("", "", null));
                } else if (featureTypeToggleGroup.getSelectedToggle().equals(aggregateFeatureRadioButton)){
                    obj = JSONFactory.getEmptyFeature(new FeatureAggregate("", ""));
                } else if (featureTypeToggleGroup.getSelectedToggle().equals(modifierFeatureRadioButton)){
                    obj = JSONFactory.getEmptyFeature(new ChoiceFeature("", ""));
                } else {
                    obj = JSONFactory.getEmptyFeature(new Feature("", ""));
                }

                obj.put("text", featureHTMLEditor.getHtmlText());
                obj.put("name", featureNameTextField.getText());
                for(Object s : featureTagListVIew.getItems()){
                    String tag = (String) s;
                    obj.getJSONArray("tags").put(tag);
                }
                IOServices.writeFeatureJSONObjectToFile(obj);
            }
        });

        featureTypeToggleGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> observableValue, Toggle oldVal, Toggle newVal) {
                 if(newVal.equals(basicFeatureRadioButton)){
                    featureCollectionListView.setDisable(true);
                    featureCollectionChooseChoiceBox.setDisable(true);
                } else {
                    if(newVal.equals(modifierFeatureRadioButton)){
                        //TODO update what goes in featureCollectionListView
                        System.out.println("Modifier Feature Selected");
                    } else if(newVal.equals(abilityFeatureRadioButton)){
                        //TODO update what goes in featureCollectionListView
                        System.out.println("Ability Feature Selected");
                    }
                     featureCollectionListView.setDisable(false);
                     featureCollectionChooseChoiceBox.setDisable(false);
                }
            }
        });

    }
}
