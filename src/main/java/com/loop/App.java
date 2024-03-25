package com.loop;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Tabla del " + num);

        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }
}
