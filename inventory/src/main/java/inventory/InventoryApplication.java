package inventory;

import inventory.Entity.Product;
import inventory.Repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProductRepository productRepository){
        return args -> {
            productRepository.save(new Product(null,"Ordi HP 564",7800));
            productRepository.save(new Product(null,"Impri Epson 11",800));
            productRepository.save(new Product(null,"Laptop 564",900));
        };
    }

}
