package com.shopmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ShopManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopManagerApplication.class, args);
	}

//	@Configuration
//	@EnableWebMvc
//	public class MvcConfig implements WebMvcConfigurer {
//		@Override
//		public void addResourceHandlers(ResourceHandlerRegistry registry) {
//			registry.addResourceHandler("/**")
//					.addResourceLocations("classpath:/static/");
//		}
//	}


}
