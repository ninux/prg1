package multiply;

public class Multiplier
{
	public Multiplier()
	{
		
	}
	
	public int multiply(int a, int b)
	{	
		int result = 0;
		if((a==0) || (b==0)){
			return 0;
		} else if(a < b){
			for(int i = 0; i < b; i++){
				result += a; 
			}
		} else{
			for(int i = 0; i < a; i++){
				result += b;
			}
		}
		return result;
	}
}