package com.andersen.test;
import static java.lang.System.out;
import java.util.Scanner;

public class OutputMoreThanSeven {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        MoreThanSeven number1 = new MoreThanSeven();
        out.println("Введите число: ");
        number1.setNumber(keyboard.nextInt());
        if (number1.getNumber() > 7) {
            out.println("Привет");
        }
        keyboard.close();
    }



}
