package com.lksiezop.config.liquibase;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by Lukasz on 2018-10-23.
 */
@Configuration
class LiquibaseConfig {


    @Bean
    public SpringLiquibase liquibase(DataSource dataSource) {
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setChangeLog("classpath:liquibase/dbchangelog.xml");
        liquibase.setDataSource(dataSource);
        return liquibase;
    }



}
