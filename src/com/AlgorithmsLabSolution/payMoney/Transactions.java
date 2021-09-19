package com.AlgorithmsLabSolution.payMoney;


import java.util.Scanner;

public class Transactions {
	private static Scanner sc= new Scanner(System.in);
	private static int transactionsArraySize ;
	private static int inputArray[];
	private static int noOfTargets;
	
	public static void main(String args[]){		

		//getting transaction size as input
		System.out.println("Enter the size of transaction array");
		transactionsArraySize=sc.nextInt();
		inputArray= new int [transactionsArraySize];
		//getting traction values as input
		System.out.println("Enter the values of Transaction");		
		//storing values of transaction in inputArray
		for (int i=0; i<transactionsArraySize;i++) {
			inputArray[i]=sc.nextInt();
		}
		// total no of targets as input
		System.out.println("Enter the total no of targets that needs to be achieved" );
		noOfTargets= sc.nextInt();
		for (int j=0;j<noOfTargets;j++) {
		System.out.println("\nEnter the value of target ");
		int target=sc.nextInt();
		 for (int k=0,sum =0;k<transactionsArraySize && sum<target;k++) {
			 sum=sum+inputArray[k];                           

			// comparing with target at each iteration
			 if (sum >=target){ //Target achived								
				 int l=k+1;
				 System.out.println("Target achieved in " + l + " transactions \n" ); 
				 }
			 else if(k==transactionsArraySize-1 && sum<target ){ //Target never achived
				 System.out.println("Target was never achieved " );
			 	}
			} 
		}
	}
}
