import java.util.LinkedList;


public class iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> y = new LinkedList<String>();

		y.add("hariwa");
		y.add("ali");
		y.add("asad");
		for (int i = 0; i <y.size(); i++) {
			System.out.print(y.get(i)+"\t");
			
		}
	}

}
