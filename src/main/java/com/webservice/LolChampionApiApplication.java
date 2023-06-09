package com.webservice;

import com.library.lolmodel.config.DataSourceConfiguration;
import com.library.lolmodel.models.Champions;
import com.library.lolmodel.repository.ChampionsRepository;
import com.scrapper.scraperhtmlbatch.config.BatchConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@SpringBootApplication
@Import(BatchConfiguration.class)
public class LolChampionApiApplication  {

    public static void main(String[] args) {
        SpringApplication.run(LolChampionApiApplication.class, args);


    }


}
