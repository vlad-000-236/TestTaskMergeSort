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
public class FileWriterClass {
    private String outFileName;
    private int [] theArray;
    private String [] StringTheArray;
    private String sortOpt;
    private String dataType;
    
    public FileWriterClass(String outFileName, int [] theArray, String [] StringTheArray, 
            String sortOpt, String dataType){
        
        this.outFileName = outFileName;
        this.theArray = theArray;
        this.StringTheArray = StringTheArray;
        this.sortOpt = sortOpt;
        this.dataType = dataType;
        
        if (dataType.equals("-i")){            
            switch(sortOpt){
                case "-a": 
                   intFileWriter(theArray, outFileName);
                   break;
                   
                case "-1":
                   intFileWriter(theArray, outFileName);
                   break;
                   
                case "-d":
                    intReverser(theArray);
                    intFileWriter(theArray, outFileName);
                }        
            }
        else if (dataType.equals("-s")){
            switch(sortOpt){
                case "-a":
                    stringFileWriter(StringTheArray, outFileName);  
                    break;
                
                case "-1":
                    stringFileWriter(StringTheArray, outFileName);  
                    break;
                
                case"-d":
                    StringReverser(StringTheArray);
                    stringFileWriter(StringTheArray, outFileName);
                    break;
            }
        }
    }
    
    private void intFileWriter(int [] theArray, String outFileName){
        
        StringBuffer str = new StringBuffer();
        String fileName  = outFileName;
        
        try (FileWriter file = new FileWriter(fileName, false)) {
                for (int a = 0; a < theArray.length; a++){
                    str.append(theArray[a]);
                    if (a != theArray.length - 1){
                        str.append("\n");
                    }
                }
                String text = new String (str);
                file.write(text);
            }
            catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        
    private void stringFileWriter(String [] StringTheArray, String outFileName){
        
        StringBuffer str = new StringBuffer();
        String fileName  = outFileName;
        
        try (FileWriter file = new FileWriter(fileName, false)) {
                for (int a = 0; a < StringTheArray.length; a++){
                    str.append(StringTheArray[a]);
                    if (a != StringTheArray.length - 1){
                        str.append("\n");
                    }
                }
                String text = new String (str);
                file.write(text);
            }
            catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        
    private void intReverser(int [] theArray){
        ArrayList <Integer>  reversList = new <Integer> ArrayList();
        
        for(int a = 0; a < theArray.length; a++){
            reversList.add(theArray[a]);
            }
         Collections.reverse(reversList);

        for(int a = 0; a < reversList.size(); a++){
            theArray[a] = reversList.get(a);
        } 
    }
    private void StringReverser(String [] StringTheArray){
        ArrayList <String>  reversList = new <String> ArrayList();
        
        for (int a = 0; a < StringTheArray.length; a++){
            reversList.add(StringTheArray[a]);
        }
            Collections.reverse(reversList);
            for (int a = 0; a < reversList.size(); a++){
                StringTheArray[a] = reversList.get(a);
        }
    }
}
