package org.nerdcore.dungeonsanddragons5echaractersheet.model;

public class Feature {

    private String name;
    private String text;


    public Feature(String name, String text){
        setName(name);
        setText(text);
    }

    public Feature(Feature clone){
        setName(clone.getName());
        setText(clone.getText());
    }

    //TODO: Test code. Correctly implement adding feature to CharacterSheetModel
    public boolean addFeatureToCharacterSheetModel(CharacterSheetModel c){
        System.out.println("Feature Added");
        return false;
    }

    @Override
    public String toString(){
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
