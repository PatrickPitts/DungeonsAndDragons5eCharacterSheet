package org.nerdcore.dungeonsanddragons5echaractersheet.model;

import java.util.ArrayList;
import java.util.List;

public class Ability {
    String name;
    String[] identifiers;
    String source;
    List<List<ModelResource>> resourceCost = new ArrayList<>();

    public String[] getIdentifiers(){
        return identifiers;
    }

    public boolean isAbilityType(String abilityType){
        for(String s : identifiers){
            if(s.equals(abilityType)){
                return true;
            }
        }
        return false;
    }
}
