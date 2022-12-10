package StringPractice;
import java.util.Scanner;
public class S1 {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the name");
//		String st = sc.nextLine();
		String st = "ravi   sin gh   patn a 2  7b @ g ma i l .  co m  ";
		st = st.replaceAll("\\s", "");
		System.out.println(st);
	}

}
