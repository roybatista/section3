package com.batista.spring6section3a.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("dev")
@SpringBootTest
class FauxTest {

    @Autowired
    Faux faux;

    @Test
    void getDataSource() {

        System.out.println(faux.getDataSource());
    }
}