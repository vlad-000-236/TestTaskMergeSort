/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.myportfolio.mergesort;

/**
 *
 * @author vlad__236
 */
public class MergeSort {

    public static void main(String[] args) {
        ProgOptions opt = new ProgOptions();
        opt.userEnterface();

        FileReaderClass reader = new FileReaderClass();
        reader.fileReader(opt.getFilesList());
        
        ArrayClass arr = new ArrayClass(reader.getStringArray(), opt.getDataType());
        
        MergerClass sort = new MergerClass(arr.getTheArray(), arr.getStringTheArray(), 
        opt.getDataType());

        FileWriterClass writer = new FileWriterClass(opt.getOutFileName(), 
                sort.getTheArray(), sort.getStringArray(), opt.getSortMod(), 
                opt.getDataType());
        
    }
}
