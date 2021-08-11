package Inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

	public static void main(String arg[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("configBatch.xml");
		Batch objct=(Batch)context.getBean("batchStd");
		System.out.println(objct.toString());
	}
}
