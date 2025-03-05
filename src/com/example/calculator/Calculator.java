package com.example.calculator;


import java.util.Scanner;

public class Calculator {
    Scanner sc = new Scanner(System.in);  // 입출력 Scanner 객체 소환

    int num1;
    int num2;



        while(true){

        System.out.println("+,-,*,/ 중에 하나만 입력하세요.");
        String operation = sc.next();        // 사칙연산 기호 입력받기


        int result;

        // 연산 //
        switch (operation) {
            case "+":
                result = num1 + num2;
                System.out.println("결과값 :" + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("결과값 :" + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("결과값 :" + result);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                result = num1 / num2;
                System.out.println("결과값 :" + result);
                break;
            default:
                System.out.println("연산자 기호를 잘못입력했습니다.");


        }

    }
}