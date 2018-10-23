package com.lksiezop.config.liquibase.customera;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

/**
 * Created by Lukasz on 2018-10-23.
 */
@Configuration
@Profile("customera")
class ProfileA {

    @Bean
    public SpringLiquibase liquibase(DataSource dataSource) {
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setChangeLog("classpath:liquibase/customera/masterchangelog.xml");
        liquibase.setDataSource(dataSource);
        return liquibase;
    }


}
