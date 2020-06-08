package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "com.advancedjava.springtraining")
@ImportResource("classpath:application-context.xml")
public class AppConfig {
}