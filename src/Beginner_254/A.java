package Beginner_254;

import java.io.*;
import java.util.*;

public class A {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(String.format("%02d", n % 100));
		
	}

}
