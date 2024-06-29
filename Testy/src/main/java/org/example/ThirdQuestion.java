package org.example;

//Третья задача

public class ThirdQuestion {
    public static void main(String[] args) {

        int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int b = 0; b < 10; b++)
        { if (a[b] % 2 == 0){
            System.out.println(a[b]);
        } else continue;
        }
    }
}
