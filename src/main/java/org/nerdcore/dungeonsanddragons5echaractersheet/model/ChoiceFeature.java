package org.nerdcore.dungeonsanddragons5echaractersheet.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ChoiceFeature extends Feature {

    List<Feature> choices = new ArrayList<>();

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
}
