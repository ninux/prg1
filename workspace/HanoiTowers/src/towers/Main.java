package towers;

public class Main{
	public static void main(String[] args){
		moveDisk("A", "B", "C", 4);
	}

	public static void moveDisk(String from, String via, String to, int n){
		if(n==1){
			System.out.println("Move Disk from " + from + " to " + to);
		}else{
			moveDisk(from, to, via, n-1);
			moveDisk(from, "", to, 1);
			moveDisk(via, from, to, n-1);
		}
	}
}