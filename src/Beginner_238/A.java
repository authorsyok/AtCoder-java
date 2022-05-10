package Beginner_238;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String ans = "";
		
		if(n >= 2 && n <=4) {
			ans = "No";
		}
		else {
			ans = "Yes";
		}
		System.out.println(ans);
	}
}
