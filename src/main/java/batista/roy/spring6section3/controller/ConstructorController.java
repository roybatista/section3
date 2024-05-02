package batista.roy.spring6section3.controller;

import batista.roy.spring6section3.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorController {

    private final GreetingService greetingService;

    @Autowired
    public ConstructorController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greetings() {
        return greetingService.sayHellow();
    }
}
