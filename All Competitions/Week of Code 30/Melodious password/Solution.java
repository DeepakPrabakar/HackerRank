import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

		String vowels = "aeiou";
		String consonants = "bcdfghjklmnpqrstvwxz";

		ArrayList<String> words = new ArrayList<>();
		Random randomGenerator = new Random();
		int total1 = 1,total2 = 1,total = 0;

		for (int k = 0; k < n; k++) {
			// starting vowel
			if (k % 2 == 0) {
				total1=total1*vowels.length();
			}
			if (k % 2 == 1) {
				total1=total1*consonants.length();
			}
			if (k % 2 == 1) {
				total2=total2*vowels.length();
			}
			if (k % 2 == 0) {
				total2=total2*consonants.length();
			}
		}
		total=total1+total2;
		
		while (words.size() < total) {

			String s = "";
			for (int k = 0; k < n; k++) {
				// starting vowel
				if (k % 2 == 0) {
					int random = randomGenerator.nextInt(vowels.length());
					s = s + vowels.charAt(random);
				}
				if (k % 2 == 1) {
					int random = randomGenerator.nextInt(consonants.length());
					s = s + consonants.charAt(random);
				}
			}
			if (!words.contains(s)) {
				words.add(s);
			}
			 s = "";
			for (int k = 0; k < n; k++) {
				// starting consonant
				if (k % 2 == 0) {
					int random = randomGenerator.nextInt(consonants.length());
					s = s + consonants.charAt(random);
				}
				if (k % 2 == 1) {
					int random = randomGenerator.nextInt(vowels.length());
					s = s + vowels.charAt(random);
				}
			}
			if (!words.contains(s)) {
				words.add(s);
			}
		}
		for(String word: words)
			System.out.println(word);
    }
}
