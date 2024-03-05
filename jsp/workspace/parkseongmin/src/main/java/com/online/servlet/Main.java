package com.online.servlet;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		int height = 0;
		int[] bars = new int[n];
		
		for(int i = 0; i < n; i++) {
			bars[i] = sc.nextInt();
		}
		
		for(int i = bars.length - 1; i >= 0; i--) {
			if(bars[i] > height) {
				height = bars[i];
				count++;
			}
		}
		
		System.out.println(count);
	}
}
