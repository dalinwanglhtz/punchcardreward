package com.codewardev;

// https://www.codewars.com/kata/5976575438480829ff000041/train/java

public class Solution {

	public static String CalculateReward(int currentPoint, int numJewelry) {
		int totalPoints = currentPoint + numJewelry;
		int freeItems = totalPoints / 6;
		
		return "Point Left: "+totalPoints % 6+". Free Item: "+freeItems+". Pay Item: "+(numJewelry - freeItems);
	}

}
