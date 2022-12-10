package OCTOBER;

public class Pattern4 {

	public static void main(String[] args) {
		int n = 5 ;

		//first line up
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}

			System.out.print("  ");

			for (int j = i; j <= 2 * n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.print("  ");

			for (int j = i; j <= 2 * n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.print(" ");

			System.out.println();
		}

		// first line down

		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}

			System.out.print("  ");

			for (int j = i; j <= 2 * n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.print("  ");

			for (int j = i; j <= 2 * n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.print(" ");

			System.out.println();

		}

		// Second line up

		System.out.println();

		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= 2 * n-4 ; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}

			System.out.print("  ");

			for (int j = i; j <= 2 * n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.print("  ");

			System.out.println();
		}


		//second line Down

		for (int i = n - 1; i >= 1; i--) {
			
			for (int j = 1; j <= 2 * n-4 ; j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}

			System.out.print("  ");

			for (int j = i; j <= 2 * n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.print("  ");

			for (int j = i; j <= 2 * n - i; j++) {
				System.out.print(" ");
			}
			
			System.out.print(" ");

			System.out.println();

		}
		
		System.out.println();
		
		//third line up
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= 3 * n-3 ; j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}


			System.out.println();
		}

		// third line down

		for (int i = n - 1; i >= 1; i--) {
			
			for (int j = 1; j <= 3 * n-3 ; j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}


			System.out.print(" ");

			System.out.println();

		}



	}
}
