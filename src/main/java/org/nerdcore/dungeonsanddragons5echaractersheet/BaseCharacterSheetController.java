package org.nerdcore.dungeonsanddragons5echaractersheet;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import org.json.*;
import org.nerdcore.dungeonsanddragons5echaractersheet.service.IOServices;
import org.nerdcore.dungeonsanddragons5echaractersheet.service.StringProcessingService;
import org.nerdcore.dungeonsanddragons5echaractersheet.service.UIListPopulationService;
import java.net.URL;
import java.util.ResourceBundle;

//TODO: Stat bonus and passive wisdom to be dynamically calculated based on core stat values

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
    private MenuBar primaryMenuBar;

    @FXML
    protected void onLoad(){
        JSONObject characterSheetObject = IOServices.getJSONObjectFromFile(primaryMenuBar);
        int numVal = 0;
        JSONObject j;

        //System.out.println(characterSheetObject.toString(4));
        JSONObject savingThrowsObject = characterSheetObject.getJSONObject("Saving Throws");
        strengthSaveBonusTextField.setText(
                String.valueOf(savingThrowsObject.getJSONObject("Strength").getString("Bonus"))
        );
        dexteritySaveBonusTextField.setText(
                String.valueOf(savingThrowsObject.getJSONObject("Dexterity").getString("Bonus"))
        );
        constiutionSaveBonusTextField.setText(
                String.valueOf(savingThrowsObject.getJSONObject("Constitution").getString("Bonus"))
        );
        intelligenceSaveBonusTextField.setText(
                String.valueOf(savingThrowsObject.getJSONObject("Intelligence").getString("Bonus"))
        );
        wisdomSaveBonusTextField.setText(
                String.valueOf(savingThrowsObject.getJSONObject("Wisdom").getString("Bonus"))
        );
        charismaSaveBonusTextField.setText(
                String.valueOf(savingThrowsObject.getJSONObject("Charisma").getString("Bonus"))
        );

        strengthSaveProficiencyRadioButton.setSelected(
                savingThrowsObject.getJSONObject("Strength").getBoolean("Proficiency")
        );
        dexteritySaveProficiencyRadioButton.setSelected(
                savingThrowsObject.getJSONObject("Dexterity").getBoolean("Proficiency")
        );
        constitutionSaveProficiencyRadioButton.setSelected(
                savingThrowsObject.getJSONObject("Constitution").getBoolean("Proficiency")
        );
        intelligenceSaveProficiencyRadioButton.setSelected(
                savingThrowsObject.getJSONObject("Intelligence").getBoolean("Proficiency")
        );
        wisdomSaveProficiencyRadioButton.setSelected(
                savingThrowsObject.getJSONObject("Wisdom").getBoolean("Proficiency")
        );
        charismaSaveProficiencyRadioButton.setSelected(
                savingThrowsObject.getJSONObject("Charisma").getBoolean("Proficiency")
        );


        JSONObject coreStatsObject = characterSheetObject.getJSONObject("Core Stats");
        numVal = coreStatsObject.getInt("Strength");
        strengthTextField.setText(String.valueOf(numVal));
        strengthBonusTextField.setText(
                (numVal>11?"+":"")+((numVal-10)/2)
        );
        numVal = coreStatsObject.getInt("Dexterity");
        dexterityTextField.setText(String.valueOf(numVal));
        dexterityBonusTextField.setText(
                (numVal>11?"+":"")+((numVal-10)/2)
        );
        numVal = coreStatsObject.getInt("Constitution");
        constitutionTextField.setText(String.valueOf(numVal));
        constitutionBonusTextField.setText(
                (numVal>11?"+":"")+((numVal-10)/2)
        );
        numVal = coreStatsObject.getInt("Intelligence");
        intelligenceTextField.setText(String.valueOf(numVal));
        intelligenceBonusTextArea.setText(
                (numVal>11?"+":"")+((numVal-10)/2)
        );
        numVal = coreStatsObject.getInt("Wisdom");
        wisdomTextField.setText(String.valueOf(numVal));
        wisdomBonusTextField.setText(
                (numVal>11?"+":"")+((numVal-10)/2)
        );
        numVal = coreStatsObject.getInt("Charisma");
        charismaTextField.setText(String.valueOf(numVal));
        charismaBonusTextField.setText(
                (numVal>11?"+":"")+((numVal-10)/2)
        );

        proficiencyBonusTextField.setText(String.valueOf(characterSheetObject.getInt("Proficiency Bonus")));
        inspirationTextField.setText(String.valueOf(characterSheetObject.getInt("Inspiration")));

        JSONObject skillObject = characterSheetObject.getJSONObject("Skills");

        natureSkillBonusTextField.setText(skillObject.getJSONObject("Nature").getString("Bonus"));
        natureSkillProficiencyRadioButton.setSelected(skillObject.getJSONObject("Nature").getBoolean("Proficiency"));

        intimidationSkillBonusTextField.setText(skillObject.getJSONObject("Intimidation").getString("Bonus"));
        intimidationSkillProficiencyRadioButton.setSelected(skillObject.getJSONObject("Intimidation").getBoolean("Proficiency"));

        sleightOfHandSkillBonusTextField.setText(skillObject.getJSONObject("Sleight of Hand").getString("Bonus"));
        sleightOfHandSkillProficiencyRadioButton.setSelected(skillObject.getJSONObject("Sleight of Hand").getBoolean("Proficiency"));

        animalHandlingSkillBonusTextField.setText(skillObject.getJSONObject("Animal Handling").getString("Bonus"));
        animalHandlingSkillProficiencyRadioButton.setSelected(skillObject.getJSONObject("Animal Handling").getBoolean("Proficiency"));

        deceptionSkillBonusTextField.setText(skillObject.getJSONObject("Deception").getString("Bonus"));
        deceptionSkillProficiencyRadioButton.setSelected(skillObject.getJSONObject("Deception").getBoolean("Proficiency"));

        religionSkillBonusTextField.setText(skillObject.getJSONObject("Religion").getString("Bonus"));
        religionSkillProficiencyRadioButton.setSelected(skillObject.getJSONObject("Religion").getBoolean("Proficiency"));

        historySkillBonusTextField.setText(skillObject.getJSONObject("History").getString("Bonus"));
        historySkillProficiencyRadioButton.setSelected(skillObject.getJSONObject("History").getBoolean("Proficiency"));

        survivalSkillBonusTextField.setText(skillObject.getJSONObject("Survival").getString("Bonus"));
        survivalSkillProficiencyRadioButton.setSelected(skillObject.getJSONObject("Survival").getBoolean("Proficiency"));

        persuasionSkillBonusTextField.setText(skillObject.getJSONObject("Persuasion").getString("Bonus"));
        persuasionSkillProficiencyRadioButton.setSelected(skillObject.getJSONObject("Persuasion").getBoolean("Proficiency"));

        medicineSkillBonusTextField.setText(skillObject.getJSONObject("Medicine").getString("Bonus"));
        medicineSkillProficiencyRadioButton.setSelected(skillObject.getJSONObject("Medicine").getBoolean("Proficiency"));

        athleticsSkillBonusTextField.setText(skillObject.getJSONObject("Athletics").getString("Bonus"));
        athleticsSkillProficiencyRadioButton.setSelected(skillObject.getJSONObject("Athletics").getBoolean("Proficiency"));

        stealthSkillBonusTextField.setText(skillObject.getJSONObject("Stealth").getString("Bonus"));
        stealthSkillProficiencyRadioButton.setSelected(skillObject.getJSONObject("Stealth").getBoolean("Proficiency"));

        investigationSkillBonusTextField.setText(skillObject.getJSONObject("Investigation").getString("Bonus"));
        investigationSkillProficiencyRadioButton.setSelected(skillObject.getJSONObject("Investigation").getBoolean("Proficiency"));

        insightSkillBonusTextField.setText(skillObject.getJSONObject("Insight").getString("Bonus"));
        insightSkillProficiencyRadioButton.setSelected(skillObject.getJSONObject("Insight").getBoolean("Proficiency"));

        perceptionSkillBonusTextField.setText(skillObject.getJSONObject("Perception").getString("Bonus"));
        perceptionSkillProficiencyRadioButton.setSelected(skillObject.getJSONObject("Perception").getBoolean("Proficiency"));

        performanceSkillBonusTextField.setText(skillObject.getJSONObject("Performance").getString("Bonus"));
        performanceSkillProficiencyRadioButton.setSelected(skillObject.getJSONObject("Performance").getBoolean("Proficiency"));

        acrobaticsSkillBonusTextField.setText(skillObject.getJSONObject("Acrobatics").getString("Bonus"));
        acrobaticsSkillProficiencyRadioButton.setSelected(skillObject.getJSONObject("Acrobatics").getBoolean("Proficiency"));

        arcanaSkillBonusTextField.setText(skillObject.getJSONObject("Arcana").getString("Bonus"));
        arcanaSkillProficiencyRadioButton.setSelected(skillObject.getJSONObject("Arcana").getBoolean("Proficiency"));

        JSONObject identObject = characterSheetObject.getJSONObject("Identity");
        characterNameTextField.setText(identObject.getString("Character Name"));
        backgroundTextField.setText(identObject.getString("Background"));
        classLevelTextArea.setText(identObject.getString("Class Level"));
        playerNameTextField.setText(identObject.getString("Player Name"));
        expTextField.setText(identObject.getString("Experience Points"));

        //TODO: Implement data sanitization for dropdown menus
        raceComboBox.setValue(identObject.getString("Race"));
        alignmentChoiceBox.setValue(identObject.getString("Alignment"));

        JSONObject combatObject = characterSheetObject.getJSONObject("Core Combat");
        hpCurrentTextArea.setText(combatObject.getString("Current Hit Points"));
        hpTemporaryTextArea.setText(combatObject.getString("Temporary Hit Points"));
        hpMaximumTextField.setText(combatObject.getString("Max Hit Points"));

        hitDiceTextArea.setText(combatObject.getString("Hit Dice"));
        totalHitDiceTextField.setText(combatObject.getString("Total Hit Dice"));

        j = combatObject.getJSONObject("Attacks & Spellcasting");
        attacksAndSpellcastingTextArea.setText(j.getString("Other Attacks"));

        attack1AtkBonusTextField.setText(j.getJSONObject("Attack1").getString("Atk Bonus"));
        attack1DamageTypeTextField.setText(j.getJSONObject("Attack1").getString("Damage Type"));
        attack1NameTextField.setText(j.getJSONObject("Attack1").getString("Name"));

        attack2AtkBonusTextField.setText(j.getJSONObject("Attack2").getString("Atk Bonus"));
        attack2DamageTypeTextField.setText(j.getJSONObject("Attack2").getString("Damage Type"));
        attack2NameTextField.setText(j.getJSONObject("Attack2").getString("Name"));

        attack3AtkBonusTextField.setText(j.getJSONObject("Attack3").getString("Atk Bonus"));
        attack3DamageTypeTextField.setText(j.getJSONObject("Attack3").getString("Damage Type"));
        attack3NameTextField.setText(j.getJSONObject("Attack3").getString("Name"));

        armorClassTextField.setText(combatObject.getString("Armor Class"));
        speedTextField.setText(combatObject.getString("Speed"));
        initiativeTextField.setText(combatObject.getString("Initiative"));

        numVal = combatObject.getInt("Death Save Failures");
        deathSaveFailure1RadioButton.setSelected(numVal > 0);
        deathSaveFailure2RadioButton.setSelected(numVal > 1);
        deathSaveFailure3RadioButton.setSelected(numVal > 2);

        numVal = combatObject.getInt("Death Save Successes");
        deathSaveSuccess1RadioButton.setSelected(numVal > 0);
        deathSaveSuccess2RadioButton.setSelected(numVal > 1);
        deathSaveSuccess3RadioButton.setSelected(numVal > 2);

        j = characterSheetObject.getJSONObject("Personality");
        personalityTextArea.setText(j.getString("Personality Traits"));
        bondsTextArea.setText(j.getString("Bonds"));
        flawsTextArea.setText(j.getString("Flaws"));
        idealsTextArea.setText(j.getString("Ideals"));

        featuresTextArea.setText(characterSheetObject.getJSONObject("Features").getString("Features Text"));

        j = characterSheetObject.getJSONObject("Equipment");
        ppTextField.setText(j.getString("PP"));
        gpTextField.setText(j.getString("GP"));
        epTextField.setText(j.getString("EP"));
        spTextField.setText(j.getString("SP"));
        cpTextField.setText(j.getString("CP"));
        equipmentTextArea.setText(j.getString("Equipment List"));

        profAndLanguagesTextArea.setText(characterSheetObject.getString("Other Proficiencies"));
        passiveWisdomTextField.setText(characterSheetObject.getString("Passive Wisdom"));

    }

    @FXML
    protected void onSave() {
        JSONObject characterSheetObject = new JSONObject();//main stored object
        JSONObject j = new JSONObject();//temporary storage object

        JSONObject identityObject = new JSONObject();
        identityObject.put("Character Name", characterNameTextField.getText());
        identityObject.put("Class Level", classLevelTextArea.getText());
        identityObject.put("Background", backgroundTextField.getText());
        identityObject.put("Player Name", playerNameTextField.getText());
        identityObject.put("Experience Points", expTextField.getText());
        identityObject.put("Alignment", alignmentChoiceBox.getValue());
        identityObject.put("Race", raceComboBox.getValue());

        characterSheetObject.put("Identity", identityObject);

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

        JSONObject attacksObject = new JSONObject();

        j = new JSONObject();
        j.put("Name", attack1NameTextField.getText());
        j.put("Atk Bonus", attack1AtkBonusTextField.getText());
        j.put("Damage Type", attack1DamageTypeTextField.getText());
        attacksObject.put("Attack1", j);

        j = new JSONObject();
        j.put("Name", attack2NameTextField.getText());
        j.put("Atk Bonus", attack2AtkBonusTextField.getText());
        j.put("Damage Type", attack2DamageTypeTextField.getText());
        attacksObject.put("Attack2", j);

        j = new JSONObject();
        j.put("Name", attack3NameTextField.getText());
        j.put("Atk Bonus", attack3AtkBonusTextField.getText());
        j.put("Damage Type", attack3DamageTypeTextField.getText());
        attacksObject.put("Attack3", j);
        attacksObject.put("Other Attacks", attacksAndSpellcastingTextArea.getText());

        combatObject.put("Attacks & Spellcasting", attacksObject);


        characterSheetObject.put("Core Combat", combatObject);

        JSONObject savingThrowsObject = new JSONObject();

        j = new JSONObject();
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
        characterSheetObject.put("Inspiration", inspirationTextField.getText());
        characterSheetObject.put("Proficiency Bonus", proficiencyBonusTextField.getText());

        JSONObject equipmentObject = new JSONObject();
        equipmentObject.put("CP", cpTextField.getText());
        equipmentObject.put("SP", spTextField.getText());
        equipmentObject.put("EP", epTextField.getText());
        equipmentObject.put("GP", gpTextField.getText());
        equipmentObject.put("PP", ppTextField.getText());
        equipmentObject.put("Equipment List", equipmentTextArea.getText());
        characterSheetObject.put("Equipment", equipmentObject);

        JSONObject personalityObject = new JSONObject();
        personalityObject.put("Personality Traits", personalityTextArea.getText());
        personalityObject.put("Ideals", idealsTextArea.getText());
        personalityObject.put("Bonds", bondsTextArea.getText());
        personalityObject.put("Flaws", flawsTextArea.getText());
        characterSheetObject.put("Personality", personalityObject);

        JSONObject featuresObject = new JSONObject();
        featuresObject.put("Features Text", featuresTextArea.getText());
        characterSheetObject.put("Features", featuresObject);

        //characterSheetObject.put("Passive Perception", pas)

        IOServices.writeBaseCharacterJSONObjectToFile(characterSheetObject, primaryMenuBar);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        raceComboBox.getItems().addAll(UIListPopulationService.getRaceList());
        raceComboBox.getSelectionModel().selectFirst();
        alignmentChoiceBox.getItems().addAll(UIListPopulationService.getAlignmentList());
        alignmentChoiceBox.getSelectionModel().selectFirst();

        StringProcessingService.setNumericOnlyChangeListener(strengthTextField);
        StringProcessingService.setNumericOnlyChangeListener(dexterityTextField);
        StringProcessingService.setNumericOnlyChangeListener(constitutionTextField);
        StringProcessingService.setNumericOnlyChangeListener(intelligenceTextField);
        StringProcessingService.setNumericOnlyChangeListener(wisdomTextField);
        StringProcessingService.setNumericOnlyChangeListener(charismaTextField);

        StringProcessingService.setNumericOnlyChangeListener(armorClassTextField);
        StringProcessingService.setNumericOnlyChangeListener(speedTextField);
        StringProcessingService.setNumericOnlyChangeListener(initiativeTextField);

        StringProcessingService.setNumericOnlyChangeListener(expTextField);



    }


}
