package org.nerdcore.dungeonsanddragons5echaractersheet.model;

import java.util.Arrays;
import java.util.List;

public class FeatureAggregate{
    List<Feature> featureList;

    public FeatureAggregate( Feature... features){
        if(features != null && features.length > 0){
            featureList.addAll(Arrays.asList(features));
        }
    }
}
