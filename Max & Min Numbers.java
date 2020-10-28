import java.util.Random;
import java.util.Scanner;
/**
 * Class Max & Min Numbers
 */
 
  /**
* @author  Andrew Kuekam
* @version 1.0
* @since   2020-10-17
*/
public class MaxMinNumbers {
  public static void main(String[] args) {
    
    //This genarate number between 1 and 10
    int num = 100;
    Random rand = new Random();
    
    //Array
    int[] numbers = new int[10];
    
    //for loop that generate the numbers into and array
    for(int counter = 0; counter < numbers.length; counter++) {
      //generate the random number
      int random = rand.nextInt(num);
      numbers[counter] = random;
      System.out.println(random);
    }
    
    //this is calling the Max val function
    int maxValue = GetMaxValue(numbers);
    int minValue = GetMinVal(numbers);
    
    //Display the value
    System.out.println(" The maxValue is: " + maxValue);
    System.out.println(" The minValue is: " + minValue);
  }
  public static int GetMinVal(int[] numbers) {
    //declare min
    int minValue = 100;
    
    //for loop
    for (int counter = 1; counter < numbers.length; counter++) {
      if (numbers[counter] < minValue){
        minValue = numbers[counter];
      }
    }
    return minValue;
  }
  
public static int GetMaxValue(int[] numbers) {
    // declare max
    int maxValue = 0;
    
    //if array value is greater max val set it to array value
    for(int counter = 1; counter < numbers.length; counter++) {
      if (numbers[counter] > maxValue){
        maxValue = numbers[counter];
      }
    }
    return maxValue;
  }
}
