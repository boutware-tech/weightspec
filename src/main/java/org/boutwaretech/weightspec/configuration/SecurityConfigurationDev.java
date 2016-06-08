package org.boutwaretech.weightspec.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@Profile(Profiles.DEV)
public class SecurityConfigurationDev extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception { 
        httpSecurity.authorizeRequests().antMatchers("/").permitAll().and().authorizeRequests()
                .antMatchers("/console/**").permitAll()  // H2 database console
                .and().formLogin().loginPage("/login").permitAll()
                .and().logout().permitAll();

        // NOT FOR PRODUCTION!!!
        httpSecurity.csrf().disable();
        httpSecurity.headers().frameOptions().disable();
    }
    
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("user").password("password").roles("USER");
        auth.inMemoryAuthentication().withUser("admin").password("admin").roles("ADMIN");
    }
}
