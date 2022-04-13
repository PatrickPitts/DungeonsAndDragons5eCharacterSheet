package org.nerdcore.dungeonsanddragons5echaractersheet.model;

import java.util.*;

public class ChoiceFeature extends Feature {

    List<Feature> choices;

    public ChoiceFeature(String name, String text, Feature... choices){
        super(name, text);
        this.choices = new ArrayList<>();
        this.choices.addAll(Arrays.asList(choices));
    }

    //TODO: Test code, update correct implementation
    private Feature promptChoice() {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose [a], [b], or [c]");
        String choice = in.next();
        return switch (choice.toLowerCase()) {
            case "a" -> new Feature("A", "Feature A");
            case "b" -> new Feature("B", "Feature B");
            case "c" -> new Feature("C", "Feature C");
            default -> new Feature("Bad", "Bad Feature");
        };
    }

    @Override
    public boolean addFeatureToCharacterSheetModel(CharacterSheetModel c) {
        return promptChoice().addFeatureToCharacterSheetModel(c);

    }

}
