//problem #16
//What is the sum of the digits of the number 21000?
import java.math.BigInteger;
public class Sample{
public static void main(String[] args){
String num = BigInteger.valueOf(2).pow(1000).toString();
int product =0;
       for(int i =0; i<num.length(); i++)
       	product+=Integer.parseInt(Character.toString(num.charAt(i)));
       System.out.println(product);
  }
}