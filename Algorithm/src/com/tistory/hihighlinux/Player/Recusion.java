package com.tistory.hihighlinux.Player;

public class Recusion {
	public static void main(String[] args) {
		int result = func1(4);
		System.out.println(result);
	}
	
	public static int func1(int n) {
			if(n <= 0) {
				return 0;
			} else {
				System.out.println("Hello...");
				return n + func1(n-1);
			}
			
	}
}
