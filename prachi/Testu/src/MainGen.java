import java.util.ArrayList;
import java.util.LinkedList;

public class MainGen {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		Generic.dis(list);
		Generic.display(list);
		//Generic.show(list);
		
		LinkedList<String>linkedList=new LinkedList<>();
		linkedList.add("raj");
		System.out.println(linkedList.indexOf("raj"));
		Generic.dis(linkedList);
		//Generic.display(Linkedlist);
		//Generic.show(list);

	
	
	
	
	}

}
