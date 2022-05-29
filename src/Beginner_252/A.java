package Beginner_252;

import java.io.*;
import java.util.*;

public class A {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int n = Integer.parseInt(br.readLine());
		
		char ch = (char)(n - 97 + 'a');
		
		System.out.println(ch);
	}

}
