package 자료구조;

import java.util.Scanner;

public class test_001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String num = sc.next();
		char[] cNum = num.toCharArray();
		int sum = 0;
		for(int i=0; i<cNum.length; i++) {
			sum += cNum[i];
		}
		System.out.println(sum);
		sc.close();
	}

}
