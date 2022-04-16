package org.nerdcore.dungeonsanddragons5echaractersheet.model;

public class AbilityFeature extends Feature{
    private Ability ability;

    public AbilityFeature(String name, String text, Ability ability){
        super(name, text);
        this.ability = ability;
    }

    public Ability getAbility(){
        return ability;
    }
}
