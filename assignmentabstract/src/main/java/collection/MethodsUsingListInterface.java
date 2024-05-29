package collection;

import java.util.ArrayList;
import java.util.List;

public class MethodsUsingListInterface {
	static List lobj=new ArrayList();
	static List lobj1=new ArrayList<String>();
	public static void add() {
		//non generic list
		lobj.add("String");
		lobj.add(10);
		lobj.add(20.3f);
		lobj.add(67.99);
		lobj.add(true);
		lobj.add(67.99);
		System.out.println(lobj);	
		//generic list
		lobj1.add("Name");
		lobj1.add("Age");
		lobj1.add("post");
		System.out.println(lobj1);	
	}
	
	public static void remove() {
		lobj.remove(5);
		System.out.println(lobj);
		lobj1.remove(0);
		System.out.println(lobj1);
		
//		lobj.removeAll(lobj);
//		lobj1.removeAll(lobj1);
//		System.out.println(lobj);
//		System.out.println(lobj1);
	}
	
	public static void contains() {
		System.out.println(lobj.contains(20.3f));
		System.out.println(lobj1.contains("Age"));
	}
	
	public static void get() {
		System.out.println(lobj.get(1));
		System.out.println(lobj1.get(0));
	}
	
	public static void size() {
		System.out.println(lobj.size());
		System.out.println(lobj1.size());
	}

	public static void main(String[] args) {
		add();
		remove();
		contains();
		get();
		size();

	}

}
