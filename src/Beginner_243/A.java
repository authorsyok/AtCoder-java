package Beginner_243;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int v = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		String ans = "";
		
		v = v % (a + b + c);
		
		if(v - a < 0) 
			ans = "F";
		else if(v - a - b < 0) 
			ans = "M";
		else
			ans = "T";
		
		System.out.println(ans);
	}
}
