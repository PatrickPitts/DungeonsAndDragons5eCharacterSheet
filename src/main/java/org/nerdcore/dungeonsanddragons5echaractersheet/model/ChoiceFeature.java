package org.nerdcore.dungeonsanddragons5echaractersheet.model;

import java.util.*;

public class ChoiceFeature extends Feature {

    private List<Feature> choices;
    private Feature chosen;

    public ChoiceFeature(String name, String text, Feature... choices) {
        super(name, text);
        this.choices = new ArrayList<>();
        this.choices.addAll(Arrays.asList(choices));
    }

    public Feature promptChoice() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Choose:");
            int i = 1;
            for (Feature f : choices) {
                System.out.printf("[%d]: %s%n", i++, f);
            }
            try{
                int choice = in.nextInt() - 1;
                chosen = choices.get(choice);
                break;
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Bad choice: pick a correct number!");
            } catch (NumberFormatException e){
                System.out.println("Input a number");
            }
        }
        return this;
    }

    @Override
    public String toString(){
        return getName() + " - " + chosen.getName();
    }

    @Override
    public boolean addFeatureToCharacterSheetModel(CharacterSheetModel c) {
        return promptChoice().addFeatureToCharacterSheetModel(c);
    }

    public Feature get(){
        return chosen;
    }

}
