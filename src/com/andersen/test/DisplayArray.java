package com.andersen.test;
import static java.lang.System.out;
import java.util.Scanner;

public class DisplayArray {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        out.println("Введите размер массива: ");
        int size = keyboard.nextInt();
        int[] myArray = new int[size];
        out.println("Введите массив из чисел: ");
        for (int i = 0; i < size; i++) {
            myArray[i] = keyboard.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (myArray[i]%3 == 0) {
                out.println(myArray[i]);
            }
        }
        keyboard.close();

    }


}
