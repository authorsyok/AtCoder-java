package Beginner_250;

import java.io.*;
import java.util.*;

public class A {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		int ans = 0;
		
		if(r > 1)
			ans++;
		if(c > 1)
			ans++;
		if(r < h)
			ans++;
		if(c < w)
			ans++;
		
		System.out.println(ans);
	}

}
