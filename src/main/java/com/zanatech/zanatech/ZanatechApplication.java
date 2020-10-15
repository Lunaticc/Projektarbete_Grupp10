package com.zanatech.zanatech;

import com.zanatech.zanatech.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class ZanatechApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZanatechApplication.class, args);
    }

}
