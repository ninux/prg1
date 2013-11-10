package sum;

public class Main
{
	public static void main(String[] args)
	{
		int[] myArray = new int[]{0,1,2,3,4,5,6,7,8,9};
		System.out.println(sum(myArray, myArray.length, 0));
	}
	
	public static int sum(int[] array, int length, int index)
	{
		
		if(index < (length-1)){
			return array[index] + sum(array, length, index+1);
		}
		else{
			return array[index];
		}
	}
}