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
public class FileReaderClass {
    private String [] stringArray;
    private ArrayList<String> str = new ArrayList<String>();
    
    public void fileReader(String [] getFilesList){

        for (int a = 0; a < getFilesList.length; a++){
            String fileName = getFilesList[a] ;

            try (BufferedReader reader = 
                    new BufferedReader(new FileReader(fileName))){
                String line = reader.readLine();
                str.add(line);
                while (line != null){
                    line = reader.readLine();
                    if(line != null) {
                        str.add(line);
                    }
                }
            }
            catch (IOException e){
                System.err.println("Ошибка при чтении файла: " + e.getMessage());
            }
        }
        stringerArray();
    }
    
    private void stringerArray(){
        stringArray = new String[str.size()];
        for(int a = 0; a < stringArray.length; a++){
                stringArray[a] = str.get(a);
            }
        }
    
    public String [] getStringArray(){

        return stringArray;
    }
}