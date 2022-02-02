package org.nerdcore.dungeonsanddragons5echaractersheet.model.FeatureAggregate.CharacterSubclass;

import org.nerdcore.dungeonsanddragons5echaractersheet.model.FeatureAggregate.FeatureAggregate;

public abstract class CharacterSubclass implements FeatureAggregate {
    private String subclassName;

    public Class getParentClass() {
        return parentClass;
    }

    public void setParentClass(Class parentClass) {
        this.parentClass = parentClass;
    }

    private Class parentClass;

    public String getSubclassName() {
        return subclassName;
    }

    public void setSubclassName(String subclassName) {
        this.subclassName = subclassName;
    }
}
