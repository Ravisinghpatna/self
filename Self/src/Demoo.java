import java.util.ArrayList;
import java.util.Collections;

public class Demoo {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("ravi");
		al.add("amit");
		al.add("raushan");
		al.add("sumit");
		al.add("dinesh");
		al.add("dashrath");

		System.out.println(al);

		
		Collections.shuffle(al);
		Collections.sort(al);
		System.out.println(al);


	}
}
