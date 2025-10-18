package edu.uth.evdatamarketplace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EvdataMarketplaceApplication {
    public static void main(String[] args) {
        SpringApplication.run(EvdataMarketplaceApplication.class, args);
        System.out.println("EV Data Analytics Marketplace đang chạy trên http://localhost:8080");
    }
}
