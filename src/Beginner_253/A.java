package Beginner_253;

import java.io.*;
import java.util.*;

public class A {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		sb.append((a <= b && b <= c) || (c <= b && b <= a) ? "Yes" : "No"); 

		System.out.println(sb);
	}
}
