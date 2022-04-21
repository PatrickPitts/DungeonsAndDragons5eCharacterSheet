package org.nerdcore.dungeonsanddragons5echaractersheet.service;

import javafx.scene.Node;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.*;

public class IOServices {

    private static FileChooser fileChooser;
    private static File savedSheetsDirectory;
    private static File sysDirectory;
    private static final String sheetFilePath = "/Documents/CharacterSheetManager/.characterSheets";
    private static final String sysFilePath = "/Documents/CharacterSheetManager/.sys";

    public static boolean writeFeatureJSONObjectToFile(JSONObject obj, String... path){
        verifySystemStoreDirectoryPath();
        File featureJSONFile = new File(System.getProperty("user.home"), sysFilePath + "/allfeature.json");
        if(path.length > 0){
            System.out.printf("Implementation needed: include filepath %s%n", path[0]);
            //TODO: custom file pathing
        }
        if(featureJSONFile.exists()){
            try(FileWriter fw = new FileWriter(featureJSONFile, true)) {
                fw.write(obj.toString(4));
                return true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static JSONArray getAllSpellsJSONArray(){
        verifySystemStoreDirectoryPath();
        File spellJSONFile = new File(System.getProperty("user.home"), sysFilePath + "/allspells.json");

        if(spellJSONFile.exists()){
            try (FileInputStream fis = new FileInputStream(spellJSONFile)){
                JSONTokener t = new JSONTokener(fis);
                return new JSONArray(t);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

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
            sysDirectory = staticStoreDirectoryPath;
        } else {
            sysDirectory = new File(System.getProperty("user.home"));
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

    public static JSONObject getCharacterJSONObjectFromFile(Node node){
        verifyDirectoryPath();
        fileChooser = new FileChooser();
        fileChooser.setTitle("Load Character from .json");
        fileChooser.getExtensionFilters().add(new ExtensionFilter("Character Sheet File", "*.json"));
        fileChooser.setInitialDirectory(savedSheetsDirectory);
        File selectedFile = fileChooser.showOpenDialog(node.getScene().getWindow());
        //TODO: JSON File Verification
        try(FileInputStream fis = new FileInputStream(selectedFile)){
            JSONTokener tokener = new JSONTokener(fis);
            return new JSONObject(tokener);
        } catch (IOException e){
            e.printStackTrace();
        }

        return null;
    }
}
