//Problem #7
//What is the 10001st prime number?
import java.math.BigInteger;
public class Sample {
       public static void main(String[] args){
           int num = 3;
           int numPrimes =1;
           while(numPrimes < 10001){
               if(isPrime(num)){
                   numPrimes++;
               }
               if(numPrimes==10001)
                   {System.out.println(num);}
               num +=2;
           }
       }
       public static boolean isPrime(int i){
           String s = Integer.toString(i);
           BigInteger n = new BigInteger(s);
           return n.isProbablePrime(20); //Uses the Miller-Rabin primality test
       }
}