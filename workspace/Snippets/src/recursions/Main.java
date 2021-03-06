package recursions;

/**
 * This is a test project to write a recursive method.
 * @author ninux
 * @version 1.0
 */
public class Main
{
	/**
	 * The main method is defining a fixed array of type integer
	 * with the values {1,2,3,4,5}. This array will be printed
	 * reverse with the method reverse
	 * @param args
	 */
	public static void main(String[] args)
	{
		int[] myRow = new int[]{1,2,3,4,5};
		reverse(myRow, (myRow.length-1));
	}

	/**
	 * This method is taking an array and prints it in reverse order.
	 * The index specifies the first element of the array that shall 
	 * be printed. The common value for the index is (array.length - 1).
	 * @param array
	 * @param index
	 */
	public static void reverse(int[] array, int index){
		System.out.println(array[index]);
		if(index > 0){
			reverse(array, index-1);
		}
	}
}