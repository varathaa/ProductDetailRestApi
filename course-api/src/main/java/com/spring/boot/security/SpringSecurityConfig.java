package com.spring.boot.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;



@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{
	


	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception 
	{
		
		
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode("productpass");
		String hashedPassword2 = passwordEncoder.encode("configpass");
		
		
     	auth.inMemoryAuthentication()
		.withUser("productuser").password(hashedPassword).roles("USER")
		.and()
		.withUser("configuser").password(hashedPassword2).roles("ADMIN"); //pass
     	
		
	}
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
    protected void configure(HttpSecurity http) throws Exception 
	{
		
		
		http
			.csrf().disable()
			.authorizeRequests()
			.antMatchers("/api/getproductdetails").hasRole("USER")
			.antMatchers("/api/getconfigdetails").hasRole("ADMIN")
			.anyRequest().authenticated()
			.and()
			.httpBasic();
        
    }
	
	
	}
