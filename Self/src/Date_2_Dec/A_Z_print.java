package Date_2_Dec;

public class A_Z_print {

	public static void main(String[] args) {
		int n = 26;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print((char) (j + 64) + " ");
			}
			System.out.println();
		}

	}

}
