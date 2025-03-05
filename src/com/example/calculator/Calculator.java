package com.example.calculator;

public class Calculator {

        public int startCal(int num1, int num2, char operation){

        int result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("결과값 :" + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("결과값 :" + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("결과값 :" + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                result = num1 / num2;
                System.out.println("결과값 :" + result);
                break;
            default:
                System.out.println("연산자 기호를 잘못입력했습니다.");

        }
            return result;
        }

}