package server;

import org.springframework.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import storage.FileSystemStorageService;

@SpringBootApplication
public class Application{

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("http://localhost:8080");
    }

    @Bean
    CommandLineRunner init(FileSystemStorageService storageService) {
        return (args) -> {
            storageService.init();
        };
    }
}
