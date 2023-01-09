package com.gl.javafsd.paymoney;

import java.util.Scanner;

public class UIClass {

	public static void main(String[] args) {
		
		int n;
		int noOfTargets;
		int transactions[];
		System.out.println("Enter number of transactions: ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		transactions = new int[n];
		System.out.println("Enter the transaction records: ");
		for(int i=0;i<n;i++)
		{
			transactions[i]=sc.nextInt();
		}
		System.out.println("Enter the number of targets");
		noOfTargets=sc.nextInt();
		while(noOfTargets>0)
		{
			System.out.println("Enter the target: ");
			int target = sc.nextInt();
			TargetDeterminator td = new TargetDeterminator(transactions,target);
			td.determine();
			noOfTargets--;
		
	}

 }
}