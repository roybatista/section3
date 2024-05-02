package batista.roy.spring6section3.service;

import batista.roy.spring6section3.controller.MyController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayHellow() {
        return "Greetings from Spring Boot!";
    }
}
