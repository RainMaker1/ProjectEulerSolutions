// problem 9
//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//Find the product abc.

public class Sample{
    public static void main(String[] args){
        for(int a=1; a<1000; a++){
            for(int b=1; b<1000; b++){
                double d = Math.sqrt((a*a)+(b*b));
                int t = (int)d;
                if(((d-t)<0.000005)&&((a+b+t)==1000)){
                    System.out.println(a +" "+b+" "+t);
                    System.out.println(a*b*t);

                }
            }
        }                            
    }         
}