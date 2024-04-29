package batista.roy.spring6section3.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("I´m in My Controller");
        return "Hellow all";
    }
}
