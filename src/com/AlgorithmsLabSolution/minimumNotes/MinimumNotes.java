package com.AlgorithmsLabSolution.minimumNotes;


import java.util.Scanner;

public class MinimumNotes {
	private static Scanner sc = new Scanner( System.in ); 
	
	public static void main( String[] args ) {
		// get the number of denominations (eg. 3)
		System.out.println( "How many denominations?" );
		int size = sc.nextInt();
		
		// allocate the array called "notes" to hold denominations
		int[] notes = new int[size];
		int[] numNotes = new int[size];
		
		// get the denominations in a loop (500, 2000, 100)
		System.out.println("Enter the currency denominations value : ");
        for(int i = 0; i<size; i++){
            notes[i] = sc.nextInt();
        }
		
		// sort using merge sort
		MergeSortImplementation ms = new MergeSortImplementation();
		ms.sort( notes, 0, notes.length - 1 );
		
		// check if notes are sorted in descending order
		for(int i = 0; i<size; i++){
            System.out.println( notes[i] );
        }
		
		System.out.println( "What is the amount to pay" );
		int amount = sc.nextInt();
		
		// pick the notes
		for( int i = 0; i < notes.length; i++ ) {
			// find out how many notes of notes[i] to select (for example, how many notes of 2000 to select)
			int n = (int) ( amount / notes[i] );
			numNotes[i] = n;
			
			// set amount to the remaining amount
			amount = amount - ( n * notes[i] );
			
			// write a condition to find...
			// ...if it is not possible to pay the amount and print a message "Not possible to pay"
			if( i == notes.length - 1 && amount != 0 ) {
				System.out.println( "Not possible to pay" );
			} else if( i == notes.length - 1 && amount == 0 ) {
				for( int j = 0; j < numNotes.length; j++ ) {
					System.out.println( notes[j] + " : " + numNotes[j] );
				}
			}
		}
	}
}
