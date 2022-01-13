package com.kuzmin.quickpoll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@SpringBootApplication
public class QuickPollApplication {

    @Bean("errorMessages")
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource
                = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:errorMessages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

    public static void main(String[] args) {
        SpringApplication.run(QuickPollApplication.class, args);
    }

}
