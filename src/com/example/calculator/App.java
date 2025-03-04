package com.example.calculator;

import java.util.Scanner;

public class App {
    package com.example.calculator;

    public class App {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);  // 입출력 Scanner 객체 소환

            int num1;
            int num2;
            boolean exit = true;

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
                }


                while (true) {

                    System.out.println("+,-,*,/ 중에 하나만 입력하세요.");
                    String operation = scanner.next();        // 사칙연산 기호 입력받기
                    // 계산기 사칙연산
                    int result;

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
                                continue;
                            }
                            result = num1 / num2;
                            System.out.println("결과값 :" + result);
                            break;
                        default:
                            System.out.println("연산자 기호를 잘못입력했습니다.");
                            continue;
                    }
                    break;

                }
                scanner.nextLine();
                System.out.println("계속 하시겠습니까? exit 입력시 종료, 그외 입력시 계속");
                String end = scanner.nextLine();
                if (end.equals("exit")) {
                    exit = false;
                    System.out.println("계산기 종료");   // 종료
                }
            }
        }
    }

}
