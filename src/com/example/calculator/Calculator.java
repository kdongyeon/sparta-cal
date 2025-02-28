package com.example.calculator;


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // 입출력 Scanner 객체 소환

        boolean flag = true;
        while (true) {
            System.out.println("첫 번째 값을 입력 :");
            int num1 = scanner.nextInt();         // 숫자(정수) 입력받기!
            if (num1 < 0) {
                System.out.println("양의 정수만 입력하세요");
                continue;
            }
            System.out.println("두 번째 값을 입력 :");
            int num2 = scanner.nextInt();
            if (num2 < 0) {
                System.out.println("양의 정수만 입력하세요");
                continue;
            }
            break;
        }

        // 사칙연산 기호 받기
        System.out.println("+,-,*,/ 중에 하나만 입력하세요.");
        String operation = scanner.nextLine();

        // 계산기 사칙연산
        int result;
        while (true) {

            switch (operation) {       // 반복문 써서
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("0으로 나눌 수 없습니다.");
                        return;
                    }
                    result = num1 / num2;
                    break;   // 예외처리
            }
        }
        System.out.println("결과 값 : " + result);
        System.out.println("종료하시려면 exit를 입력, 다른 입력시 계속");
        String exit = scanner.nextLine();


    }
}
