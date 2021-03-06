package reverse;

public class Main
{
	public static void main(String[] args)
	{
		int[] myArray = new int[]{0,1,2,3,4,5,6,7,8,9};
		printBackAndForth(myArray, myArray.length, 0);
	}
	
	public static void printBackAndForth(int[] array, int length, int index)
	{
		System.out.println("Forward: ");
		printForth(array, length, index);
		System.out.println("\nBackwards: ");
		printBack(array, length, index);
	}
	
	public static void printForth(int[] array, int lenght, int index)
	{
		System.out.print(array[index] + ", ");
		
		if(index < (lenght-1)){
			printForth(array, lenght, index+1);
		}	
	}
	
	public static void printBack(int[] array, int length, int index)
	{
		if(index == array.length){
			return;
		}
		else{
			printBack(array, length, index+1);
			System.out.print(array[index] + ", ");
		}
	}
}