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
        // Создаем массив из 20 элементов
        int[]even_numbers;
        even_numbers = new int[20];
        int i = 0;
        Random random_numbers = new Random();
        // Запускаем цикл while и заполняем его до тех пор, пока переменная i < 20 и заполняем массив случайными чётными числами
        while(i < 20) {
            int num = random_numbers.nextInt(100);
            if(num % 2 == 0) {
                even_numbers[i] = num;
                i++;
                
            }
        }
        // Выводим весь массив на экран
        System.out.println("Все элементы массива = " + Arrays.toString(even_numbers));
        
        // Далее находим максимальное значение при помощи цикла for, в котором с помощью условного оператор
        // if мы проверяем, является ли каждое последующее число массива больше предыдущего
        // В итоге переменной maximum мы присваеваем элемент максимального числа данного массива
        // И выводим на экран максимальный элемент массива
        int maximum = 0;
        for(int j = 0; j < even_numbers.length; j++) {
            if(even_numbers[j] > maximum) {
                maximum = even_numbers[j];
            }
        }
        System.out.println("Максимальный элемент массива: " + maximum);
        
        // Точно так же находим и минимальный элемент массива и выводим его на экран
        int minimum = 30;
        for(int c = 0; c < even_numbers.length; c++) {
            if(even_numbers[c] < minimum) {
                minimum = even_numbers[c];
            }
        }
        System.out.println("Минимальный элемент массива: " + minimum);
        System.out.println("");
        
        // Далее мы находим сколько всего максимальных и минимальных чисел и выводим их количество на экран
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
        
        // Создаем новый массив, в котором будут числа, за исключением максимальных и минимальных
        int[] remainder_numbers = new int[even_numbers.length - (max_numbers + min_numbers)];
        // Спортируем старый массив и копируем из старого в новый значения
        Arrays.sort(even_numbers);
        System.arraycopy(even_numbers, 0, remainder_numbers, 0, remainder_numbers.length);
        float average = 0;
        // Запускаем цикл и суммируем все числа нового массива, далее по формуле выводим среднее арифметическое чисел массива
        for(i=0;i<remainder_numbers.length;i++) {
            average += remainder_numbers[i];
        }
        System.out.println("Среднее арифметическое чисел массива = " + average / remainder_numbers.length);
    }
} 
    
        

    

