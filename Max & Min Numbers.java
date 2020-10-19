import java.util.Scanner;
/**
 * Class Max & Min Numbers
 */
 
  /**
* @author  Andrew Kuekam
* @version 1.0
* @since   2020-10-17
*/
public class GetMaxVal {
	public static void main(String[] args) 
	{
		//This read the input from the console
		Scanner userInput = new Scanner(System.in);
		
		// declare int
		int maxValue = number[99];
		int Counter;
		
		//
		for(int Counter = 1; Counter < numbers.length; Counter++)
		{
			maxValue = number[Counter];
		}
		return maxValue;
	}
}
	public static int GetMinVal(int[] numbers)
	{
		//
		int minValue = numbers[1];
		
		//
		for (int Counter = 1; Counter < numbers.length; Counter++))
		{
			if (number[Counter] < minValue)
			{
				minValue = number[Counter];
				
			}
			return minValue;
		}
	}
