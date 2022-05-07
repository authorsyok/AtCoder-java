package Beginner_241;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int first = arr[0];
		int second = arr[first];
		int third = arr[second];
		
		System.out.println(third);	
	}
}
