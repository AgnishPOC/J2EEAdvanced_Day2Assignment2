package Day2.Assignment2;

public class primeNumber {

	public static void main(String[] args) {
		int flag = 0;
		int num = 1;
		System.out.println("**Prime Number between 1 to 100**");
		while (num <= 100) {
			for (int j = 2; j < num; j++) {
				if (num % j == 0)
					flag = 1;
			}
			if (flag != 1)
				System.out.print(num+" ");
			num++;
			flag = 0;
		}

	}
}
