package batista.roy.spring6section3;

import batista.roy.spring6section3.controller.MyController;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring6Section3Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(Spring6Section3Application.class, args);

		System.out.println("I´m in Spring Section Main");

		MyController myController = ctx.getBean(MyController.class);

		System.out.println(myController.sayHello());
	}

}

