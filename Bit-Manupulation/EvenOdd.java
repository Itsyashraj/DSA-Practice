import java.util.Scanner;

public class EvenOdd {

  public boolean checkEven(int n) {

    return ((n & 1) == 0);
  }

  Public static void main (String [] args) {

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    if(checkEven(num)
       System.out.println("Even");
    else
      System.out.println("Odd");
  }
}
