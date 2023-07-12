package com.example.demo;

import java.lang.reflect.Method;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaBookApplication {

	public static void main(String[] args) {
		
		/*Test test = new Test();
		String methodName = "sub";
		int r=0;
		try {
			Class<?> cls = 
				Class.forName(test.getClass().getName());
			Method m = 
				cls.getDeclaredMethod(methodName, 
						Integer.class);
			r =(Integer)m.invoke(test, 5);
			System.out.println(r);
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}*/
		
//		int r= test.add(5);

		
		SpringApplication.run(JpaBookApplication.class, args);
	}

}





