import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
	    digitList=new ArrayList<Integer>();
	    if(num==0)
		    digitList.add(0);
		int hold=num;
		while(hold>0){
		digitList.add(0,hold%10);
			hold=num/10;
		}
		
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		int high=digitList.get(0);
		for(int i=0;i<digitList.size();i++){
		if(digitList.get(i)<high)
			return false;
			else
			high=digitList.get(i);
		}
		return true;

	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
