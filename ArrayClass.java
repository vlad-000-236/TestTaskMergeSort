/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myportfolio.mergesort;

/**
 *
 * @author vlad__236
 */
public class ArrayClass {
    
    private int [] theArray;
    private String [] stringArray;
    
    public ArrayClass(String [] stringArray, String dataType) {
        
        this.stringArray = stringArray;
        theArray = new int [stringArray.length];
        
        if (dataType.equals("-i")){
            insert();
        }
    }

    private void insert(){
        for (int a = 0; a < theArray.length; a++){
            theArray[a] = Integer.parseInt(stringArray[a]);
        }
    }
    
    public int [] getTheArray(){
        return theArray;
    }
    
    public String [] getStringTheArray(){
        return stringArray;
    }
    
    public void SetTheArraylist(int [] theArray){
        this.theArray = theArray;
    }
}
