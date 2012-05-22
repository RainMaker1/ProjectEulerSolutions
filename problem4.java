//Problem #4
//A palindromic number reads the same both ways. The largest palindrome
//made from the product of two 2-digit numbers is 9009 = 91 × 99.
//Find the largest palindrome made from the product of two 3-digit numbers.

import java.lang.StringBuffer;

public class Sample {
      public static void main(String[] args){
              int biggest=0;

              for(int x =999; x>100; x--){
                      for(int y=999; y>100; y--)
                              if (isPal(x*y)&&((x*y)>biggest))
                                      biggest = (x*y);
              }
              System.out.println(biggest);
      }
      public static boolean isPal(int i){
              String inStr=Integer.toString(i);
              StringBuffer revStr;

              revStr = new StringBuffer(inStr);

              revStr.reverse();

              if (inStr.equalsIgnoreCase(revStr.toString()))
                      {return true;}
              else
                      {return false;}
      }
}