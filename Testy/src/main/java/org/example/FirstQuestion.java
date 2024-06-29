package org.example;
import java.util.Scanner;

//Первая задача

public class FirstQuestion {
    public static void main(String[] args) {

        System.out.println("Введите a");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Введите b");
        int b = scanner.nextInt();

        if (a>b){
            System.out.println("a > b");
        }
        else if (a==b) {
            System.out.println("a = b");
        } else{
            System.out.println("a < b");
        }
        System.out.println("Результат сложения - " + (a + b) + "\n" + "Результат вычитания - " + (a - b) + "\n" +
                "Результат деления - " + (((double)a/(double)b)) + "\n" + "Результат умножения - " + (a*b));
    }
}