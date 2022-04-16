package org.nerdcore.dungeonsanddragons5echaractersheet.model;

import java.util.ArrayList;
import java.util.List;

public class CharacterSheetModel {
    private final List<Statistic> statisticList;
    private final List<Feature> featureList;
    private final List<Resource> resourceList;
    private final List<Ability> abilityList;

    public CharacterSheetModel() {
        statisticList = new ArrayList<>();
        featureList = new ArrayList<>();
        resourceList = new ArrayList<>();
        abilityList = new ArrayList<>();
    }

    public void addFeature(Feature... features) {
        for (Feature f : features) {
            if (f instanceof FeatureAggregate) {
//                addFeature(((FeatureAggregate) f).getFeatureList().toArray(new Feature[0]));
            } else if (f instanceof ChoiceFeature){
                featureList.add(((ChoiceFeature) f).promptChoice());
            }
            else {
                featureList.add(f);
            }
        }

    }

    private boolean processFeature(Feature f) {
        return false;
    }

    public boolean useAbility(Ability a) {
        return false;
    }

    public String reportFeatures(String s){
        StringBuilder ret = new StringBuilder();
        for(Feature f : featureList){
            ret.append(String.format("%s%n", f));
        }
        return ret.toString();
    }

    public void reportFeatures(){
        System.out.println(reportFeatures(""));
    }

}
