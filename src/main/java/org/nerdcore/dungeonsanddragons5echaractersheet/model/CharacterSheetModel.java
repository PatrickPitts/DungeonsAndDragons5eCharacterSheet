package org.nerdcore.dungeonsanddragons5echaractersheet.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharacterSheetModel {
    Map<String, Statistic> statisticMap = new HashMap<>();
    List<FeatureAggregate> aggregateList = new ArrayList<>();
    List<ModelResource> resourceList = new ArrayList<>();
}
