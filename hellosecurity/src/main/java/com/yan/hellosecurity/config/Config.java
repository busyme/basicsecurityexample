package com.yan.hellosecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@ComponentScan("com.yan.hellosecurity")
@EnableWebMvc
@Import({ SecurityConfig.class })
public class Config extends WebMvcConfigurerAdapter {
	
	@Bean
	public UrlBasedViewResolver urlBasedViewResolver(){
		
		UrlBasedViewResolver urlBasedViewResolver = new UrlBasedViewResolver();
		urlBasedViewResolver.setPrefix("/WEB-INF/jsp/");
		urlBasedViewResolver.setSuffix(".jsp");
		urlBasedViewResolver.setViewClass(JstlView.class);
		return urlBasedViewResolver;
		
	}	

}