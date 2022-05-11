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
@Order(1)
public class AnotherDataLoader implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(DataLoader.class);
    private final ImageRepository repository;

    public AnotherDataLoader(ImageRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Loading data from AnotherDataLoader...");
        List<Image> images = List.of(new Image("Image 4"), new Image("Image 5"), new Image("Image 6"));
        repository.saveAll(images);
    }
}
