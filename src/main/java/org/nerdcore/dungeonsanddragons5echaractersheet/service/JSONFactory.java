package org.nerdcore.dungeonsanddragons5echaractersheet.service;

import org.json.JSONObject;

public class JSONFactory {

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
