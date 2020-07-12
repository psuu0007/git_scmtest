package com.edu.test;

import java.util.Scanner;

import com.edu.main.Calc;

public class SumUntilTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int[] userInputNumArr = new int[2];
		
		System.out.println("sum_until 프로그램입니다.");
		for (int i = 0; i < userInputNumArr.length; i++) {
			System.out.println("숫자를 입력해주세요");
			
			userInputNumArr[i] = scan.nextInt();
		}
		System.out.println();
		
		int resultNum = 0;
		
		
		Calc calc = new Calc();
		
		for (int i = 0; i < userInputNumArr.length; i++) {
			resultNum = calc.untilSum(userInputNumArr[i]);
			
			calc.untilSumView(userInputNumArr[i], resultNum);
		}
		
	}

}
