package dev.danvega.clr;

import dev.danvega.clr.model.Image;
import dev.danvega.clr.repository.ImageRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Order(2)
public class DataLoader implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(DataLoader.class);
    private final ImageRepository repository;

    public DataLoader(ImageRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Loading data from DataLoader...");
        List<Image> images = List.of(new Image("Image 1"), new Image("Image 2"), new Image("Image 3"));
        repository.saveAll(images);
    }
}
