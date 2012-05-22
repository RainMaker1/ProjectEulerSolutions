//problem #12
//What is the value of the first triangle number to have over five
hundred divisors?
public class Sample{
       public static void main(String[] args){
               int count = 1;
               int triangle = 0;
               boolean go = true;
               while (go) {
                       triangle +=count;
                       if (numDivisors(triangle) > 500){
                               System.out.println(triangle);
                               go = false;
                       }
                       count ++;
               }
       }
       public static int numDivisors(int n){
               int numFactors = 0;
               int count =1;
               while (count <= ((int)Math.sqrt(n))){
                       if(n%count ==0){
                               numFactors+=2;
                       }
                       count++;
               }
               return numFactors;
       }
}