package org.nerdcore.dungeonsanddragons5echaractersheet.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharacterSheetModel {
    private Map<String, Statistic> statisticMap;
    private List<FeatureAggregate> aggregateList;
    private List<Resource> resourceList;
    private List<Ability> abilityList;

    public CharacterSheetModel(){
        statisticMap = new HashMap<>();
        aggregateList = new ArrayList<>();
        resourceList = new ArrayList<>();
        abilityList = new ArrayList<>();
    }

    public void addFeatureAggregate(FeatureAggregate f){
        aggregateList.add(f);
    }

    private boolean processFeature(Feature f){
        return false;
    }

    public boolean useAbility(Ability a){
        return false;
    }

}
