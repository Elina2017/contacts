import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class itearatlist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> y = new LinkedList<String>();

		y.add("hariwa");
		y.add("ali");
		y.add("asad");
		printList(y);
		
	}
	public static void printList(LinkedList<String> x){
	//	Iterator<String> ite = x.iterator();
		ListIterator<String> ite = x.listIterator(x.size());
//		while(ite.hasNext()){
//			System.out.print(ite.next()+"\t");
//			
//			
//		}
		while(ite.hasPrevious()){
			System.out.print(ite.previous()+"\t");
		}
		
	}

}
