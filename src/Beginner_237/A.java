package Beginner_237;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		long n = Long.parseLong(br.readLine());
		
		if(n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE)
			sb.append("Yes");
		else
			sb.append("No");
		
		System.out.println(sb);	
	}
}
