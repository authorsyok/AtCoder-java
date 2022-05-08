package Beginner_236;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		StringBuilder sb = new StringBuilder(str);
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()) -1;
		int b = Integer.parseInt(st.nextToken()) -1;
		
		sb.setCharAt(a, str.charAt(b));
		sb.setCharAt(b, str.charAt(a));
		
		System.out.println(sb);	
	}
}
