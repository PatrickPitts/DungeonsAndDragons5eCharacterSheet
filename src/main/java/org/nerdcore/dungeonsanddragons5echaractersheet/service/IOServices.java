package org.nerdcore.dungeonsanddragons5echaractersheet.service;

import javafx.scene.Node;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.*;

public class IOServices {

    private static FileChooser fileChooser;
    private static File savedSheetsDirectory;
    private static final String sheetFilePath = "/Documents/CharacterSheetManager/.characterSheets";
    private static final String sysFilePath = "/Document/CharacterSheetManager/.sys";

    public static void verifyDirectoryPath(){
        File documentsFile = new File(System.getProperty("user.home"), sheetFilePath);
        if(documentsFile.exists() || documentsFile.mkdir()){
            savedSheetsDirectory = documentsFile;
        } else {
            savedSheetsDirectory = new File(System.getProperty("user.home"));
        }
    }

    public static void verifySystemStoreDirectoryPath(){
        File staticStoreDirectoryPath = new File(System.getProperty("user.home"), sysFilePath);
        if(staticStoreDirectoryPath.exists() || staticStoreDirectoryPath.mkdir()){
            savedSheetsDirectory = staticStoreDirectoryPath;
        } else {
            savedSheetsDirectory = new File(System.getProperty("user.home"));
        }
    }

    public static void writeBaseCharacterJSONObjectToFile(JSONObject obj, Node node) {
        verifyDirectoryPath();
        fileChooser = new FileChooser();
        fileChooser.setTitle(String.format("Save %s", obj.getJSONObject("Identity").getString("Character Name")));
        fileChooser.getExtensionFilters().add(new ExtensionFilter("Character Sheet File", "*.json"));
        fileChooser.setInitialDirectory(savedSheetsDirectory);
        fileChooser.setInitialFileName(StringProcessingService.buildCharacterSheetFileName(obj));

        File saveDestination = fileChooser.showSaveDialog(node.getScene().getWindow());

        try(FileWriter file = new FileWriter(saveDestination)){
            file.write(obj.toString(4));

        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public static JSONObject getJSONObjectFromFile(Node node){
        verifyDirectoryPath();
        fileChooser = new FileChooser();
        fileChooser.setTitle("Load Character from .json");
        fileChooser.getExtensionFilters().add(new ExtensionFilter("Character Sheet File", "*.json"));
        fileChooser.setInitialDirectory(savedSheetsDirectory);
        File selectedFile = fileChooser.showOpenDialog(node.getScene().getWindow());
        //TODO: JSON File Verification
        try{
            JSONTokener tokener = new JSONTokener(new FileInputStream(selectedFile));
            return new JSONObject(tokener);
        } catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
}
