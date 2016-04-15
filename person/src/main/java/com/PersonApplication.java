package com;


import com.domain.Person;
import com.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class PersonApplication {

    private static final Logger log = LoggerFactory.getLogger(PersonApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(PersonApplication.class);
    }

    @Bean
    public CommandLineRunner demo(PersonRepository repository) {
        return (args) -> {
            // save a couple of customers
            repository.save(new Person("Jack", "Bauer"));
            repository.save(new Person("Chloe", "O'Brian"));
            repository.save(new Person("Kim", "Bauer"));
            repository.save(new Person("David", "Palmer"));
            repository.save(new Person("Michelle", "Dessler"));

            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (Person Person : repository.findAll()) {
                log.info(Person.toString());
            }
            log.info("");

            // fetch an individual Person by ID
            Person Person = repository.findOne(1L);
            log.info("Person found with findOne(1L):");
            log.info("--------------------------------");
            log.info(Person.toString());
            log.info("");

            // fetch customers by last name
            log.info("Person found with findByLastName('Bauer'):");
            log.info("--------------------------------------------");
            for (Person bauer : repository.findByLastName("Bauer")) {
                log.info(bauer.toString());
            }
            log.info("");
        };
    }

}