package batista.roy.spring6section3;

import batista.roy.spring6section3.controller.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6Section3ApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController controller;



	@Test
	public void getHellowFromCotntext(){
		MyController myController = applicationContext.getBean(MyController.class);
		System.out.println("From Context");
		System.out.println(myController.sayHello());
	}

	@Test
	public void getHellowFromMyController(){
		System.out.println("From Controller");
		System.out.println(controller.sayHello());
	}


	@Test
	void contextLoads() {
	}

}
