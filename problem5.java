//Problem #5
//What is the smallest number divisible by each of the numbers 1 to 20?

public class Sample {
      public static void main(String[] args){
          long n = 2432902008176640000L;
          int i=20;
          boolean go = true;
          while(go){
                  i+=20;
                  boolean divisible = true;
                  for(int j=11; j<21; j++){
                          if((i%j)!=0)
                                  divisible=false;
                  }
                  if (divisible){
                          System.out.println(i);
                          go=false;

                  }
          }
      }
}