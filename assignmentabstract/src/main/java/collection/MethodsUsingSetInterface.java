package collection;

import java.util.HashSet;
import java.util.Set;

public class MethodsUsingSetInterface {
	static Set sobj1=new HashSet();
	static Set<Integer> sobj2=new HashSet();
	
	public static void add() {
		sobj1.add("String");
		sobj1.add(10);
		sobj1.add(10.3);
		sobj1.add(10.3);
		//generic
		//sobj2.add(10.3);//cannot add double to integer type
		sobj2.add(10);//duplicates
//		sobj2.add(10);
//		sobj2.add(10);
		sobj2.add(20);
		sobj2.add(30);
		sobj2.add(40);
		
		System.out.println(sobj1);
		System.out.println(sobj2);
		
	}
	public static void remove() {
		//here remove will not take index, instead it will take the element itself
		sobj1.remove(10);
		System.out.println(sobj1);
		sobj2.remove(10);
		System.out.println(sobj2);
	}
	public static void contains() {
	

	System.out.println(sobj1.contains(10.3));
	System.out.println(sobj2.contains(10));}
	
	
	public static void size() {
		System.out.println(sobj1.size());
		System.out.println(sobj2.size());}
	
	
	
	
	
	public static void get() {
		
		//System.out.println(sobj1.get(10));//no get method for set
		
	}
	
	

	public static void main(String[] args) {
		add();
		remove();
		contains();
		size();

	}

}
