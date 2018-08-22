package com.circleci.junit.integration;

public class Calculate {
	
	public boolean Input(int score) {
		if(score > 100 || score < 0) {
			return false;
		}
		return true;
	}
	
	public String grade(int score) {
		String grade = "";
		if(score > 100 || score < 0) {
			grade = "X";
		}else if(score >= 80) {
			grade = "A";
		}else if(score >= 70) {
			grade = "B";
		}else if(score >= 60) {
			grade = "C";
		}else if(score >= 50) {
			grade = "D";
		}else {
			grade = "F";
		}
		return grade;
	}
	
}
