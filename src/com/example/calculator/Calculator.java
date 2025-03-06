package com.example.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private final List<Integer> resultList = new ArrayList<>();

    // 계산 메서드

    public int startCal(int num1, int num2, char operation) {
        int result;
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
        //Setter
        public void setResultList (int result){
            this.resultList.add(result);
        }

        //Getter
        public List<Integer> getResultlist () {
            return this.resultList;
        }

        //가장 먼저 저장된 데이터를 삭제하는 기능
        public void removeResult () {
            this.resultList.remove(0);
        }
    }
