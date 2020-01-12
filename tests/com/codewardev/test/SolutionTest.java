package com.codewardev.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.codewardev.Solution;

class SolutionTest {

	@Test
    public void testSomething() {
        assertEquals("Point Left: 0. Free Item: 1. Pay Item: 2", Solution.CalculateReward(3, 3));
        assertEquals("Point Left: 0. Free Item: 4. Pay Item: 0",Solution.CalculateReward(20, 4));
        assertEquals("Point Left: 3. Free Item: 10. Pay Item: 17", Solution.CalculateReward(36, 27));
   }

}
