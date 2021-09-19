/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evennumbers;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Влад
 */
public class EvenNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]even_numbers;
        even_numbers = new int[20];
        int i = 0;
        
        Random random_numbers = new Random();
        while(i < 20) {
            int num = random_numbers.nextInt(100);
            if(num % 2 == 0) {
                even_numbers[i] = num;
                i++;
                
            }
        }
        System.out.println("Все элементы массива = " + Arrays.toString(even_numbers));
        
        int maximum = 0;
        for(int j = 0; j < even_numbers.length; j++) {
            if(even_numbers[j] > maximum) {
                maximum = even_numbers[j];
            }
        }
        System.out.println("Максимальный элемент массива: " + maximum);
        
        int minimum = 30;
        for(int c = 0; c < even_numbers.length; c++) {
            if(even_numbers[c] < minimum) {
                minimum = even_numbers[c];
            }
        }
        System.out.println("Минимальный элемент массива: " + minimum);
        System.out.println("");
        
        int max_numbers = 0;
        for(i=0;i<even_numbers.length;i++) {
            if(even_numbers[i] == maximum) {
                max_numbers ++;
            }
        }
        System.out.println("Всего максимальных чисел в массиве: " + max_numbers);
        
        int min_numbers = 0;
        for(i=0;i<even_numbers.length;i++) {
            if(even_numbers[i] == minimum) {
                min_numbers ++;
            }
        }
        System.out.println("Всего минимальных чисел в массиве: " + min_numbers);
        
        int[] remainder_numbers = new int[even_numbers.length - (max_numbers + min_numbers)];
        Arrays.sort(even_numbers);
        System.arraycopy(even_numbers, 0, remainder_numbers, 0, remainder_numbers.length);
        float average = 0;
        for(i=0;i<remainder_numbers.length;i++) {
            average += remainder_numbers[i];
        }
        System.out.println("Среднее арифметическое чисел массива = " + average / remainder_numbers.length);
    }
} 
    
        

    

