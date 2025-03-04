package com.example.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        List<Integer> resultList = new ArrayList<>();

        Calculator cal = new Calculator();
        Scanner scanner = new Scanner(System.in);

        /* 반복문 시작 */                                        
        boolean exit = true;
        int num1;
        int num2;
        while (exit) {    // exit 값이 true 일때만 반복
            while (true) {
                System.out.println("첫 번째 값을 입력 :");
                num1 = scanner.nextInt();         // 숫자(정수) 입력받기!
                if (num1 < 0) {
                    System.out.println("양의 정수만 입력하세요");
                    continue;
                }

                System.out.println("두 번째 값을 입력 :");
                num2 = scanner.nextInt();
                if (num2 < 0) {
                    System.out.println("양의 정수만 입력하세요");
                    continue;
                }
                break;

                System.out.println("+,-,*,/ 중에 하나만 입력하세요.");
                                String operation = scanner.next();
            }

        }

    }
