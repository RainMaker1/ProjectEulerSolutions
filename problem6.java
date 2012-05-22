//Problem #6 
//What is the difference between the sum of the
/squares and the square of the sums of the first 100 natural numbers?
public class example {
	public static void main(String[] args) {
		int one = 0, two = 0;
		for (int i =0; i < 101; i++){
			one += i;
		}
		one = one * one;
		for (int i =0; i< 101; i++){
			two += (i *i);
		}
		System.out.println(one - two);
	}
}