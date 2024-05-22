package com.batista.spring6section3a.model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class DataSourceProd implements DataSource{
    @Override
    public String getDataSourceString() {
        return "Data Source String for PROD";
    }
}
