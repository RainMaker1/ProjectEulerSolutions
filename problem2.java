//Problem #2
//By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
public class example {
	public static void main(String[] args) {
		int sum=0;
		int i=0;
		while(fib(i)<4000000) {
			if(fib(i)%2 == 0){
				sum +=fib(i);
			}
			i++;
		}
		System.out.println(sum);
	}
	public static int fib(int n) {
        if (n < 2) {
        	return n;
        }
        else {
        	return fib(n-1)+fib(n-2);
        }
	}
}