//Problem #3
//The prime factors of 13195 are 5, 7, 13 and 29.
//What is the largest prime factor of the number 600851475143 ?

public class Euler {
       public static void main(String[] args){
               long n = 600851475143L;
               long factor = 2L;
               long lastFactor = 1L;
               while(n>1){
                       if((n % factor) ==0) {
                               lastFactor = factor;
                               n=n/factor;
                               while((n%factor)==0){
                                       n=n/factor;
                               }
                       }
                       factor++;
               }
               System.out.println(lastFactor);
       }
}