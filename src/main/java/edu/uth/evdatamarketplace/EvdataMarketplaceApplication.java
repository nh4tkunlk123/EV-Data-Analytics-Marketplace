package edu.uth.evdatamarketplace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "edu.uth.evdatamarketplace")
@EnableJpaRepositories(basePackages = "edu.uth.evdatamarketplace.repository")
@EntityScan(basePackages = "edu.uth.evdatamarketplace.model")
public class EvdataMarketplaceApplication {
    public static void main(String[] args) {
        SpringApplication.run(EvdataMarketplaceApplication.class, args);
    }
}
