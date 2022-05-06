package Beginner_234;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {

	public static int func(int t) {
		return t*t + t * 2 + 3;
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		int ans = func(func(func(t) + t) + func(func(t)));
		System.out.println(ans);
	}
}
