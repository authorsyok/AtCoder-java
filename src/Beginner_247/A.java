package Beginner_247;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		// 첫 문자는 0 이다.
		str = '0' + str;	
		//substring(처음값, 마지막값)
		str = str.substring(0, str.length() - 1);	
		System.out.println(str);
	}
}
