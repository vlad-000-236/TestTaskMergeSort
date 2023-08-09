/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.myportfolio.mergesort;

/**
 *
 * @author vlad__236
 */

/*
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Данный класс является "main"-классом этого проекта. Ход программы начинается с
запуска метода "userEnterface()" класса "ProgOptions". Этод метода принимает 
вводимую с клавиатур строку с парамтрами для программы: тип данных, которые 
будет сортировать алгоритм, последовательность сортировки (в порядке возрастания 
или в порядке убывания), название выходного файла, хранящего данные в 
отсортированном виде и перечень исходных файлов, содержащих данные для 
ортировки. Параметры заностся через пробел. Затем управление переходит к методу 
"fileReader" класса "FileReaderClass". Этот метод подключается к каждому из 
исходных файлов поочереди и заносих данные из них массив. Следующим контроль 
получает класс "ArrayClass". Он принимает данные от экземпляров классов 
"FileReaderClass" и "ProgOptions" в свой конструктор, после чего исходя из 
параметра "тип данных" от "ProgOptions" он либо преобразует массив строк, 
полученный от "FileReaderClass" в массив чисел, либо же сразу передает массив 
дальше. Затем управление переходит к экземпляру класса "MergerClass". Этот 
класс получает в свой конструктор данные от экземпляра класса "ArrayClass" и
от экземпляра класса "ProgOptions". Передаются в него следующие данные: массив 
чисел и массив строк из "ArrayClass" настройки из "ProgOptions". Именно в 
данном классе один массив подвергается сортировке слиянием. Исходя из настроек, 
переданных в класс, методы класса либо сортируют массив счисел, либо массив 
строк. Последним получает управление экземпляр класса "FileWriterClass". 
В свой конструктор данный класс получает следующие данные: название 
выходного файла от "ProgOptions", числовой и строчный массив от "MergerClass" 
(в зависимости от настроек, один из них отсортиван), последоваательность 
сортировки и тип сортируемых данных от "MergerClass". Данный класс создает 
выходной класс и вносит в него данные согласно выбранной пользователем
последовательности сортировки.
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/

public class mergeSortProgramm {

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