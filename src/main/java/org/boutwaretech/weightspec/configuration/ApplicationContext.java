package org.boutwaretech.weightspec.configuration;

import org.boutwaretech.weightspec.services.impl.CurrentTimeDateTimeService;
import org.boutwaretech.weightspec.services.iface.DateTimeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("org.boutwaretech.weightspec")
@Import({ PersistenceContext.class })
public class ApplicationContext {

    // @Profile(Profiles.APPLICATION)
    @Bean
    DateTimeService currentTimeDateTimeService() {
        return new CurrentTimeDateTimeService();
    }
}
