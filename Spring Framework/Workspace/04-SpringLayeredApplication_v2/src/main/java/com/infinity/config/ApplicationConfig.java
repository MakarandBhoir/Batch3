package com.infinity.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// This class is used to define the configuration class of the application
@Configuration

// This will scan for component, service, repository, controller, rest controller etc.
// and add them inside application context.
@ComponentScan({"com.infinity.model", "com.infinity.service", "com.infinity.dao"})
public class ApplicationConfig {
	
}
