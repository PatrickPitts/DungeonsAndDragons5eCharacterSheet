package org.nerdcore.dungeonsanddragons5echaractersheet.service;

import javafx.scene.control.ChoiceBox;
import org.json.JSONArray;
import org.json.JSONObject;
import org.nerdcore.dungeonsanddragons5echaractersheet.model.ChoiceFeature;
import org.nerdcore.dungeonsanddragons5echaractersheet.model.Feature;
import org.nerdcore.dungeonsanddragons5echaractersheet.model.FeatureAggregate;
import org.nerdcore.dungeonsanddragons5echaractersheet.model.ModifierFeature;

public class JSONFactory {

    public static JSONObject getEmptyFeature(Feature f){
        JSONObject obj = new JSONObject();
        obj.put("name", "");
        obj.put("text", "");
        obj.put("tags", new JSONArray());

        if(f instanceof ModifierFeature) {
            obj.put("_type", "[MODIFIER]");
        }
        if(f instanceof FeatureAggregate){
            obj.put("_type", "[AGGREGATE]");
        }
        if(f instanceof ChoiceFeature){
            obj.put("_type", "[CHOICE]");
        }


        return obj;
    }

    public static JSONObject getEmptySpellJSONObject(){
        JSONObject obj = new JSONObject();
        obj.put("level", "");
        obj.put("ritualCasting", false);
        obj.put("range", "");
        obj.put("description", "");
        obj.put("concentration", false);
        obj.put("materialComponents", "None");
        obj.put("source", "Player's Handbook#1");
        obj.put("somaticComponent", false);
        obj.put("duration", "1 action");
        obj.put("verbalComponent", false);
        obj.put("school", "");
        obj.put("name", "");
        obj.put("_class", "");

        return obj;
    }
}
