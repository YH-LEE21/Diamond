package test;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int num;
		System.out.println("Not a multiple of 2");
		do {
			System.out.print("Number:");
			num=scn.nextInt();
		}while(num%2==0);
		int mid=num/2+1;
		for(int i=0;i<mid;i++) {
			for(int j=mid;j>=i;j--) {
				System.out.print(" ");
			}
			for(int z=0;z<i*2-1;z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=mid;i>0;i--) {
			for(int j=mid;j>=i;j--) {
				System.out.print(" ");
			}
			for(int z=0;z<i*2-1;z++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
