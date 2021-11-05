/*
 * Tiana Noll-Walker
 * LA 8:Scanner 
 * Check
 */

public class ScannerLab {

   private java.util.Scanner scan;

   ScannerLab() {
      scan = new java.util.Scanner(System.in);
   }

   public void echoStrings() {
      String word;
      // declare an array to hold the 5 values
      String arr[] = new String[5];
      for (int i = 0; i < 5; i++) {
         // prompt for the value
         System.out.print("Enter word " + i + ": ");
         // get the input value
         word = scan.next();
         // echo the input value
         System.out.println("You entered " + word);
         // store the input value into the array
         arr[i] = word;
      }
      String line = "";
      // loop through the array and concatenate the values
      // put a space between the words
      for (int i = 0; i < 5; i++) {
         line = line + arr[i] + "";
      }
      System.out.println("The words you entered are: " + line);
   }

   public void echoIntsAndTotal() {
      int inputValue = 0;
      // declare an array to hold the 5 values
      int arr[] = new int[5];
      int total = 0;
      for (int i = 0; i < 5; i++) {
         // prompt for the value
         System.out.print("Enter integer value " + i + ": ");
         // get the input value
         if (scan.hasNextInt()) {
            inputValue = scan.nextInt();
            System.out.println("You enetered " + inputValue);
         } else {
            scan.next();
            System.out.println("you entered a non integer value. Using -99.");
         }
         // echo the input value
         System.out.println("You entered " + inputValue);
         // store the input value into the array
         arr[i] = inputValue;
      }
      {
         // loop through the array and add the values
         for (int i = 0; i < 5; i++)
            total += arr[i];
         System.out.println("The total of your values is " + total);
      }
   }

   public static void main(String[] args) {
      ScannerLab lab;
      lab = new ScannerLab();
      lab.echoStrings();
      lab.echoIntsAndTotal();
      // lab.echoIntsAndTotal();
   }
}
