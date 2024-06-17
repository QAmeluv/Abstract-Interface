package examinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionExample {
	
	public static void add() {
		ArrayList<Integer> arraylist=new ArrayList();
		//adding elements
		arraylist.add(13);
		arraylist.add(13);
		arraylist.add(12);
		arraylist.add(15);
		
		System.out.println("Is 15  present in the array : "+arraylist.contains(15));
		
		Collections.sort(arraylist);// to sort
		
		System.out.println("Sorted array is "+arraylist);
        Iterator itr=arraylist.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
		
	}

	public static void main(String[] args) {
		
		add();
	}

}
