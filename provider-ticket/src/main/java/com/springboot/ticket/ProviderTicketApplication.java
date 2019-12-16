package com.springboot.ticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.Environment;
import util.EmbeddedZooKeeper;

@EnableAutoConfiguration
@SpringBootApplication
public class ProviderTicketApplication {

    public static void main(String[] args) {
//        SpringApplication.run(ProviderTicketApplication.class, args);

        new SpringApplicationBuilder(ProviderTicketApplication.class)
                .listeners((ApplicationListener<ApplicationEnvironmentPreparedEvent>) event -> {
                    Environment environment = event.getEnvironment();
                    int port = environment.getProperty("embedded.zookeeper.port", int.class);
                    new EmbeddedZooKeeper(port, false).start();
                })
                .run(args);
    }

}
