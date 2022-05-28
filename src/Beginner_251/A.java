package Beginner_251;

import java.io.*;
import java.util.*;

public class A {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		
		while(sb.length() < 6)
			sb.append(str);
		
		System.out.println(sb);
	}
	
}
