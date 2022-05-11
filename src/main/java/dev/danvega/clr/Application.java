package dev.danvega.clr;

import dev.danvega.clr.model.Image;
import dev.danvega.clr.repository.ImageRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    public CommandLineRunner runner(ImageRepository repository) {
//        return args -> {
//            List<Image> images = List.of(new Image("Image 1"), new Image("Image 2"), new Image("Image 3"));
//            repository.saveAll(images);
//        };
//    }

}
