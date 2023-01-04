package kr.co.ch02.sub2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		
		Computer computer = context.getBean(Computer.class);
		computer.show();
	}
}
