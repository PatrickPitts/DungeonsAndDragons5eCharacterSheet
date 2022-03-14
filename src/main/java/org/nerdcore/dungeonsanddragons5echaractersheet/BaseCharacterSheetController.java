package org.nerdcore.dungeonsanddragons5echaractersheet;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import org.json.*;
import org.nerdcore.dungeonsanddragons5echaractersheet.service.UIListPopulationService;

import java.net.URL;
import java.util.ResourceBundle;


public class BaseCharacterSheetController implements Initializable {

    @FXML
    private TextField acrobaticsSkillBonusTextField;

    @FXML
    private RadioButton acrobaticsSkillProficiencyRadioButton;

    @FXML
    private ChoiceBox<String> alignmentChoiceBox;

    @FXML
    private TextField animalHandlingSkillBonusTextField;

    @FXML
    private RadioButton animalHandlingSkillProficiencyRadioButton;

    @FXML
    private TextField arcanaSkillBonusTextField;

    @FXML
    private RadioButton arcanaSkillProficiencyRadioButton;

    @FXML
    private TextField armorClassTextField;

    @FXML
    private TextField athleticsSkillBonusTextField;

    @FXML
    private RadioButton athleticsSkillProficiencyRadioButton;

    @FXML
    private TextField attack1AtkBonusTextField;

    @FXML
    private TextField attack1DamageTypeTextField;

    @FXML
    private TextField attack1NameTextField;

    @FXML
    private TextField attack2AtkBonusTextField;

    @FXML
    private TextField attack2DamageTypeTextField;

    @FXML
    private TextField attack2NameTextField;

    @FXML
    private TextField attack3AtkBonusTextField;

    @FXML
    private TextField attack3DamageTypeTextField;

    @FXML
    private TextField attack3NameTextField;

    @FXML
    private TextArea attacksAndSpellcastingTextArea;

    @FXML
    private TextField backgroundTextField;

    @FXML
    private TextArea bondsTextArea;

    @FXML
    private TextField characterNameTextField;

    @FXML
    private TextField charismaBonusTextField;

    @FXML
    private TextField charismaSaveBonusTextField;

    @FXML
    private RadioButton charismaSaveProficiencyRadioButton;

    @FXML
    private TextField charismaTextField;

    @FXML
    private TextField classLevelTextArea;

    @FXML
    private TextField constitutionBonusTextField;

    @FXML
    private RadioButton constitutionSaveProficiencyRadioButton;

    @FXML
    private TextField constitutionTextField;

    @FXML
    private TextField constiutionSaveBonusTextField;

    @FXML
    private TextField cpTextField;

    @FXML
    private RadioButton deathSaveFailure1RadioButton;

    @FXML
    private RadioButton deathSaveFailure2RadioButton;

    @FXML
    private RadioButton deathSaveFailure3RadioButton;

    @FXML
    private RadioButton deathSaveSuccess1RadioButton;

    @FXML
    private RadioButton deathSaveSuccess2RadioButton;

    @FXML
    private RadioButton deathSaveSuccess3RadioButton;

    @FXML
    private TextField deceptionSkillBonusTextField;

    @FXML
    private RadioButton deceptionSkillProficiencyRadioButton;

    @FXML
    private TextField dexterityBonusTextField;

    @FXML
    private TextField dexteritySaveBonusTextField;

    @FXML
    private RadioButton dexteritySaveProficiencyRadioButton;

    @FXML
    private TextField dexterityTextField;

    @FXML
    private TextField epTextField;

    @FXML
    private TextArea equipmentTextArea;

    @FXML
    private TextField expTextField;

    @FXML
    private TextArea featuresTextArea;

    @FXML
    private TextArea flawsTextArea;

    @FXML
    private TextField gpTextField;

    @FXML
    private TextField historySkillBonusTextField;

    @FXML
    private RadioButton historySkillProficiencyRadioButton;

    @FXML
    private TextArea hitDiceTextArea;

    @FXML
    private TextArea hpCurrentTextArea;

    @FXML
    private TextField hpMaximumTextField;

    @FXML
    private TextArea hpTemporaryTextArea;

    @FXML
    private TextArea idealsTextArea;

