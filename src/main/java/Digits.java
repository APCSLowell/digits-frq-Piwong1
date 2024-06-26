import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
	     digitList = new ArrayList<Integer>();
    digitList.add(0, (num % 10));

    int hold = num / 10;
    while(hold > 0)
    {
        digitList.add(0, (hold % 10));
        hold =hold/ 10;
    }
		
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
	for (int i = 0; i < digitList.size() - 1; i++) {
        if (digitList.get(i) >= digitList.get(i + 1)) {
            return false;
        }
    }
    return true;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
