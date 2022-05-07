package Beginner_240;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		String ans = "";
		
		if(Math.abs(a-b) == 1 || Math.abs(a-b) == 9)
			ans = "Yes";
		else
			ans = "No";
		
		System.out.println(ans);
	}
}
