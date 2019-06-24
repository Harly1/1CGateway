package ru.creditpilot.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public ViewResolver getHtmlViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/templates/html/");
        resolver.setSuffix(".html");
        return resolver;
    }

}