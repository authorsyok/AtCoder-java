package Beginner_249;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		int taka = (x / (a + c)) * a + Math.min(x % (a + c), a);
		int aoki = (x / (d + f)) * d + Math.min(x % (d + f), d);
		
		if(taka * b > aoki * e) 
			sb.append("Takahashi");
		else if(taka * b < aoki * e)
			sb.append("Aoki");
		else
			sb.append("Draw");
			
		System.out.println(sb);
	}
}