    @FXML
    private TextField initiativeTextField;

    @FXML
    private TextField insightSkillBonusTextField;

    @FXML
    private RadioButton insightSkillProficiencyRadioButton;

    @FXML
    private TextField inspirationTextField;

    @FXML
    private TextField intelligenceBonusTextArea;

    @FXML
    private TextField intelligenceSaveBonusTextField;

    @FXML
    private RadioButton intelligenceSaveProficiencyRadioButton;

    @FXML
    private TextField intelligenceTextField;

    @FXML
    private TextField intimidationSkillBonusTextField;

    @FXML
    private RadioButton intimidationSkillProficiencyRadioButton;

    @FXML
    private TextField investigationSkillBonusTextField;

    @FXML
    private RadioButton investigationSkillProficiencyRadioButton;

    @FXML
    private TextField medicineSkillBonusTextField;

    @FXML
    private RadioButton medicineSkillProficiencyRadioButton;

    @FXML
    private TextField natureSkillBonusTextField;

    @FXML
    private RadioButton natureSkillProficiencyRadioButton;

    @FXML
    private TextField passiveWisdomTextField;

    @FXML
    private TextField perceptionSkillBonusTextField;

    @FXML
    private RadioButton perceptionSkillProficiencyRadioButton;

    @FXML
    private TextField performanceSkillBonusTextField;

    @FXML
    private RadioButton performanceSkillProficiencyRadioButton;

    @FXML
    private TextArea personalityTextArea;

    @FXML
    private TextField persuasionSkillBonusTextField;

    @FXML
    private RadioButton persuasionSkillProficiencyRadioButton;

    @FXML
    private TextField playerNameTextField;

    @FXML
    private TextField ppTextField;

    @FXML
    private TextArea profAndLanguagesTextArea;

    @FXML
    private TextField proficiencyBonusTextField;

    @FXML
    private ComboBox<String> raceComboBox;

    @FXML
    private TextField religionSkillBonusTextField;

    @FXML
    private RadioButton religionSkillProficiencyRadioButton;

    @FXML
    private TextField sleightOfHandSkillBonusTextField;

    @FXML
    private RadioButton sleightOfHandSkillProficiencyRadioButton;

    @FXML
    private TextField spTextField;

    @FXML
    private TextField speedTextField;

    @FXML
    private TextField stealthSkillBonusTextField;

    @FXML
    private RadioButton stealthSkillProficiencyRadioButton;

    @FXML
    private TextField strengthBonusTextField;

    @FXML
    private TextField strengthSaveBonusTextField;

    @FXML
    private RadioButton strengthSaveProficiencyRadioButton;

    @FXML
    private TextField strengthTextField;

    @FXML
    private TextField survivalSkillBonusTextField;

    @FXML
    private RadioButton survivalSkillProficiencyRadioButton;

    @FXML
    private TextField totalHitDiceTextField;

    @FXML
    private TextField wisdomBonusTextField;

    @FXML
    private TextField wisdomSaveBonusTextField;

    @FXML
    private RadioButton wisdomSaveProficiencyRadioButton;

    @FXML
    private TextField wisdomTextField;

