package Date_2_Dec;

public class PerfectNO {

	public static void main(String[] args) {
		int n = 28;
		int fact = 1, sum = 0;

		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}

		}
		if (sum == n) {
			System.out.print("Perfect No");
		} else
			System.out.print("Not Perfect");

	}

}
