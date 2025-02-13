package org.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(JpaConfiguration.class)

@Configuration
public class WebRootConfig {

}
