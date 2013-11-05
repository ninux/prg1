package search;

import java.util.Random;

public class Main
{
	public static void main(String[] args)
	{
		// create a random sequence
		Random rand = new Random();
		int size = 10;
		int range = 100;
		int[] seq = new int[size];
		String sequence = "Sequence: ";
		for(int i = 0; i < size; i++){
			seq[i] = rand.nextInt(range) - (range/2);
			sequence += seq[i] + ", ";
		}
		
		// show the sequence
		System.out.println(sequence);
		
		// get the biggest value
		System.out.println("Biggest value in sequence: " + getBiggest(seq));
		
		// get smallest value
		System.out.println("Smallest value in sequence:" + getSmallest(seq));
	}
	
	public static int getBiggest(int[] sequence)
	{
		int biggest = sequence[0];
		for(int i = 0; i < sequence.length; i++){
			if(sequence[i] > biggest){
				biggest = sequence[i];
			}
		}
		return biggest;
	}
	
	public static int getSmallest(int[] sequence)
	{
		int smallest = sequence[0];
		for(int i = 0; i < sequence.length; i++){
			if(sequence[i] < smallest){
				smallest = sequence[i];
			}
		}
		return smallest;
	}
}