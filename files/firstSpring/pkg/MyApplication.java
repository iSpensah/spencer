package pkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {

	public static void main(String s[])
	{
		/*Address objAddress = new Address();
		objAddress.setState("CF");
		objAddress.setStreet("ABC Street");
		objAddress.setPincode("565555");
		
		Employee obj = new Employee();
		obj.setEid(100);
		obj.setEname("George");
		obj.setEsalary(20000);
		obj.setEaddress(objAddress);
		*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml"); /*create spring container 
	load spring in the memory */
		Employee obj = (Employee)context.getBean("empBean");
		obj.displayEmployee();
		
	}
}
