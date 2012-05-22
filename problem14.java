//problem #14
//Find the longest sequence using a starting number under one million.

public class Sample{
       public static void main(String[] args){
               int biggestCount = 0;
               int biggestNumber = 0;
               for(int i =1000000; i>100; i--){
                       if (collatzNum(i)>biggestCount){
                               biggestCount = collatzNum(i);
                               biggestNumber = i;
                       }
               }
               System.out.println(biggestNumber);
               System.out.println(biggestCount);
       }
       public static int collatzNum(long l) {
               int count = 1;
               while(l>1){
                       if(l%2 ==0){
                               l=l/2;
                       }
                       else {
                               l=3*l+1;
                       }
                       count ++;
               }
               return count;
       }
}