package com.batista.spring6section3a.model;

import com.batista.spring6section3a.controller.Faux;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("dev")
@SpringBootTest
class DataSourceDevTest {

    @Autowired
    Faux faux;

    @Test
    void getDataSourceString() {
        faux.getDataSource();
    }
}