    @FXML
    protected void onSave(){
        JSONObject characterSheetObject = new JSONObject();

        characterSheetObject.put("Character Name", characterNameTextField.getText());
        characterSheetObject.put("Class Level", classLevelTextArea.getText());
        characterSheetObject.put("Background", backgroundTextField.getText());
        characterSheetObject.put("Player Name", playerNameTextField.getText());
        characterSheetObject.put("Experience Points", expTextField.getText());
        characterSheetObject.put("Alignment", alignmentChoiceBox.getValue().toString());
        characterSheetObject.put("Race", raceComboBox.getValue().toString());

        JSONObject combatObject = new JSONObject();
        combatObject.put("Armor Class", armorClassTextField.getText());
        combatObject.put("Initiative", initiativeTextField.getText());
        combatObject.put("Speed", speedTextField.getText());
        combatObject.put("Max Hit Points", hpMaximumTextField.getText());
        combatObject.put("Current Hit Points", hpCurrentTextArea.getText());
        combatObject.put("Temporary Hit Points", hpTemporaryTextArea.getText());
        combatObject.put("Hit Dice", hitDiceTextArea.getText());
        combatObject.put("Total Hit Dice", totalHitDiceTextField.getText());

        combatObject.put("Death Save Successes",
                (deathSaveSuccess1RadioButton.isSelected() ? 1 : 0)
                        + (deathSaveSuccess2RadioButton.isSelected() ? 1 : 0)
                        + (deathSaveSuccess3RadioButton.isSelected() ? 1 : 0));

        combatObject.put("Death Save Failures",
                (deathSaveFailure1RadioButton.isSelected() ? 1 : 0)
                        + (deathSaveFailure2RadioButton.isSelected() ? 1 : 0)
                        + (deathSaveFailure3RadioButton.isSelected() ? 1 : 0));

        characterSheetObject.put("Core Combat", combatObject);

        JSONObject savingThrowsObject = new JSONObject();

        JSONObject j = new JSONObject();
        j.put("Bonus", strengthSaveBonusTextField.getText());
        j.put("Proficiency", strengthSaveProficiencyRadioButton.isSelected());
        savingThrowsObject.put("Strength", j);

        j = new JSONObject();
        j.put("Bonus", dexteritySaveBonusTextField.getText());
        j.put("Proficiency", dexteritySaveProficiencyRadioButton.isSelected());
        savingThrowsObject.put("Dexterity", j);

        j = new JSONObject();
        j.put("Bonus", constiutionSaveBonusTextField.getText());
        j.put("Proficiency", constitutionSaveProficiencyRadioButton.isSelected());
        savingThrowsObject.put("Constitution", j);

        j = new JSONObject();
        j.put("Bonus", intelligenceSaveBonusTextField.getText());
        j.put("Proficiency", intelligenceSaveProficiencyRadioButton.isSelected());
        savingThrowsObject.put("Intelligence", j);

        j = new JSONObject();
        j.put("Bonus", wisdomSaveBonusTextField.getText());
        j.put("Proficiency", wisdomSaveProficiencyRadioButton.isSelected());
        savingThrowsObject.put("Wisdom", j);

        j = new JSONObject();
        j.put("Bonus", charismaSaveBonusTextField.getText());
        j.put("Proficiency", charismaSaveProficiencyRadioButton.isSelected());
        savingThrowsObject.put("Charisma", j);

        characterSheetObject.put("Saving Throws", savingThrowsObject);

        JSONObject coreStats = new JSONObject();
        coreStats.put("Strength", strengthTextField.getText());
        coreStats.put("Dexterity", dexterityTextField.getText());
        coreStats.put("Constitution", constitutionTextField.getText());
        coreStats.put("Intelligence", intelligenceTextField.getText());
        coreStats.put("Wisdom", wisdomTextField.getText());
        coreStats.put("Charisma", charismaTextField.getText());
        characterSheetObject.put("Core Stats", coreStats);

        JSONObject skillsObject = new JSONObject();

        j = new JSONObject();
        j.put("Bonus", acrobaticsSkillBonusTextField.getText());
        j.put("Proficiency", acrobaticsSkillProficiencyRadioButton.isSelected());
        skillsObject.put("Acrobatics", j);

        j = new JSONObject();
        j.put("Bonus", animalHandlingSkillBonusTextField.getText());
        j.put("Proficiency", animalHandlingSkillProficiencyRadioButton.isSelected());
        skillsObject.put("Animal Handling", j);

        j = new JSONObject();
        j.put("Bonus", arcanaSkillBonusTextField.getText());
        j.put("Proficiency", arcanaSkillProficiencyRadioButton.isSelected());
        skillsObject.put("Arcana", j);

        j = new JSONObject();
        j.put("Bonus", athleticsSkillBonusTextField.getText());
        j.put("Proficiency", athleticsSkillProficiencyRadioButton.isSelected());
        skillsObject.put("Athletics", j);

        j = new JSONObject();
        j.put("Bonus", deceptionSkillBonusTextField.getText());
        j.put("Proficiency", deceptionSkillProficiencyRadioButton.isSelected());
        skillsObject.put("Deception", j);

        j = new JSONObject();
        j.put("Bonus", historySkillBonusTextField.getText());
        j.put("Proficiency", historySkillProficiencyRadioButton.isSelected());
        skillsObject.put("History", j);

        j = new JSONObject();
        j.put("Bonus", insightSkillBonusTextField.getText());
        j.put("Proficiency", insightSkillProficiencyRadioButton.isSelected());
        skillsObject.put("Insight", j);

        j = new JSONObject();
        j.put("Bonus", intimidationSkillBonusTextField.getText());
        j.put("Proficiency", intimidationSkillProficiencyRadioButton.isSelected());
        skillsObject.put("Intimidation", j);

        j = new JSONObject();
        j.put("Bonus", investigationSkillBonusTextField.getText());
        j.put("Proficiency", investigationSkillProficiencyRadioButton.isSelected());
        skillsObject.put("Investigation", j);

        j = new JSONObject();
        j.put("Bonus", medicineSkillBonusTextField.getText());
        j.put("Proficiency", medicineSkillProficiencyRadioButton.isSelected());
        skillsObject.put("Medicine", j);

        j = new JSONObject();
        j.put("Bonus", natureSkillBonusTextField.getText());
        j.put("Proficiency", natureSkillProficiencyRadioButton.isSelected());
        skillsObject.put("Nature", j);

        j = new JSONObject();
        j.put("Bonus", perceptionSkillBonusTextField.getText());
        j.put("Proficiency", perceptionSkillProficiencyRadioButton.isSelected());
        skillsObject.put("Perception", j);

        j = new JSONObject();
        j.put("Bonus", performanceSkillBonusTextField.getText());
        j.put("Proficiency", performanceSkillProficiencyRadioButton.isSelected());
        skillsObject.put("Performance", j);

        j = new JSONObject();
        j.put("Bonus", persuasionSkillBonusTextField.getText());
        j.put("Proficiency", persuasionSkillProficiencyRadioButton.isSelected());
        skillsObject.put("Persuasion", j);

        j = new JSONObject();
        j.put("Bonus", religionSkillBonusTextField.getText());
        j.put("Proficiency", religionSkillProficiencyRadioButton.isSelected());
        skillsObject.put("Religion", j);

        j = new JSONObject();
        j.put("Bonus", sleightOfHandSkillBonusTextField.getText());
        j.put("Proficiency", sleightOfHandSkillProficiencyRadioButton.isSelected());
        skillsObject.put("Sleight of Hand", j);

        j = new JSONObject();
        j.put("Bonus", stealthSkillBonusTextField.getText());
        j.put("Proficiency", stealthSkillProficiencyRadioButton.isSelected());
        skillsObject.put("Stealth", j);

        j = new JSONObject();
        j.put("Bonus", survivalSkillBonusTextField.getText());
        j.put("Proficiency", survivalSkillProficiencyRadioButton.isSelected());
        skillsObject.put("Survival", j);

        characterSheetObject.put("Skills", skillsObject);

        characterSheetObject.put("Other Proficiencies", profAndLanguagesTextArea.getText());

        JSONObject equipmentObject = new JSONObject();
        equipmentObject.put("CP", cpTextField.getText());
        equipmentObject.put("SP", spTextField.getText());
        equipmentObject.put("EP", epTextField.getText());
        equipmentObject.put("GP", gpTextField.getText());
        equipmentObject.put("PP", ppTextField.getText());
        equipmentObject.put("Equipment", equipmentTextArea.getText());

        JSONObject personalityObject = new JSONObject();
        personalityObject.put("Personality Traits", personalityTextArea.getText());
        personalityObject.put("Ideals", idealsTextArea.getText());
        personalityObject.put("Bonds", bondsTextArea.getText());
        personalityObject.put("Flaws", flawsTextArea.getText());

        characterSheetObject.put("Inventory", equipmentObject);

        System.out.println(characterSheetObject.toString(1));

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        raceComboBox.getItems().addAll(UIListPopulationService.getRaceList());
        raceComboBox.getSelectionModel().selectFirst();
        alignmentChoiceBox.getItems().addAll(UIListPopulationService.getAlignmentList());
        alignmentChoiceBox.getSelectionModel().selectFirst();
    }
}
