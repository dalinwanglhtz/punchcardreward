package com.codewardev;

// https://www.codewars.com/kata/5976575438480829ff000041/train/java

public class Solution {

	public static String CalculateReward(int currentPoint, int numJewelry) {
		int totalPoints = currentPoint + numJewelry;
		int pointLeft = totalPoints % 6;
		int freeItems = totalPoints / 6;
		int payItems = numJewelry - freeItems;
		
		return "Point Left: "+pointLeft+". Free Item: "+freeItems+". Pay Item: "+payItems;
	}

}
