package com.webservice;

import com.webservice.model.Champions;
import com.webservice.repository.ChampionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@SpringBootApplication(scanBasePackages = "com")
@EnableJpaRepositories("com.*")
@ComponentScan(basePackages = { "com.*" })
@EntityScan("com.*")
@Configuration
public class LolChampionApiApplication  {


    private final ChampionsRepository championsRepository;

    @Autowired
    public LolChampionApiApplication(ChampionsRepository championsRepository) {
        this.championsRepository = championsRepository;
    }
    public static void main(String[] args) {
        SpringApplication.run(LolChampionApiApplication.class, args);


    }


}
