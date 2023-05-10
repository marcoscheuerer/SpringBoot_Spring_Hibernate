package mao.linatrix.springcoredemo.config;

import mao.linatrix.springcoredemo.common.Coach;
import mao.linatrix.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    public Coach swimCoach()  {
        return new SwimCoach();
    }
}
