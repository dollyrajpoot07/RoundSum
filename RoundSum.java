// Round Sum
// For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values. To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times. Write the helper entirely below and at the same indent level as roundSum().
// roundSum(16, 17, 18) → 60
// roundSum(12, 13, 14) → 30
// roundSum(6, 4, 4) → 10

// Code: 
import java.util.*;
public class RoundSum {
public static int roundSum(int a, int b, int c) {
  int sum = round10(a) + round10(b) + round10(c);
  return sum;
}

public static int round10(int n) {
  int rem = n % 10;
  int div = n / 10;
  if(rem >= 5) {
    rem = (div * 10) + 10; 
  } else {
    rem = (div * 10) + 0; 
  }
  return rem;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value of a: ");
    int a = sc.nextInt();
    System.out.print("Enter value of b: ");
    int b = sc.nextInt();
    System.out.print("Enter value of c: ");
    int c = sc.nextInt();
    int roundAnswer = roundSum(a, b, c);
    System.out.println("Round Sum is: " + roundAnswer);
    sc.close();
}
}