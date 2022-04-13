package org.nerdcore.dungeonsanddragons5echaractersheet.model;

public class AbilityFeature extends Feature{
    private Ability ability;

    public AbilityFeature(Ability ability){
        this.ability = ability;
    }

    public Ability getAbility(){
        return ability;
    }
}
