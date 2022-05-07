package Beginner_235;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int sum = 0;
		
		while(n != 0) {
			int k = n % 10;
			sum += (k * 100) + (k * 10) + k;
			n /= 10;
		}
		
		System.out.println(sum);
	}
}
