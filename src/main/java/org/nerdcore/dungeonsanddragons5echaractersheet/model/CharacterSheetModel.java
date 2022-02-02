package org.nerdcore.dungeonsanddragons5echaractersheet.model;

public class CharacterSheetModel {
    //top bar
    private String characterName;
    private String classAndLevel; //todo: implement characterClass, multiclassing, relationship to hit die, features&traits
    private String background;
    private String playerName;
    private String race;
    private String alignment;
    private String experiencePoints;

    //Skills and throws
    private String inspiration;
    private String proficiencyBonus;
    private String[] skills;
    private String passiveWisdomBonus;
    private String[] otherProficiencies; //includes languages

    //equipment
    private String[] currency; //cp, sp, ep, gp, pp
    private String[] items; //todo: implement weapons, shields, armor, artifacts, trinkets, etc.

    //core stats
    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    //life pane
    private int armorClass;
    private int initiative;
    private int maxHitPoints;
    private int currentHitPoints;
    private int temporaryHitPoints;
    private int currentHitDice; //todo: implement different die based on characterClass/characterClassLevels
    private int totalHitDice;
    private Boolean[] deathSaves; //todo: implement tracking successes and failures

    //features and traits
    private String[] abilities; //todo: implement aggregation of class abilities, race abilities, background abilities, and other sources

    //personality pane
    private String personalityTraits;
    private String ideals;
    private String bonds;
    private String flaws;

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getClassAndLevel() {
        return classAndLevel;
    }

    public void setClassAndLevel(String classAndLevel) {
        this.classAndLevel = classAndLevel;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public String getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(String experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public String getInspiration() {
        return inspiration;
    }

    public void setInspiration(String inspiration) {
        this.inspiration = inspiration;
    }

    public String getProficiencyBonus() {
        return proficiencyBonus;
    }

    public void setProficiencyBonus(String proficiencyBonus) {
        this.proficiencyBonus = proficiencyBonus;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public String getPassiveWisdomBonus() {
        return passiveWisdomBonus;
    }

    public void setPassiveWisdomBonus(String passiveWisdomBonus) {
        this.passiveWisdomBonus = passiveWisdomBonus;
    }

    public String[] getOtherProficiencies() {
        return otherProficiencies;
    }

    public void setOtherProficiencies(String[] otherProficiencies) {
        this.otherProficiencies = otherProficiencies;
    }

    public String[] getCurrency() {
        return currency;
    }

    public void setCurrency(String[] currency) {
        this.currency = currency;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public int getMaxHitPoints() {
        return maxHitPoints;
    }

    public void setMaxHitPoints(int maxHitPoints) {
        this.maxHitPoints = maxHitPoints;
    }

    public int getCurrentHitPoints() {
        return currentHitPoints;
    }

    public void setCurrentHitPoints(int currentHitPoints) {
        this.currentHitPoints = currentHitPoints;
    }

    public int getTemporaryHitPoints() {
        return temporaryHitPoints;
    }

    public void setTemporaryHitPoints(int temporaryHitPoints) {
        this.temporaryHitPoints = temporaryHitPoints;
    }

    public int getCurrentHitDice() {
        return currentHitDice;
    }

    public void setCurrentHitDice(int currentHitDice) {
        this.currentHitDice = currentHitDice;
    }

    public int getTotalHitDice() {
        return totalHitDice;
    }

    public void setTotalHitDice(int totalHitDice) {
        this.totalHitDice = totalHitDice;
    }

    public Boolean[] getDeathSaves() {
        return deathSaves;
    }

    public void setDeathSaves(Boolean[] deathSaves) {
        this.deathSaves = deathSaves;
    }

    public String[] getAbilities() {
        return abilities;
    }

    public void setAbilities(String[] abilities) {
        this.abilities = abilities;
    }

    public String getPersonalityTraits() {
        return personalityTraits;
    }

    public void setPersonalityTraits(String personalityTraits) {
        this.personalityTraits = personalityTraits;
    }

    public String getIdeals() {
        return ideals;
    }

    public void setIdeals(String ideals) {
        this.ideals = ideals;
    }

    public String getBonds() {
        return bonds;
    }

    public void setBonds(String bonds) {
        this.bonds = bonds;
    }

    public String getFlaws() {
        return flaws;
    }

    public void setFlaws(String flaws) {
        this.flaws = flaws;
    }
}
