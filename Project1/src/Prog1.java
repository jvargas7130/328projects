
public class Prog1 {

	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		for (int i = 1; i <= 8; i++) {

			num = fib(i);
			sum = sum +num;
			System.out.println(sum);
		}
		//System.out.println(sum);
	}

	

	public static int fib(int n) {

		if (1 == n || 2 == n)

		{

			return 1;

		}

		else

		{

			return fib(n - 1) + fib(n - 2);

		}

	}

}
