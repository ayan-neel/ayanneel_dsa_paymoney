package com.gl.javafsd.paymoney;

import java.util.Arrays;

public class TargetDeterminator {
	private int [] transactions;
	private int dailyTarget;
	private boolean targetAchieved;
	private int counter;
	
	public TargetDeterminator(int [] transactions, int dailyTarget) {
		this.transactions=transactions;
		this.dailyTarget=dailyTarget;
	}

	public int[] getTransactions() {
		return transactions;
	}

	public int getDailyTarget() {
		return dailyTarget;
	}

	public boolean isTargetAchieved() {
		return targetAchieved;
	}
	public void determine()
	{
		//core implementation
		counter=0;
		targetAchieved=false;
		int result=0;
		for(int i=0;i<transactions.length;i++)
		{
			result+=transactions[i];
			if(result>=dailyTarget) {
				targetAchieved=true;
				counter=i+1;
				break;
			}
				
		}
		result();
		
	}
	private void result()
	{
			System.out.println(Arrays.toString(transactions));
			if(isTargetAchieved())
			{
				System.out.println("Target "+ getDailyTarget()+" is achieved after "+ getCounter()+" transaction(s)");
			}
			else
				System.out.println("Target cannot achieved");
		}

	public int getCounter() {
		return counter;
	}
	

}
