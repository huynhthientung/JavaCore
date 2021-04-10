package com.example.hello;

public class Hello {
    public static void main(String[] args) {
        int a = 0;
        while (a < 21) {
            if (a == 8) {
                a++;
                continue;
            }
            System.out.println(a);
            a++;
        }
    }
}
