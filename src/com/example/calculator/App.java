package com.example.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);

        /* 반복문 시작 */

        // exit 값이 true 일때만 반복

        while (true) {
            System.out.println("첫 번째 값을 입력 :");
            int num1 = sc.nextInt();         // 숫자(정수) 입력받기!
            if (num1 < 0) {
                System.out.println("양의 정수만 입력하세요");
                continue;
            }
            System.out.println("두 번째 값을 입력 :");
            int num2 = sc.nextInt();
            if (num2 < 0) {
                System.out.println("양의 정수만 입력하세요");
                continue;
            }
            //사칙연산 기호 입력받기
            System.out.println("+,-,*,/ 중에 하나만 입력하세요.");
            char operation = sc.next().charAt(0);

            // 연산 후 결과 //
            int result = cal.startCal(num1, num2, operation);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String end = sc.nextLine();

            if (end.equals("exit")) {
                System.out.println("계산기 종료");
                return;
                // 종료
            }
        }
    }
}