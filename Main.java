import java.util.*;
class Main {
  static void printPyramid (int n)
  {
    int spaces=n-1;
    for(int i=0; i<n; i++)
    {
      for(int k=spaces; k>=0; k--)
      {
        System.out.print(" ");
      }
      spaces--;
      for (int j=0; j<=i; j++)
      {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    printPyramid(n);
  }
}