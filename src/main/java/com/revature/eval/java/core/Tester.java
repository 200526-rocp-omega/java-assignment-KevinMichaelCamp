package com.revature.eval.java.core;

import java.util.ArrayList;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		int n = 8;
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= n / i; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
        System.out.println(factors);
		
	}
	
}
