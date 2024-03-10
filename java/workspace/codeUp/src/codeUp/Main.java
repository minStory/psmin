package codeUp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0 ; i<n ; i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=1 ; i<n ; i++) {
			int target=arr[i];
			int j=i-1;
			while(j>=0&&target<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=target;
		}
		
		for(int i=0 ; i<n ; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	static void f() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int a = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (arr[i] > a) {
				System.out.println(i + 1);
				break;
			}
			if(i==n-1) {
				System.out.println(n+1);
			}
		}
	}
}
