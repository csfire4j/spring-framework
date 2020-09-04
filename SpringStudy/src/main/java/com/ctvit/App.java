package com.ctvit;

import com.ctvit.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		UserService service = (UserService) annotationConfigApplicationContext.getBean(UserService.class);
		service.query();
	}
}
