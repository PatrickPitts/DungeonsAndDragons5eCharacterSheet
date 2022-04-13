package org.nerdcore.dungeonsanddragons5echaractersheet.model;

import java.util.*;

public class Statistic {
    private String name;
    private String identifier;
    private double baseValue;
    private String description;
    private Set<StatisticModifier> indefiniteModifiers;
    private Set<StatisticModifier> temporaryModifiers;

    public Statistic(Statistic clone){
        setName(clone.getName());
        setIdentifier(clone.getIdentifier());
        setBaseValue(clone.getBaseValue());
        setDescription(clone.getDescription());
        setIndefiniteModifiers(new HashSet<>());
        setTemporaryModifiers(new HashSet<>());
        for(StatisticModifier s : clone.getIndefiniteModifiers()){
            addIndefiniteStatisticModifier(s);
        }
        for(StatisticModifier s : clone.getTemporaryModifiers()){
            addTemporaryModifier(s);
        }

    }

    public void clearTemporaryModifiers(){
        temporaryModifiers = new HashSet<>();
    }

    public boolean removeTemporaryModifier(StatisticModifier m){
        return temporaryModifiers.remove(m);
    }

    public boolean addIndefiniteStatisticModifier(StatisticModifier m){
        return indefiniteModifiers.add(m);
    }

    public boolean addTemporaryModifier(StatisticModifier m){
        return temporaryModifiers.add(m);
    }

    public String getPrettyName(){
        return null;
    }

    public double getBaseValue(){
        return baseValue;
    }

    public double getModifiedValue(){
        return baseValue;
    }

    public String getName(){
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setBaseValue(double baseValue) {
        this.baseValue = baseValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<StatisticModifier> getIndefiniteModifiers() {
        return indefiniteModifiers;
    }

    public void setIndefiniteModifiers(Set<StatisticModifier> indefiniteModifiers) {
        this.indefiniteModifiers = indefiniteModifiers;
    }

    public Set<StatisticModifier> getTemporaryModifiers() {
        return temporaryModifiers;
    }

    public void setTemporaryModifiers(Set<StatisticModifier> temporaryModifiers) {
        this.temporaryModifiers = temporaryModifiers;
    }
}
