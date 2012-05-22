
//problem #10
//Calculate the sum of all the primes below two million.
import java.math.BigInteger;

public class Sample{
    public static void main(String[] args){
        long sum = 2L;
        for(int i=3; i<2000000; i+=2){
            if(isPrime(i)){
                sum += i;
            }
        }
        System.out.println(sum);
    }
     public static boolean isPrime(int i){
         String s = Integer.toString(i);
         BigInteger n = new BigInteger(s);
         return n.isProbablePrime(10); //Uses the Miller-Rabin primality test
     }
}
