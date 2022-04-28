package dev.drzymala.speedysalesman.configuration;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@AllArgsConstructor
public class SpeedySalesmanSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .authorizeRequests()
                .mvcMatchers(HttpMethod.GET, "/error", "/swagger-ui.html","/").permitAll()
                .mvcMatchers(HttpMethod.POST, "/pathfinder", "/register").permitAll()
                .and()
                .httpBasic();

        http.csrf().disable();
    }
}
