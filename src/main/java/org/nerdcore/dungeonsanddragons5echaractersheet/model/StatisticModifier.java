package org.nerdcore.dungeonsanddragons5echaractersheet.model;

public class StatisticModifier {
    private Statistic target;
    private Statistic source;

    public Statistic getModifiedStatistic(){
        return target;
    }

    public Statistic getTarget() {
        return target;
    }

    public void setTarget(Statistic target) {
        this.target = target;
    }

    public Statistic getSource() {
        return source;
    }

    public void setSource(Statistic source) {
        this.source = source;
    }
}
