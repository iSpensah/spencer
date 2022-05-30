package col;

import java.util.*;
import fundamentals.Employee;
public class ColClass {
	//java colletions framework link list
	void fun() {
		
		//linked list stores objects
		
		Employee e = new Employee();
		List list = new ArrayList(20);
		list.add(10);
		list.add(10);
		list.add(30);
		list.add(40);
		
		
		for(int cnt=0; cnt<list.size(); cnt++) {  //converting objects to string
			System.out.println(new Integer(list.get(cnt).toString())+100);
		}
		System.out.println("-------------------------");
		
		for(Object x : list) {
			System.out.println(new Integer(x.toString())+100);
		}
		
		Object obj = list.get(2); //getting the object which is 
		Integer x = new Integer(obj.toString());
		
		int test = x+100;
		
		System.out.println(list.size());
		System.out.println(list);
	}
	
	void func() {
		Set list = new HashSet();
		int k = 100;
		
	}
	public static void main (String[] args) {
		ColClass c = new ColClass();
		c.fun();
	}
}