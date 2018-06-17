// Sarah Park
// 06/15/2018
// Java Project #1
//
// Enter string and prints a reverse string.

import java.util.*;
public class ReverseString {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      String enter = words(console);
      int letters = enter.length();
      String reverse = newWords(enter, letters);
      System.out.print(reverse);
   }
   
   // Takes in console. Enters a string and returns it
   // as intput.
   public static String words(Scanner console) {
      System.out.print("Enter a string: ");
      String input = console.nextLine();
      return input;
   }
   
   // Takes in entered string and its length. Computes the
   // index. Reverses string and returns it as output.
   public static String newWords(String enter, int letters) {
      int index = letters - 1;
      char[] after = new char[letters];
      for (int i = 0; i < letters; i++) {
         after[i] = enter.charAt(index - i);
      }
      String output = new String(after);
      return output;
   }
}