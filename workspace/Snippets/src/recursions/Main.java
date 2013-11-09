package recursions;

//package recursions;

public class Main
{
	public static void main(String[] args)
	{
		int[] myRow = new int[]{1,2,3,4,5};
		reverse(myRow, (myRow.length-1));
	}
	
	public static void reverse(int[] array, int index){
		System.out.println(array[index]);
		if(index > 0){
			reverse(array, index-1);
		}
	}
}