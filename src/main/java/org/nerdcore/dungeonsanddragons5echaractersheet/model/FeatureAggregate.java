package org.nerdcore.dungeonsanddragons5echaractersheet.model;

import java.util.Arrays;
import java.util.List;

public class FeatureAggregate extends Feature{
    List<Feature> featureList;

    public FeatureAggregate(String name, String text, Feature... features){
        super(name, text);
        if(features != null && features.length > 0){
            featureList.addAll(Arrays.asList(features));
        }
    }

    public void addFeature(Feature f){
        featureList.add(f);
    }

    public List<Feature> getFeatureList(){
        return featureList;
    }
}
