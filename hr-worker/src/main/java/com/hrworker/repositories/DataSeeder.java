package com.hrworker.repositories;

import com.hrworker.entities.Worker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataSeeder {

     @Bean
     CommandLineRunner seedData(WorkerRepository workerRepository) {
         return args -> {
             if(workerRepository.count() > 0) {
                 return;
             }

             workerRepository.saveAll(List.of(
                     Worker.builder().name("Bruno").dailyIncome(100.0).build(),
                     Worker.builder().name("Zeus").dailyIncome(200.0).build(),
                     Worker.builder().name("Brenda").dailyIncome(300.0).build()
             ));
         };
     }
}
