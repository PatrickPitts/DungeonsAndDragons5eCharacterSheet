package org.nerdcore.dungeonsanddragons5echaractersheet.service;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextField;
import org.json.JSONObject;

public class StringProcessingService {

    public static String buildCharacterSheetFileName(JSONObject obj){
        String name = obj.getJSONObject("Identity").getString("Character Name").replaceAll(" ", "_");
        return String.format("%s.json", name);
    }

    public static String statBonusString(String s){
        try{
            int val = Integer.parseInt(s);
            String ret = val > 0 ? "+" : "";
            ret += val;
            return ret;
        } catch (NumberFormatException e){
            return s;
        }
    }

    public static TextField setNumericOnlyChangeListener(final TextField field){
        field.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String oldValue, String newValue) {
                if(!newValue.matches("-?\\d*")){
                    field.setText(newValue.replaceAll("-?[^\\d]", ""));
                }
            }
        });
        return field;
    }
}
