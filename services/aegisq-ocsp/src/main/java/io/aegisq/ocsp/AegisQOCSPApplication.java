package io.aegisq.ocsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class AegisQOCSPApplication {

    public static void main(String[] args) {
        SpringApplication.run(AegisQOCSPApplication.class, args);
    }
}
