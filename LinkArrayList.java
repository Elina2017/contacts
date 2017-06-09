import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> y = new LinkedList<String>();

		y.add("hariwa");
		y.add("ali");
		y.add("asad");
		System.out.println(y);
		y.addFirst("hamaed");
		System.out.println(y);

		y.removeLast();
		System.out.println(y);
		y.add(1, "mahamaood");
		System.out.println(y);
		y.addFirst("ehsan");
		System.out.println(y);
		y.removeFirst();
		System.out.println(y);
		
	}

}
