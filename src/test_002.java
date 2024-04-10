package 자료구조;

import java.util.Scanner;

public class test_002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<A.length; i++) {
			A[i]=sc.nextInt();
		}
		int max=0;
		int sum =0;
		for(int i=0; i<A.length; i++) {
			if(A[i]>max) {
				max = A[i];
			}
			sum += A[i];
		}
		//sum * 100 / max / N 출력하기
		System.out.println(sum*100/max/N);
		
		sc.close();

	}

}

