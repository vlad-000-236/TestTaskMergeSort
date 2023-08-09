/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myportfolio.mergesort;
import java.io.*;
import java.util.*;




/**
 *
 * @author vlad__236
 */
public class ProgOptions {
    private String usersOptions;
    private String [] optionsList;
    private String dataType = "-1";
    private String sortMod = "-1";
    private String outFileName = "-1";
    private String [] filesList;
    ArrayList<String> str = new ArrayList<String>();
    

    public void userEnterface(){
        try (BufferedReader read = 
                new BufferedReader (new InputStreamReader(System.in))){
                 usersOptions = read.readLine();
        }
        catch(IOException ex){
            System.err.println("Ошибка при вводе команды: " + ex.getMessage());
        }
        progOptions();
        optionsListCreater();
    }

    private void progOptions(){
        optionsList = usersOptions.split(" ");        
    }
    
    private void optionsListCreater() {
        ArrayList<String> flList = new ArrayList<String>();
        
        for (int a = 0; a < 2; a++) {
            switch (optionsList[a]) {

                case "-d":
                    sortMod = "-d";
                    break;

                case "-a":
                    sortMod = "-a";
                    break;

                case "-s":
                    dataType = "-s";
                    break;

                case "-i":
                    dataType = "-i";
                    break;
            }
        }
 
        
            if (optionsList[1].equals("-a") || optionsList[1].equals("-d")) {
                outFileName = optionsList[2];

                for (int b = 3; b < optionsList.length; b++) {
                    flList.add(optionsList[b]);
                    }
                }
                else{
                    outFileName = optionsList[1];

                    for (int b = 2; b < optionsList.length; b++) {
                        flList.add(optionsList[2]);
                    }
                }

                filesList = new String[flList.size()];
                for (int c = 0; c < flList.size(); c++) {
                    filesList[c] = flList.get(c);
                }
        }

    
    public String getDataType(){
        return dataType;
    }
    
    public String getSortMod(){
        return sortMod;
    }
    
    public String getOutFileName(){
        return outFileName;
    }
    
    public String [] getFilesList(){
        return filesList;
    }
}