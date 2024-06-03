package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
	
	
	public static  void methodTest() {
		List<String> obj=new ArrayList();
		obj.add("Apple");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Melon");
		obj.add("Berry");
		
		System.out.println(obj);
		
		Iterator itr=obj.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		itr.remove();
	System.out.println(obj);
		
	}

	public static void main(String[] args) {
		
		methodTest();
	}

}
