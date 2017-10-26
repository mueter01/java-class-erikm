package exercise1;

import java.util.Scanner;
import java.util.Random;

/**
 * @author yasiro01
 */
public class Ex1Driver {
  public static void main(String args[]) {
    Random rnd = new Random();
    rnd.setSeed(252);
    int[] numbers = new int[10];
    for (int i = 0; i < 10; i++) {
      numbers[i] = rnd.nextInt(10);
  }
    task1();
    task2();
    task3();
    task4();
    task5();
//    task6();
//    task7();
//    task8(numbers);
//    task9();
//    task10();
  }

  /**
   * TODO: Task 1: Print "Hello World" to the default system output
   */
  public static void task1() {
      System.out.println("Hello World");
   // throw new UnsupportedOperationException("Task 1 is not implemented yet.");
  }
  /**
   * TODO: Task 2: Print all numbers between 1 and 100 (inclusive) replacing all multiples of 3 with "foo", multiples of 5 with "bar", multiples of 3 and 5 with "huh"
   */
  public static void task2() {
     // int array_size = 100;
      int num;
      for (num = 1; num <= 100; num++) {
        if (num % 3 == 0 && num % 5 == 0) {
        System.out.printf("huh\n"); }
        else if (num % 3 == 0) {
        System.out.printf("foo\n"); }
        else if (num % 5 == 0) {
        System.out.printf("bar\n"); }
        else {
        System.out.printf(num + "\n"); }
        
      }
 //   throw new UnsupportedOperationException("Task 2 is not implemented yet.");
  }
  /**
   * TODO: Task 3: Calculate and print the sum of all multiples of 7 between 1 and 100 (inclusive)
   */
  public static void task3() {
      int x = 0;
      int y = 1;
      for (y = 1; y <= 100; y++) {
        if(y % 7 == 0) {
            x = x + y;
        }
      }
      System.out.print(x + "\n");
        }
  
   // throw new UnsupportedOperationException("Task 3 is not implemented yet.");
  
  /**
   * TODO: Task 4: Calculate and print sum and product of all numbers between 1 and 20 (inclusive)
   */
  public static void task4() {
      int num1 = 1;
      int sum = 0;
      int prod = 1;
      for (num1 = 1; num1 >= 20; num1++) {
          sum = sum + num1;
          prod = prod * num1; }
      System.out.printf("sum = " + sum + ", product = " + prod + "\n"); 
      }
 //   throw new UnsupportedOperationException("Task 4 is not implemented yet.");
  
  /**
   * TODO: Task 5: Ask a user to enter their full name and print the initials (ie John Q Doe should yield JQD)
   */
  public static void task5() {
    Scanner keyboard = new Scanner(System.in);
    System.out.printf("Enter your full name%n");
    String fullName = keyboard.nextLine();
    
    //throw new UnsupportedOperationException("Task 5 is not implemented yet.");
  }
  /**
   * TODO: Task 6: Create an array of 10 elements and initiate each element in it to the cube of its index (Do it in a loop, not during declaration)
   */
  public static void task6() {
    throw new UnsupportedOperationException("Task 6 is not implemented yet.");
  }
  /**
   * TODO: Task 7: Create an array of 100 random integers between 1 and 100, ask the user for an integer and tell if that number is in the array
   */
  public static void task7() {
  //  Random rnd = new Random();
  //  rnd.setSeed(100);
    throw new UnsupportedOperationException("Task 7 is not implemented yet.");
  }
  /**
   * TODO: Task 8: Take an array of integers as a parameter, calculate, print, and return the sum of its elements
   * @param numbers
   * @return 
   */
  public static int task8(int[] numbers) {
    throw new UnsupportedOperationException("Task 8 is not implemented yet.");
  }
  /**
   * TODO: Task 9: Ask a user to enter a word and write a function that tells if letters of a word are ordered (ie. "buy" would return true, while "bye" - false).
   * @return 
   */
  public static boolean task9() {
    throw new UnsupportedOperationException("Task 9 is not implemented yet.");
  }
  /**
   * TODO: Task 10: Implement sieve of Eratosthenes and print all prime numbers between 1 and 100
   */
  public static void task10() {
    throw new UnsupportedOperationException("Task 3 is not implemented yet.");
  }

}
