package org.example;
import java.util.Scanner;

//Вторая задача

public class SecondQuestion {
    public static void main(String[] args) {
        System.out.println("Введите первую строку");
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        System.out.println("Введите вторую строку");
        String second = scanner.nextLine();
        if (first.equals(second)) {
            System.out.println("Строки идентичны");
        } else System.out.println("Строки неидентичны");
    }
}
