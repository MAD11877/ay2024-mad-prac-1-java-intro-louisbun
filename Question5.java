import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();

    ArrayList <Integer> intList = new ArrayList<>();
    while(num-- > 0){
      int i = in.nextInt();
      intList.add(i);
    }

    int highest;
    int mode;
    for(int i : intList){
      int count = 0;
      for(int ii : intList){
        if(i == ii){
          count++;
        }
      }

      if(count > highest){
        highest = count;
        mode = i;
      }
    }
    System.out.println(mode);
  }
}
