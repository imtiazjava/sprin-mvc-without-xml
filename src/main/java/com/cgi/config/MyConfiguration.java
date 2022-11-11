package com.cgi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.cgi")
public class MyConfiguration extends WebMvcConfigurerAdapter {

	
	
	@Bean
	public ViewResolver getResolver() {
		InternalResourceViewResolver r=new InternalResourceViewResolver();
		r.setPrefix("/WEB-INF/views/");
		r.setSuffix(".jsp");
		return r;
	}
}
