package com.example;

public class Calculator {

    

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0){
            throw new IllegalArgumentException("Деление на ноль запрещено!");
        }
        return a / b;
    }

    public double calculateDiscount(double a, int b){
         if (a <= 0 | b <= 0){
            throw new IllegalArgumentException("Цена или скидка не может быть меньше или равна нулю!");
        }
        return (a - (b*(a/100)));
    }

    public int add(int a, int b) {
        return a + b;
    }

}

