package Beginner_245;

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
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		String ans = "";
		
		if(a < c) 
			ans = "Takahashi";
		else if(a > c)
			ans = "Aoki";
		else {
			if(b <= d)
				ans = "Takahashi";
			else
				ans = "Aoki";
		}
		
		System.out.println(ans);
	}
}
