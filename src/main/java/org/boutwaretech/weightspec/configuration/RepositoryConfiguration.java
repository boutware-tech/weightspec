package org.boutwaretech.weightspec.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = { "org.boutwaretech.weightspec.domain" })
@EnableJpaRepositories(basePackages = { "org.boutwaretech.weightspec.repositories" })
@EnableTransactionManagement
public class RepositoryConfiguration {

}
