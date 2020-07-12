package com.edu.main;

public class Calc {

	public int untilSum(int userInputNum) {
		int result = 0;

		for (int i = 1; i <= userInputNum; i++) {
			result = result + i;
		}

		return result;
	}
	
	public void untilSumView(int userInputNum, int resultNum) {
		
		String viewStr = "";
		
		viewStr = "1~" + userInputNum + " 사이의 정수: " + resultNum;
		
		System.out.println(viewStr);
		
	}

}
