package maxSubSum;

import java.util.Random;

public class Main
{
	public static void main(String[] args)
	{	
		// this is the sequence given by the exercise
		int[] mySeq = new int[]{5, -8, 3, 4, -5, 7, -2, -7, 3, 5};
		maxSubtotal(mySeq, true);
	
		// now do a random sequence
		mySeq = getRandomArray(mySeq, 10, true);
		maxSubtotal(mySeq, true);
	}
	
	public static int maxSubtotal(int[] sequence, boolean showMaxSequence){
		
		int start = 0;
		int end = 0;
		int max = Integer.MIN_VALUE;
		
		// build the sum from start
		for(int i = 0; i < sequence.length; i++){
			
			int subtotal = 0;
			
			for(int a = 0; a <= i; a++){
				for(int b = a; b <=i; b++){
					subtotal += sequence[b];
				}
				if(subtotal > max){
					start = 0;
					end = i;
					max = subtotal;
				}
				subtotal += sequence[a];
			
				if(subtotal > max){
					start = 0;
					end = i;
					max = subtotal;
				}
				subtotal = In
			}
		}
		
		if(showMaxSequence){
			System.out.print("The subsequence with the maximum sum is {");
			for(int i = start; i <= end; i++){
				System.out.print(sequence[i]);
				if(i!=end){
					System.out.print(", ");
				}
			}
			System.out.print("} = " + max);
			System.out.println("");
		}
		
		return max;
	}
	
	public static int[] getRandomArray(int[] array, int range, boolean signed){
		Random rand = new Random();
		int offset = 0;
		
		if(signed){
			offset = (range/2);
		}
		
		for(int i = 0; i < array.length; i++){
				array[i] = rand.nextInt(range) - offset;
		}
		return array;
	}
}