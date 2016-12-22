package bignumber.bigdecimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] s = new String[n + 2];

		for (int i = 0; i < n; i++) {
			s[i] = scan.next();
		}
		scan.close();

		// Write your code here

		String newArray[] = new String[n];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = s[i];
		}

		Arrays.sort(newArray,
				Collections.reverseOrder(new Comparator<String>() {
					@Override
					public int compare(String a1, String a2) {
						BigDecimal a = new BigDecimal(a1);
						BigDecimal b = new BigDecimal(a2);
						return a.compareTo(b);
					}
				}));

		s = newArray;

		for (int i = 0; i < n; i++)
			System.out.println(s[i]);

	}
}
/*
 *
 IN:
 9
-100
50
0
56.6
90
0.12
.12
02.34
000.000

OP:
90
56.6
50
02.34
0.12
.12
0
000.000
-100

 */