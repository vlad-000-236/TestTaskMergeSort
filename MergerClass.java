/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myportfolio.mergesort;

/**
 *
 * @author vlad__236
 */
public class MergerClass {
    private int [] arrayForSort;
    private String [] stringArrayForSort;
    
    public MergerClass(int [] Array, String [] stringArray, String dataType){
        stringArrayForSort = stringArray;
        arrayForSort = Array;
        if (dataType.equals("-i")){
            mergeSort(arrayForSort);
        }
        else {
            stringMergeSort(stringArrayForSort);
        }
    }
    
    private void mergeSort(int [] arrayForSort){
        int arreyLength = arrayForSort.length;
        
        if (arreyLength == 1)
            return;
        
        int mid = arreyLength/2;
        int [] firstHalf = new int [mid];
        int [] secondHalf = new int [arreyLength-mid];
        
        
        for (int i = 0; i < mid; i++){
            firstHalf[i] = arrayForSort[i];
        }
        for (int i = mid; i < arreyLength; i++){
            secondHalf[i - mid] = arrayForSort[i];
        }
        
        mergeSort(firstHalf);
        mergeSort(secondHalf);
        merge(arrayForSort, firstHalf, secondHalf);
    }
    
    private void merge(int [] finalArray, int[] first, int [] second){
        int left = first.length;
        int right = second.length;
        int firstHalfMarker = 0;
        int secondHalfMarker = 0;
        int arrMarker = 0;
        
        while (firstHalfMarker < left && secondHalfMarker < right){
            if (first[firstHalfMarker] < second[secondHalfMarker]){
                finalArray[arrMarker] = first[firstHalfMarker];
                
                firstHalfMarker++;
                arrMarker++;
            }
            else{
                finalArray[arrMarker] = second[secondHalfMarker];
                secondHalfMarker++;
                arrMarker++;
            }
        }
        
        for (int ll = firstHalfMarker; ll< left; ll++){
            finalArray[arrMarker] = first[ll];
            arrMarker++;
            }
        
        for (int rr = secondHalfMarker; rr < right; rr++){
            finalArray[arrMarker] = second[rr];
            arrMarker++;
        }
    }
    
    private void stringMergeSort(String [] arrayForSort){
        
        int arreyLength = arrayForSort.length;
        
        if (arreyLength == 1)
            return;
        
        int mid = arreyLength/2;
        String [] firstHalf = new String [mid];
        String [] secondHalf = new String [arreyLength-mid];
        
        
        for (int i = 0; i < mid; i++){
            firstHalf[i] = arrayForSort[i];
        }
        for (int i = mid; i < arreyLength; i++){
            secondHalf[i - mid] = arrayForSort[i];
        }
        
        stringMergeSort(firstHalf);
        stringMergeSort(secondHalf);
        stringMerge(arrayForSort, firstHalf, secondHalf);
    }
    
    private void stringMerge(String [] finalArray, String [] first, String [] second){
        int left = first.length;
        int right = second.length;
        int firstHalfMarker = 0;
        int secondHalfMarker = 0;
        int arrMarker = 0;
        
        while (firstHalfMarker < left && secondHalfMarker < right){
            if (first[firstHalfMarker].length() < second[secondHalfMarker].length()){
                finalArray[arrMarker] = first[firstHalfMarker];
                
                firstHalfMarker++;
                arrMarker++;
            }
            else{
                finalArray[arrMarker] = second[secondHalfMarker];
                secondHalfMarker++;
                arrMarker++;
            }
        }
        
        for (int ll = firstHalfMarker; ll< left; ll++){
            finalArray[arrMarker] = first[ll];
            arrMarker++;
            }
        
        for (int rr = secondHalfMarker; rr < right; rr++){
            finalArray[arrMarker] = second[rr];
            arrMarker++;
        }
    }
    
    public int [] getTheArray(){
        return arrayForSort;
    }
    
    public String [] getStringArray(){
        return stringArrayForSort;
    }
}
