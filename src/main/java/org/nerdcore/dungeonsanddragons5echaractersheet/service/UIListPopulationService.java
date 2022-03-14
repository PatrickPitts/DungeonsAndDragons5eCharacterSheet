package org.nerdcore.dungeonsanddragons5echaractersheet.service;

import java.util.ArrayList;
import java.util.List;

public class UIListPopulationService {

    public static List<String> getAlignmentList(){
        List<String> ret = new ArrayList<>();
        ret.add("Chaotic Good");
        ret.add("Chaotic Neutral");
        ret.add("Chaotic Evil");
        ret.add("Neutral Good");
        ret.add("True Neutral");
        ret.add("Neutral Evil");
        ret.add("Lawful Good");
        ret.add("Lawful Neutral");
        ret.add("Lawful Evil");
        return ret;
    }

    public static List<String> getRaceList(){
        return getRaceList(0);
    }
    //TODO: Implement 'option' to include exotic races, different content sources, etc
    public static List<String> getRaceList(int option){
        List<String> ret = new ArrayList<>();
        ret.add("Dwarf");
        ret.add("Elf");
        ret.add("Human");
        ret.add("Half-Elf");
        ret.add("Halfling");
        ret.add("Half-Orc");
        ret.add("Gnome");
        ret.add("Tiefling");
        ret.add("Dragonborne");

        return ret;
    }
}
