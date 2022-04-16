package org.nerdcore.dungeonsanddragons5echaractersheet.model;

import java.util.ArrayList;
import java.util.List;

public class Tester {

    static List<Feature> featureList;

    public static void main(String[] args) {
        CharacterSheetModel c = new CharacterSheetModel();
        List<Feature> featureList = new ArrayList<>();
        featureList.add(new Feature("Improved 2 weapon fighting", "damage bonus on offhand swing"));
        featureList.add(new ChoiceFeature("Druid Circle", "Druid Subclass Select",
                new Feature("Circle of Land", "Something about plants I guess"),
                new Feature("Circle of the Moon", "My Girlfriend turned into the moon...")
        ));
        c.addFeature(featureList.toArray(new Feature[0]));
        c.reportFeatures();
    }



}
