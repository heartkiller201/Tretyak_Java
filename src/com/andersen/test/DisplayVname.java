package com.andersen.test;
import java.util.Scanner;
import static java.lang.System.out;

public class DisplayVname {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Vname name1 = new Vname();
        out.println("Введите имя: ");
        name1.setName(keyboard.next());
        if (name1.getName().equals("Вячеслав")) {
            out.println("Привет, Вячеслав");
        } else {
                out.println("Нет такого имени");
            }
        keyboard.close();
        }

}
