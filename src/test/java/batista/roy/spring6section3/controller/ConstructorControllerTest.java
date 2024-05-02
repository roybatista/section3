package batista.roy.spring6section3.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConstructorControllerTest {

    @Autowired
    ConstructorController controller;

    @Test
    void greetings() {
        System.out.println(controller.greetings());
    }
}