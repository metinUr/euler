
/*

Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

 */
package q002;

public class Q002 {

	public static void main(String[] args) {
		long sum = 0;
		int fibo = 2, a = 1, b = 2;
		
		while (fibo < 4000000){
			if (fibo % 2 == 0)
				sum += fibo;
			
			fibo = a + b;
			a = b;
			b = fibo;
		}
		
		System.out.println(sum);
	}

}
