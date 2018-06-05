package com.yibaijin.service.boot.web.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    DataSource dataSource;

    Logger logger = LogManager.getLogger();



    @Autowired
    public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().withUser("marissa").password("{noop}koala").roles("USER").and().withUser("paul")
//                .password("{noop}emu").roles("USER");
        auth.jdbcAuthentication().dataSource(dataSource).passwordEncoder(NoOpPasswordEncoder.getInstance());
    }

    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/webjars/**", "/images/**", "/oauth/uncache_approvals", "/oauth/cache_approvals");
    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        // @formatter:off
//        http
//                .authorizeRequests()
//                .antMatchers("/oauth/**").authenticated()
//                .antMatchers("/login.jsp").permitAll()
//                .anyRequest().hasRole("USER")
//                .and()
//                .exceptionHandling()
//                .accessDeniedPage("/login.jsp?authorization_error=true")
//                .and()
//                // TODO: put CSRF protection back into this endpoint
//                .csrf()
//                .requireCsrfProtectionMatcher(new AntPathRequestMatcher("/oauth/authorize"))
//                .disable()
//                .logout()
//                .logoutUrl("/logout")
//                .logoutSuccessUrl("/login.jsp")
//                .and()
//                .formLogin()
//                .loginProcessingUrl("/login")
//                .failureUrl("/login.jsp?authentication_error=true")
//                .loginPage("/login.jsp");
//        // @formatter:on
//    }
}
