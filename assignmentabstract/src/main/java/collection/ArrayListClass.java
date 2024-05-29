package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {
	
	public static void nongeneric() {
		ArrayList array=new ArrayList();//nongeneric array list
		array.add("String");
		array.add(20);
		array.add(50);
		array.add("3.4f");
			
		System.out.println(array);
		
	}
	
	public static void generic() {
		ArrayList<Integer> array=new ArrayList();//generic 
		array.add(10);
		array.add(20);
		array.add(30);
		array.add(40);
//		array.add("CGFy"); String not allowed in Integer array list
		
		System.out.println(array);
		//remove an eleemt
		array.remove(0);
		array.remove(2);
		System.out.println(array);
		
		//size of arraylist
		
		System.out.println(array.size());
		array.add(200);
		array.add(300);
		array.add(400);
		System.out.println(array);
		
		// to add all teh elements to another collection-use add all
		//-copying all teh collections objects to another collect
		ArrayList<Integer> array2=new ArrayList();
		System.out.println(array2);
		array2.addAll(array);
		System.out.println(array2);
		
		//removinf all elements from a collection
		
		array.removeAll(array);
		System.out.println("remove"+array);
		
		//by default it allows duplicate- but i should restrict
		// to check if an element is present.
		
		boolean flag= array2.contains(200);
		
		System.out.println(flag);
		
		//get an object from the array
		
		System.out.println(array2.get(4));
		//get index of an element
		
		//to do in list
		
	}
	
	public static void listgeneric() {
		List<Integer> listObject=new ArrayList();
		listObject.add(10);
		listObject.add(20);
		listObject.add(30);
		System.out.println(listObject);
		
		
		
	}
	
	public static void studyingMethods() {
		
	}

	public static void main(String[] args) {
//		nongeneric();
		generic();
//		listgeneric();

	}

}




