package com.batista.spring6section3a.controller;

import com.batista.spring6section3a.model.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Faux {


    private final DataSource dataSource;

    public Faux(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String getDataSource() {
        return dataSource.getDataSourceString();
    }

}
