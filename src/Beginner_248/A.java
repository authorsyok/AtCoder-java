package Beginner_248;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int sum = 45;
		
		for(int i = 0; i < str.length(); i++) {
			sum -= str.charAt(i) - '0';
		}
		
		System.out.println(sum);
	}
}
